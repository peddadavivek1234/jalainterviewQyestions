package interfaces;

//Interface with a default method
interface Jala_06 {
 // Default method
 default void defaultMethod() {
     System.out.println("This is a default method");
 }
}


public class default_interface implements Jala_06 {
	// No need to override the default method
    public static void main(String[] args) {
    	default_interface if6 = new default_interface();
        // Calling the default method from the interface
        if6.defaultMethod();
    }
}
