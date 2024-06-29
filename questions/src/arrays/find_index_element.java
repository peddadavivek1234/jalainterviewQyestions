package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class find_index_element {
	// Method to find the index of an array element.
    static void findElementIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            // Checks if the given value matches an element in the array
            if (value == arr[i]) {
                System.out.println(value + " is at index " + i);
                return; // Stops further iterations once the index is found
            }
        }
        // If the value is not found in the array
        System.out.println(value + " is not found in the array.");
    }

    public static void main(String[] args) {
        int searchValue;
        // Declaring and initializing an array
        int[] myArray = {11, 22, 33, 44, 55, 66, 77};
        // Printing the array as a string
        System.out.println("myArray[] = " + Arrays.toString(myArray));
        // User input to select a value to find its index in the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to find its index in the array: ");
        searchValue = sc.nextInt();
        // Calling the method to find the index of the specified value in the array
        findElementIndex(myArray, searchValue);
    }
}
