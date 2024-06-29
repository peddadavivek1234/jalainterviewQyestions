package constructors;
class ParentClass {
    int rollNo;
    String name;
    String branch;

    // Default constructor
    ParentClass() {
        System.out.println("Student Details");
    }

    // Constructor with one argument (int)
    ParentClass(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No: " + this.rollNo);
    }

    // Constructor with two arguments (String, String)
    ParentClass(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
    }
}

public class default_one_two_arguments {
	public static void main(String[] args) {
		// Instantiate the ParentClass to call all constructors
        new ParentClass();            // Calls default constructor
        new ParentClass(317);         // Calls constructor with one int argument
        new ParentClass("Sharan", "CSE"); // Calls constructor with two String arguments
	}
}
