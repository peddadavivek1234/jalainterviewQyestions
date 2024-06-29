package arrays;
import java.util.Arrays;

public class dupicate_values {
	// Function to find the duplicate values of an array
    static void findDuplicateValues(int[] arr) {
        // Outer loop to iterate through each element in the array
        System.out.println("Duplicate values: ");
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to compare each element with subsequent elements
            for (int j = i + 1; j < arr.length; j++) {
                // If a duplicate is found, print it
                if (arr[i] == arr[j] && i != j) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] myArray = {11, 22, 33, 44, 55, 22, 44, 33};
        // Printing the array as a string
        System.out.println("myArray[] = " + Arrays.toString(myArray));
        // Passing the array to the method to find duplicate values
        findDuplicateValues(myArray);
    }
}
