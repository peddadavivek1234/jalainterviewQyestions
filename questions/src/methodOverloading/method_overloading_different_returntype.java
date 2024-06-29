package methodOverloading;

public class method_overloading_different_returntype {
	// Method with int return type
    int calculate(int a, int b) {
        return a + b;
    }

    // Method with double return type
    double calculate(int a, int b) {
        return (double) (a + b);
    }
	public static void main(String[] args) {
		method_overloading_different_returntype modr = new method_overloading_different_returntype();

        // Calling methods with the same name and parameters but different return types
        int result1 = modr.calculate(5, 3);         // Calls the int version of calculate()
        double result2 = modr.calculate(5, 3);     // Calls the double version of calculate()

        System.out.println("Result 1 (int): " + result1);
        System.out.println("Result 2 (double): " + result2);
	}
}
