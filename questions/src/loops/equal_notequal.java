package loops;
import java.util.Scanner;

public class equal_notequal {
	// Method to print even numbers using the equal operator (==)
    static void printEvenNumbers(int n) {
        System.out.println("Even Numbers from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to print odd numbers using the not equal operator (!=)
    static void printOddNumbers(int n) {
        System.out.println("Odd Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any Number : ");
        num = sc.nextInt();
        
        // Print even numbers using the equal operator (==)
        printEvenNumbers(num);
        
        // Print odd numbers using the not equal operator (!=)
        printOddNumbers(num);
    }
}
