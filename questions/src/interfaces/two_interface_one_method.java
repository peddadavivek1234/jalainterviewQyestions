package interfaces;

//Interface 1
interface Jala_4 {
 void methodOne();
}

//Interface 2
interface Jala_04 {
 void methodTwo();
}

public class two_interface_one_method implements Jala_4, Jala_04  {
	// Implementing the method from interface Jala_4
    @Override
    public void methodOne() {
        System.out.println("This is Method one");
    }

    // Implementing the method from interface Jala_04
    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    // Main method
    public static void main(String[] args) {
    	two_interface_one_method if4 = new two_interface_one_method	();
        // Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
    }
}
