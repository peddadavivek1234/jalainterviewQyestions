package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class insert_specific_position {
	  // Method to insert an element at a specific position in the array.
    // Takes array, index, and value to be inserted as parameters.
    static void insertElement(int[] arr, int index, int value) {
        // Shift elements to the right starting from the end up to the specified index
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the value at the specified index
        arr[index] = value;
    }

    public static void main(String[] args) {
        int index, value;
        // Declaring and initializing an array
        int[] myArray = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Original Array: " + Arrays.toString(myArray));

        Scanner sc = new Scanner(System.in);
        // User input for index and value to insert
        System.out.print("Enter the index number: ");
        index = sc.nextInt();
        System.out.printf("Enter the value to insert at index myArray[%d]: ", index);
        value = sc.nextInt();
        
        // Calling the insertElement method to perform insertion
        insertElement(myArray, index, value);

        // Printing the modified array after insertion
        System.out.println("Array after inserting element:");
        System.out.println("myArray = " + Arrays.toString(myArray));
    }
}
