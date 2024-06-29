package exceptions;

public class multiple_catch_blocks {
	public static void main(String[] args) {
		 try {
	            int[] a = new int[6];
	            // Trying to access an index out of bounds
	            System.out.println(a[10]); // ArrayIndexOutOfBoundsException
	            // Performing an arithmetic operation that results in division by zero
	            System.out.println(10 / 0); // ArithmeticException
	        } catch (ArithmeticException e) {
	            // Handling ArithmeticException
	            System.out.println("Arithmetic Exception occurs: " + e.getMessage());
	            e.printStackTrace();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handling ArrayIndexOutOfBoundsException
	            System.out.println("ArrayIndexOutOfBounds Exception occurs: " + e.getMessage());
	            e.printStackTrace();
	        } catch (Exception e) {
	            // Handling any other exceptions (parent exception)
	            System.out.println("Parent Exception occurs: " + e.getMessage());
	            e.printStackTrace();
	        } finally {
	            // Finally block is always executed, regardless of whether an exception occurred or not
	            System.out.println("Finally block is executed");
	        }

	        System.out.println("Main method ended");
	}
}
