package interfaces;

//Interface 1
interface Jala_5 {
 void sameMethod();
}

//Interface 2
interface Jala_05 {
 void sameMethod();
}


public class two_interface_same_method implements Jala_5, Jala_05 {
	// Implementing the method from both interfaces
    @Override
    public void sameMethod() {
        System.out.println("This is the same method in both the interfaces");
    }

    // Main method
    public static void main(String[] args) {
    	two_interface_same_method if5 = new two_interface_same_method();
        // Calling the implemented method
        if5.sameMethod();
    }
}
