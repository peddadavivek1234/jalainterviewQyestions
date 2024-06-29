package methodOverloading;

public class method_overloading_different_types {

    // Method with two parameters of type int
    void display(int num1, int num2) {
        System.out.println("Displaying two integers: " + num1 + " and " + num2);
    }

    // Method with two parameters of type double
    void display(double num1, double num2) {
        System.out.println("Displaying two doubles: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        method_overloading_different_types modt = new method_overloading_different_types();

        // Calling methods with different parameter types
        modt.display(5, 3);        // Calls the int version of display()
        modt.display(5.5, 3.3);    // Calls the double version of display()
    }
}
