package loops;
import java.util.Scanner;

public class even_odd_numbers {
	// Method to print even numbers from 1 to n
    static void printEvenNumbers(int n) {
        System.out.println("Even Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for spacing
    }

    // Method to print odd numbers from 1 to n
    static void printOddNumbers(int n) {
        System.out.println("\nOdd Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for spacing
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter any Number: ");
        num = sc.nextInt();
        
        // Print even numbers
        printEvenNumbers(num);
        
        // Print odd numbers
        printOddNumbers(num);
    }
}
