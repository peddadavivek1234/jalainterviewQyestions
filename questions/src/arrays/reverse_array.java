package arrays;
import java.util.Arrays;

public class reverse_array {
	 // Method to reverse an array of integer values
    // Takes an array as parameter and prints the reversed array
    static void reverseArray(int[] arr) {
        // Creating a new array to store reversed array
        int[] reversedArray = new int[arr.length];
        
        // Reverse the array
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        
        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] myArray = {11, 22, 33, 44, 55};
        
        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(myArray));
        
        // Calling the method to reverse the array
        reverseArray(myArray);
    }
}
