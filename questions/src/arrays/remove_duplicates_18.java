package arrays;
import java.util.Arrays;

public class remove_duplicates_18 {
	// Method to remove duplicate elements from an array
    // Takes an array and its length as parameters
    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        // Initialize index to store unique elements
        int j = 0;
        
        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {
            // If current element is not equal to next element, add to temp array
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        
        // Add the last element of the original array
        arr[j++] = arr[n - 1];
        
        // Return the length of the new array with unique elements
        return j;
    }

    public static void main(String[] args) {
        // Declaring and initializing an array with duplicates
        int[] arr = {11, 22, 22, 33, 44, 44, 55, 66, 66};
        
        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Get the length of array after removing duplicates
        int n = removeDuplicates(arr, arr.length);
        
        // Print the array after removing duplicates
        System.out.println("Array after removing duplicate values:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
