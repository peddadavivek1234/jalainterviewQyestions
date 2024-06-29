package basic_questions;

public class creating_class_object {
	 //created a method using methodName()
    void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Created an object of Basics_01
    	creating_class_object obj = new creating_class_object();
        // Calling the method
        obj.isMethod();
    }
}
