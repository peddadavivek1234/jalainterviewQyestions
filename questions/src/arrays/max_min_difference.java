package arrays;
import java.util.Arrays;

public class max_min_difference {
	// Method to get the difference of largest and smallest value
    static void getDifferenceOfMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int difference;

        // Finding the maximum and minimum values in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Calculating the difference between the maximum and minimum values
        difference = max - min;

        // Printing the largest and smallest values
        System.out.printf("Maximum value: %d, Minimum value: %d%n", max, min);

        // Printing the difference of largest and smallest values
        System.out.println("Difference of largest and smallest values: " + difference);
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] myArray = {11, 22, 33, 44, 55};

        // Printing the array as a string
        System.out.println("myArray[] = " + Arrays.toString(myArray));

        // Calling the method to get the difference of max and min values in the array
        getDifferenceOfMaxMin(myArray);
    }
}
