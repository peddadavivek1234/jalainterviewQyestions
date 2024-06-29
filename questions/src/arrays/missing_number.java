package arrays;

import java.util.Arrays;

public class missing_number {
	// Method to find the missing number in a sorted array of 1 to 100
    // Takes an array containing numbers from 1 to 99 as parameter
    static void findMissingNumber(int[] arr) {
        int n = 100; // Total numbers from 1 to 100
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to 100
        int actualSum = Arrays.stream(arr).sum(); // Sum of elements in the given array
        int missingNumber = expectedSum - actualSum; // Calculate the missing number
        System.out.println("Missing number in the array: " + missingNumber);
    }

    public static void main(String[] args) {
        // Declaring and initializing an array with numbers from 1 to 99
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // Example array with missing number 100
        System.out.println("Original Array: " + Arrays.toString(myArray));

        // Calling the method to find the missing number
        findMissingNumber(myArray);
    }
}
