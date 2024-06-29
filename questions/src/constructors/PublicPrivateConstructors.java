package constructors;

public class PublicPrivateConstructors {
	int rollNo;
    String name;
    String clg;
    String city;

    { System.out.println("Student Details"); }

    // Default constructor (default access modifier)
    PublicPrivateConstructors() {
        this(11); // Calls the public constructor
    }

    // Public constructor
    public PublicPrivateConstructors(int rollNo) {
        this("Sharan"); // Calls the private constructor
        this.rollNo = rollNo;
        System.out.println("Roll No: " + rollNo);
    }

    // Private constructor
    private PublicPrivateConstructors(String name) {
        this("ICFAI", "Hyderabad"); // Calls the protected constructor
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Protected constructor
    protected PublicPrivateConstructors(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("College: " + clg);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        // Attempting to call constructors multiple times on the same object instance
        PublicPrivateConstructors c = new PublicPrivateConstructors(); // Creates an object
        // PublicPrivateConstructors c2 = new PublicPrivateConstructors(123); // This line would be a compilation error
        // PublicPrivateConstructors c3 = new PublicPrivateConstructors("John", "New York"); // This line would be a compilation error
    }
}
