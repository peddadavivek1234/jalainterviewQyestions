package exceptions;

public class class_not_found {
	public static void main(String[] args) {
		try {
            // Attempting to load a class that does not exist
            Class.forName("com.exceptions.jala.NonExistentClass");

        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.err.println("ClassNotFoundException caught");
            e.printStackTrace();
        }
	}
}
