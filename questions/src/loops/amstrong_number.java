package loops;

import java.util.Scanner;

public class amstrong_number {
	// Method to check if a number is Armstrong or not
    static boolean isArmstrong(int number) {
        int remainder, result = 0;
        int originalNumber = number;

        // Calculate the sum of cubes of each digit
        while (number != 0) {
            remainder = number % 10;
            result += (remainder * remainder * remainder); // Cube of each digit
            number /= 10;
        }

        // Check if the original number is equal to the calculated result
        return originalNumber == result;
    }

    public static void main(String[] args) {
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();

        // Check if the number is Armstrong and print the result
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

        
    }
}
