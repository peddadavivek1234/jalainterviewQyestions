package this_super;

public class current_class_this {
	 int num;
	    String name;

	    // Default constructor
	    current_class_this() {
	        // 3. Calling argument constructor of current class using this()
	        this(11, "Sharan");
	    }

	    // Argument constructor
	    current_class_this(int num, String name) {
	        // 1. Printing fields of the current class using this
	        this.num = num;
	        this.name = name;
	        System.out.println("Number: " + this.num + ", Name: " + this.name);
	    }

	    public static void main(String[] args) {
	        // Creating an object to invoke the default constructor
	    	current_class_this ts1 = new current_class_this();
	        // Creating another object to invoke the argument constructor
	    	current_class_this ts2 = new current_class_this(12, "Jala");
	    }

}
