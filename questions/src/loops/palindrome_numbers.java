package loops;
import java.util.Scanner;

public class palindrome_numbers {
	// A palindrome number is one that remains the same when reversed
    // Eg: 121, 545, 151, 34543. It can also be a string like LOL, MADAM, etc.
    static boolean isPalindrome(int number) {
        int remainder, reverse = 0, temp;
        // Copy the number into a temporary variable and reverse it.
        temp = number;
        while (number > 0) {
            remainder = number % 10; // getting remainder
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        // Compare the temporary number with the reversed number
        // Returns true if temp and reverse are equal
        return temp == reverse;
    }

    public static void main(String[] args) {
        int number;
        System.out.print("Enter a value: ");
        number = new Scanner(System.in).nextInt();
        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is not a Palindrome Number");
        }
    }
}
