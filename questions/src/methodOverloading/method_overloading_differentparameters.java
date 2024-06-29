package methodOverloading;

public class method_overloading_differentparameters {

    // Method with one integer parameter
    void printValue(int num) {
        System.out.println("Integer value: " + num);
    }

    // Method with one double parameter
    void printValue(double num) {
        System.out.println("Double value: " + num);
    }

    public static void main(String[] args) {
        method_overloading_differentparameters moe = new method_overloading_differentparameters();

        // Calling methods with different data types
        moe.printValue(10);
        moe.printValue(10.5);
    }
}
