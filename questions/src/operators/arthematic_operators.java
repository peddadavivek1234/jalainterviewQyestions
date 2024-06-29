package operators;

public class arthematic_operators {
	static void add(int x, int y) {
        int sum = x + y;
        System.out.println("Addition of x + y = " + sum);
    }

    static void subtract(int x, int y) {
        int difference = x - y;
        System.out.println("Subtraction of x - y = " + difference);
    }

    static void multiply(int x, int y) {
        int product = x * y;
        System.out.println("Multiplication of x * y = " + product);
    }

    static void divide(int x, int y) {
        if (y != 0) {
            int quotient = x / y;
            System.out.println("Division of x / y = " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        // Calling methods
        add(x, y);
        subtract(x, y);
        multiply(x, y);
        divide(x, y);
    }

}
