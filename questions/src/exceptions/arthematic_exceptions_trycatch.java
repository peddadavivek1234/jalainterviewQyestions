package exceptions;

public class arthematic_exceptions_trycatch {
	public static void main(String[] args) {
		int a = 10, b = 5, c;

        try {
            System.out.println("Inside try block");
            // Attempting division by zero which will throw ArithmeticException
            c = a / b; // This line throws ArithmeticException
            System.out.println("c = " + c); // This line won't execute if exception occurs
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        // This line will execute after catching the exception
        System.out.println("Code after try-catch block");

        // Attempting division by zero again without try-catch block (will cause termination)
        c = a / b;
        System.out.println("This line will not be reached due to unhandled exception");
	}
}
