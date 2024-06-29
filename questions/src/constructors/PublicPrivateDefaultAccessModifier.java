package constructors;

public class PublicPrivateDefaultAccessModifier {
	int rollNo;
    String name;
    String clg;
    String city;

    // Default constructor (default access modifier)
    PublicPrivateDefaultAccessModifier() {
        System.out.println("Inside default constructor");
    }

    // Public constructor
    public PublicPrivateDefaultAccessModifier(int rollNo) {
        this(); // Calling default constructor from within another constructor
        this.rollNo = rollNo;
        System.out.println("Inside public constructor with rollNo: " + rollNo);
    }

    // Private constructor
    private PublicPrivateDefaultAccessModifier(String name) {
        this(317); // Calling public constructor from within a private constructor
        this.name = name;
        System.out.println("Inside private constructor with name: " + name);
    }

    // Protected constructor
    protected PublicPrivateDefaultAccessModifier(String clg, String city) {
        this("John Doe"); // Calling private constructor from within a protected constructor
        this.clg = clg;
        this.city = city;
        System.out.println("Inside protected constructor with college: " + clg + " and city: " + city);
    }

    public static void main(String[] args) {
        // Creating an object and calling constructors
        PublicPrivateDefaultAccessModifier obj = new PublicPrivateDefaultAccessModifier();
        PublicPrivateDefaultAccessModifier obj2 = new PublicPrivateDefaultAccessModifier(123);
        // PublicPrivateDefaultAccessModifier obj3 = new PublicPrivateDefaultAccessModifier("Harvard", "Boston");
        // Uncommenting the above line would cause compilation error since the constructor is protected
    }
}
