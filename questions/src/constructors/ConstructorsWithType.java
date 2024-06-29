package constructors;

public class ConstructorsWithType {
	 int intValue;
	    String stringValue;

	    // Default constructor (default access modifier)
	    public ConstructorsWithType() {
	        System.out.println("Inside default constructor");
	    }

	    // Constructor with an int parameter (public access modifier)
	    public ConstructorsWithType(int intValue) {
	        this(); // Calling default constructor from another constructor
	        this.intValue = intValue;
	        System.out.println("Inside constructor with int value: " + intValue);
	    }

	    // Constructor with a String parameter (private access modifier)
	    private ConstructorsWithType(String stringValue) {
	        this(123); // Calling public constructor from a private constructor
	        this.stringValue = stringValue;
	        System.out.println("Inside constructor with string value: " + stringValue);
	    }

	    // Constructor with both int and String parameters (protected access modifier)
	    protected ConstructorsWithType(int intValue, String stringValue) {
	        this("Hello"); // Calling private constructor from a protected constructor
	        this.intValue = intValue;
	        this.stringValue = stringValue;
	        System.out.println("Inside constructor with int and string values: " + intValue + ", " + stringValue);
	    }

	    public static void main(String[] args) {
	        // Creating objects and calling constructors
	        ConstructorsWithType obj1 = new ConstructorsWithType();
	        ConstructorsWithType obj2 = new ConstructorsWithType(456);
	        // ConstructorsWithType obj3 = new ConstructorsWithType("Java"); // Uncommenting this line would cause compilation error
	        // ConstructorsWithType obj4 = new ConstructorsWithType(789, "Programming"); // Uncommenting this line would cause compilation error
	    }
}
