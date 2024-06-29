package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class copy_array {
	// Method to copy an array to another array
    static void copyArray(int[] sourceArray) {
        // Creating a new array with the same length as sourceArray
        int[] targetArray = new int[sourceArray.length];

        // Copying elements from sourceArray to targetArray
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        // Printing the copied array
        System.out.println("Copied array: " + Arrays.toString(targetArray));
    }

    public static void main(String[] args) {
        // Initializing Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Getting the number of elements from user
        System.out.print("Enter the number of elements you want to store: ");
        int numElements = scanner.nextInt();

        // Creating an array to store user input elements
        int[] originalArray = new int[numElements];

        // Getting elements from user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            System.out.printf("originalArray[%d] = ", i);
            originalArray[i] = scanner.nextInt();
        }

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Calling the method to copy the original array to another array
        copyArray(originalArray);

        // Closing Scanner
        scanner.close();
    }

}
