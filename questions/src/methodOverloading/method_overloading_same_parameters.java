package methodOverloading;

public class method_overloading_same_parameters {
    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    // Method with the same name and same number of parameters
    void multiply(int a, int b) {
        System.out.println("Multiplying two integers: " + (a * b));
    }

    public static void main(String[] args) {
        method_overloading_same_parameters mos = new method_overloading_same_parameters();

        // Calling the methods with the same number and type of parameters
        mos.add(5, 3);
        mos.multiply(5, 3);
    }
}
