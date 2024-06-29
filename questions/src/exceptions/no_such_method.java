package exceptions;

import java.lang.reflect.Method;
public class no_such_method {
	class E_14 {
	    // Creating a method which receives two integer values as parameters
	    public void addition(int a, int b) {
	        int c;
	        c = a + b;
	        System.out.println(c);
	    }
	}
	public static void main(String[] args) {
		 try {
	            // Load the class E_14 using reflection
	            Class<?> c = Class.forName("com.jala.exceptions.E_14");

	            // Attempt to get the method named "subtraction" with parameters (int, int)
	            // This method does not exist in class E_14, hence NoSuchMethodException will be thrown
	            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
	        }
	        // Catching NoSuchMethodException and ClassNotFoundException together
	        catch (NoSuchMethodException | ClassNotFoundException e) {
	            // Printing the stack trace to see where the exception occurred
	            e.printStackTrace();
	        }
	}
}
