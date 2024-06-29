package operators;

public class increment_decrement_operator {
	 /* Increment Operator : ++ (++a or a++)
     * It increments the value of a variable by 1.
     */
    static void preIncrement(int a, int b) {
        int result;
        result = b + (++a); // Increment a first, then use it in expression
        System.out.println("Values after Pre-Increment a, b : " + a + ", " + result);
    }

    static void postIncrement(int a, int b) {
        int result;
        result = b + (a++); // Use a in expression first, then increment it
        System.out.println("Values after Post-Increment a, b : " + a + ", " + result);
    }

    /* Decrement Operator : -- (--a or a--)
     * It decrements the value of a variable by 1.
     */
    static void preDecrement(int a, int b) {
        int result;
        result = b + (--a); // Decrement a first, then use it in expression
        System.out.println("Values after Pre-Decrement a, b : " + a + ", " + result);
    }

    static void postDecrement(int a, int b) {
        int result;
        result = b + (a--); // Use a in expression first, then decrement it
        System.out.println("Values after Post-Decrement a, b : " + a + ", " + result);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        preIncrement(num1, num2);
        postIncrement(num1, num2);
        preDecrement(num1, num2);
        postDecrement(num1, num2);
    }
}
