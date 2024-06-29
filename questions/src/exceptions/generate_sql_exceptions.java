package exceptions;
//generate_sql_exceptions


import java.sql.*;

/*SQLException :
   It is thrown when there is an error in database access or other SQL-related errors. */
public class generate_sql_exceptions {
    // Database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {

        // Connection and Statement objects for database interaction
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query that causes an SQLException (e.g., table not found)
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM non_existing_table"; // This query will cause an SQLException
            ResultSet rs = stmt.executeQuery(sql);

            // Display the result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");

                // Display values
                System.out.print("ID: " + id);
                System.out.println(", Name: " + name);
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Main method ended");
    }
}
