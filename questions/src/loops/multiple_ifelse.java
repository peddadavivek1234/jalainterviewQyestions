package loops;

public class multiple_ifelse {
	public static void main(String[] args) {

        int num1 = 10, num2 = 20, num3 = 30;

        // Executes if num1 is greater than num2 & num3
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the Largest Number");
        }
        // Executes if num2 is greater than num1 & num3
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the Largest Number");
        }
        // Executes if both num1 & num2 are smaller than num3
        else {
            System.out.println(num3 + " is the Largest Number");
        }
    }
}
