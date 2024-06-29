package exceptions;

public class number_format {
	public static void main(String[] args) {
		String str = "111ABC";
        try {
            // Trying to convert string with inappropriate format to integer
            int x = Integer.parseInt(str); // This line will throw NumberFormatException
            int y = Integer.valueOf(str); // This line will also throw NumberFormatException
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught!");
            // Printing stack trace to see where the exception occurred
            e.printStackTrace();
        }
	}
}
