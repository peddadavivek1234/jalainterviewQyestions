package exceptions;

public interface null_pointer {
	 // Method to perform length operation on a string, which may be null
    static void simpleNullCheck(String str) {
        // Trying to perform length operation on str which is null
        System.out.println(str.length());
    }

	public static void main(String[] args) {
		String input = null;
        try {
            // Calling method with null string reference
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            // Printing stack trace to see where the exception occurred
            e.printStackTrace();
        }
	}
}
