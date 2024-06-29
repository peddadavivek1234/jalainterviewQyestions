package exceptions;

public class generate_arthematic_exception {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
        try {
            // Attempting division by zero to trigger ArithmeticException
            c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            e.printStackTrace();
        }
	}
}
