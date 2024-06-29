package exceptions;

public class finally_block {
	public static void main(String[] args) {
		 try {
	            // Attempting a division by zero to trigger ArithmeticException
	            int data = 10 / 0;
	            System.out.println(data); // This line will not be reached
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Exception handled");
	            e.printStackTrace();
	        }
	        finally {
	            System.out.println("Finally block is always executed");
	        }
	        System.out.println("Main method ended");
	}
}
