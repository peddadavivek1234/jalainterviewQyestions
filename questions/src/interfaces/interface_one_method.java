package interfaces;

//An interface is declared by using the interface keyword.
interface Jala_01 {
 // An abstract method doesn't have its body, and they are public and abstract
 void oneMethod();
}

public class interface_one_method implements Jala_01  {
	@Override
    public void oneMethod() {
        System.out.println("This is a method implemented from the interface.");
    }

    public static void main(String[] args) {
    	interface_one_method if1 = new interface_one_method();
        // Calling the method implemented
        if1.oneMethod();
    }
}
