package operators;

public class logical_operator {
	public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
        int num3 = 5;

        // Logical AND (&&)
        /* The logical && operator doesn't check the second condition if the
           first condition is false. It checks the second condition only if the first one is true. */
        System.out.println(num1 > num2 && num1 > num3); // true  && true  = true
        System.out.println(num1 < num2 && num1 < num3); // false && false = false
        System.out.println(num1 > num2 && num1 < num3); // true  && false = false

        // Logical OR (||)
        /* The logical || operator doesn't check the second condition if the
           first condition is true. It checks the second condition only if the first one is false. */
        System.out.println(num1 > num2 || num1 > num3); // true  || true  = true
        System.out.println(num1 < num2 || num1 < num3); // false || false = false
        System.out.println(num1 < num2 || num1 > num3); // false || true  = true

        // Logical NOT (!)
        System.out.println(!(num1 > num2)); // NOT true = false
        System.out.println(!(num1 < num2)); // NOT false = true
    }
}
