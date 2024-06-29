package operators;

public class smaller_larger_number {
	public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Using ternary operator to find smaller and larger numbers
        int smaller = (num1 < num2) ? num1 : num2;
        int larger = (num1 > num2) ? num1 : num2;

        // Printing the smaller and larger numbers
        System.out.println("Smaller Number is " + smaller);
        System.out.println("Larger Number is " + larger);

        // Same logic using if-else statements
        if (num1 > num2) {
            System.out.println("Larger Number is " + num1);
        } else {
            System.out.println("Smaller Number is " + num1);
        }
        
        if (num2 > num1) {
            System.out.println("Larger Number is " + num2);
        } else {
            System.out.println("Smaller Number is " + num2);
        }
    }
}
