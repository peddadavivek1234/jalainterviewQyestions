package this_super;

public class argument_constructor_this_call {
	int num;
    String name;

    argument_constructor_this_call() {
        // 3. Calling argument constructor of the current class using this()
        this(11, "Sharan");
    }

    argument_constructor_this_call(int num) {
        // 4. Calling the two-argument constructor of the current class using this()
        this(num, "Default Name");
    }

    argument_constructor_this_call(int num, String name) {
        // 1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println("Number: " + this.num + ", Name: " + this.name);
    }

    public static void main(String[] args) {
        // Creating an object to invoke the default constructor
    	argument_constructor_this_call ts1 = new argument_constructor_this_call();
        // Creating another object to invoke the two-argument constructor
    	argument_constructor_this_call ts2 = new argument_constructor_this_call(12, "Jala");
        // Creating another object to invoke the one-argument constructor
    	argument_constructor_this_call ts3 = new argument_constructor_this_call(15);
    }
}
