package exceptions;

public class string_index_outof_bounds {
	public static void main(String[] args) {
		String str = "Sharan";
        try {
            // Trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1); // This line will throw StringIndexOutOfBoundsException

            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11); // This line will also throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            // Printing stack trace to see where the exception occurred
            e.printStackTrace();
        }
	}
}
