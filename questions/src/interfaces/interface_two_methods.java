package interfaces;

//An interface is declared by using the interface keyword.
interface Jala_02 {
 void methodOne();
 void methodTwo();
}

//Abstract class implementing the interface
abstract class AbstractClass implements Jala_02 {
 // Implementing only one method
 @Override
 public void methodOne() {
     System.out.println("First Method");
 }
}

public class interface_two_methods extends AbstractClass {
	// Main method
    public static void main(String[] args) {
    	interface_two_methods if2 = new interface_two_methods();
        // Calling the method implemented in the abstract class
        if2.methodOne();
        // Note: methodTwo is not implemented in the concrete class
        // and thus cannot be called unless explicitly provided.
    }
}
