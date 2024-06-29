package exceptions;

public class own_exception_message {
	// Method that throws an exception with a custom message
    static void throwCustomException() throws Exception {
        throw new Exception("This is a custom exception message");
    }
	public static void main(String[] args) {
		try {
            // Calling the method that throws the custom exception
            throwCustomException();
        } catch (Exception e) {
            // Catching the exception and printing the custom message
            System.out.println("Caught the custom exception: " + e.getMessage());
            // Printing the stack trace for more detailed information
            e.printStackTrace();
        }

        System.out.println("Main method ended");

	}
}
