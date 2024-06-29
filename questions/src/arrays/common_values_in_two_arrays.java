package arrays;
import java.util.Arrays;

public class common_values_in_two_arrays {
	 // Method to find the common values between two arrays
    static void findCommonValues(int[] array1, int[] array2) {
        // Iterating through elements of array1
        for (int num1 : array1) {
            // Iterating through elements of array2
            for (int num2 : array2) {
                // Checking if the current elements are equal
                if (num1 == num2) {
                    // Printing the common value found
                    System.out.println("Common value: " + num1);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = {66, 55, 77, 11, 88};

        // Printing the arrays
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Finding common values between array1 and array2
        findCommonValues(array1, array2);
    }
}
