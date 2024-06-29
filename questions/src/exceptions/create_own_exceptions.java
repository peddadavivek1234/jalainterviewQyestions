package exceptions;
//Custom exception class extends Exception
class InvalidExamException extends Exception {
 
 // Constructor to initialize the exception message
 InvalidExamException(String msg) {
     super(msg); // Call to the superclass (Exception) constructor
 }
}

public class create_own_exceptions {
	// Method that throws our custom exception
    static void exam(int marks) throws InvalidExamException {
        // Throws exception if marks are less than 40
        if (marks < 40) {
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

	public static void main(String[] args) {
		try {
            // Calling the exam method with marks
            exam(39); // This will throw InvalidExamException
        } catch (InvalidExamException e) {
            // Catching our custom exception
            System.err.println("Custom Exception Caught: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace
        }
	}
}
