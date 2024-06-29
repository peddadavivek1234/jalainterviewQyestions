package this_super;

public class calling_using_this {
	int num;
    String name;

    // Default constructor
    calling_using_this() {
        // 3. Calling argument constructor of current class using this()
        this(11, "Sharan");
    }

    // Argument constructor
    calling_using_this(int num, String name) {
        // 1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println("Number: " + this.num + ", Name: " + this.name);
    }
    public static void main(String[] args) {
        // Creating an object to invoke the default constructor
    	calling_using_this ts1 = new calling_using_this();
        // Creating another object to invoke the argument constructor
    	calling_using_this ts2 = new calling_using_this(12, "Jala");
    }
}
