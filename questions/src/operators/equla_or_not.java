package operators;
import java.util.Scanner;

public class equla_or_not {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Both numbers are different");
        }
    }
}
