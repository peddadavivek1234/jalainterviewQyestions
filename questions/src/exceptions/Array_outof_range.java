package exceptions;

public class Array_outof_range {
	public static void main(String[] args) {
		 // Declaring 4 elements in the String array
        String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};

        // Trying to access index 5 which does not exist
        try {
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught");
            // Print the stack trace to see where the exception occurred
            e.printStackTrace();
        }
	}
}
