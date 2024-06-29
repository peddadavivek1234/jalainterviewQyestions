package arrays;

import java.util.Scanner;

public class contain_specific_values {
	// Method to test if array contains a specific value
    static boolean containsValue(int[] array, int value) {
        // Using for-each loop to iterate through array
        for (int num : array) {
            // Check if current element equals the specified value
            if (num == value) {
                return true;
            }
        }
        // Return false if value not found in array
        return false;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {11, 22, 33, 44, 55};

        // Prompt user to enter value to search in array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search in the array: ");
        int searchValue = scanner.nextInt();
        scanner.close();

        // Check if array contains the specified value
        boolean contains = containsValue(numbers, searchValue);

        // Display result based on whether value was found or not
        if (contains) {
            System.out.println("The array contains the value " + searchValue);
        } else {
            System.out.println("The array does not contain the value " + searchValue);
        }
    }
}
