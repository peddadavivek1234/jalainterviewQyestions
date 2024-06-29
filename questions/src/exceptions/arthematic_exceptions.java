package exceptions;

public class arthematic_exceptions {
	public static void main(String[] args) {
		 int a = 10, b = 5, c;

	        // Attempting division by zero without handling the exception
	        c = a / b; // This line will directly throw ArithmeticException

	        // The following code will not execute because the above line will throw an exception
	        System.out.println("This line will not be reached");
	}
}
