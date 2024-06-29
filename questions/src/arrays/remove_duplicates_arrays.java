package arrays;
import java.util.Arrays;

public class remove_duplicates_arrays {
	// Method to remove duplicate elements from an array
    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // Creating a temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Traverse through the original array
        for (int i = 0; i < n - 1; i++) {
            // If current element is not equal to the next element, store it in temp array
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Store the last element of the original array in temp
        temp[j++] = arr[n - 1];

        // Modify the original array to contain only unique elements
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j; // Return the new length of the array after removing duplicates
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] arr = {11, 22, 22, 33, 44, 44, 55, 66, 66};

        // Printing the original array as string
        System.out.println("Original array: " + Arrays.toString(arr));
        int n = arr.length;

        // Calling the method to remove duplicates and updating the array length
        n = removeDuplicates(arr, n);

        // Printing the array after removing duplicate values
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
