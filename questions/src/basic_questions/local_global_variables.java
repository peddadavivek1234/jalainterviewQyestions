package basic_questions;

public class local_global_variables {
	 // Instance variable is declared inside the class but outside the body of the method.
    int a = 11;
    void localVariable() {
        //Local variables are declared in methods, constructors, or blocks.
        int a = 22;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
    	local_global_variables obj = new local_global_variables();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
    }
}
