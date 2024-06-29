package interfaces;


//Interface with a single method
interface Jala_7 {
 void methodOne();
}

//Inherited interface extending the first interface
interface Jala_07 extends Jala_7 {
 void methodTwo();
}

public class inherit_inheritance implements Jala_07  {
	 // Override method of interface Jala_7
    @Override
    public void methodOne() {
        System.out.println("This is the first method");
    }

    // Override method of inherited interface Jala_07
    @Override
    public void methodTwo() {
        System.out.println("This is the second method");
    }

    public static void main(String[] args) {
        // Creating an object of InheritedInterface
    	inherit_inheritance if7 = new inherit_inheritance();
        // Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}
