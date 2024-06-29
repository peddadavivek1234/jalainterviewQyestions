package interfaces;


//Public interface with fields and methods
public interface InterfacePublicFieldsMethod {
 // All fields in an interface are public, static, and final by default
 int num = 111; // Value assigned to the field

 // Method declaration
 public void myMethod();
}

public class jala_08 implements InterfacePublicFieldsMethod {
	// Implementing the method declared in the interface
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }

    // Main method
    public static void main(String[] args) {
    	jala_08 j = new jala_08();
        // Printing the values of the interface fields
        System.out.println(InterfacePublicFieldsMethod.num);
        // Calling the interface method
        j.myMethod();
    }
}
