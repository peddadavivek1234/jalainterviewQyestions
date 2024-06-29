package loops;
import java.util.Scanner;

public class even_numbers_switch {
	public static void main(String[] args) {
        int number;
        System.out.print("Enter a number: ");
        number = new Scanner(System.in).nextInt();

        // Using switch to check if the number is even or odd based on remainder
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an Even Number");
                break;
            case 1:
                System.out.println(number + " is an Odd Number");
                break;
        }
    }
}
