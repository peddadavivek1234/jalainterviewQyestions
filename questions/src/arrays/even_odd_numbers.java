package arrays;
import java.util.Arrays;

public class even_odd_numbers {
	// Method to find number of even numbers in an array
    static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to find number of odd numbers in an array
    static int countOddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("Array: " + Arrays.toString(arr));

        // Finding and printing number of even and odd numbers
        int evenCount = countEvenNumbers(arr);
        int oddCount = countOddNumbers(arr);

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
