package arrays;
import java.util.Arrays;
import java.util.Scanner;


public class remove_specific_element {
	// Method to remove a specific element from an array
    public static int[] removeElement(int[] arr, int index) {
        // If the array is empty or the index is out of array range, return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        // Create a new array with size one less than the original array
        int[] modifiedArray = new int[arr.length - 1];

        // Copy elements from the original array to the new array, excluding the specified index
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue; // Skip the element at the specified index
            }
            modifiedArray[k++] = arr[i]; // Copy elements except the removed one
        }

        // Return the modified array
        return modifiedArray;
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] arr = { 11, 22, 33, 44, 55 };

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Prompt user to select an index to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Select an index to remove an element from the array: ");
        int index = sc.nextInt();

        // Remove the element at the specified index
        arr = removeElement(arr, index);

        // Print the array after removing the element
        System.out.println("Array after removing element at index " + index + ": " + Arrays.toString(arr));
    }
}
