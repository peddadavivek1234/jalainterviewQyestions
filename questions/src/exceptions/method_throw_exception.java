package exceptions;

public class method_throw_exception {
	// Method that throws a RuntimeException
    static void throwException() {
        throw new RuntimeException("Throwing exception");
    }
	public static void main(String[] args) {
		// Calling the method that throws an exception without using try-catch block
        throwException();
	}
}
