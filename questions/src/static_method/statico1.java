package static_method;

public class statico1 {
	// Static variables
    static int staticVar1 = 11;
    static int staticVar2 = 22;

    // Instance variables
    int instanceVar1 = 33;
    int instanceVar2 = 44;

    // Static method: Prints instance variables
    static void printInstanceVariables() {
        // Creating an object to access instance variables
        statico1 obj = new statico1();
        System.out.println("Instance variables in static method: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }

    // Instance method: Prints static variables
    void printStaticVariables() {
        System.out.println("Static variables in instance method: " + staticVar1 + ", " + staticVar2);
    }

    // Static method: Calls instance method
    static void callInstanceMethod() {
        // Creating an object to call instance method
        statico1 obj = new statico1();
        obj.printStaticVariables();
    }

    // Instance method: Calls static method
    void callStaticMethod() {
        printInstanceVariables();
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables and methods
        statico1 instance = new statico1();

        // Printing all the static and instance variables in main method
        System.out.println("Static variables in main method: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance variables in main method: " + instance.instanceVar1 + ", " + instance.instanceVar2);

        // Calling static methods
        printInstanceVariables();
        callInstanceMethod();

        // Calling instance methods
        instance.printStaticVariables();
        instance.callStaticMethod();
    }
}
