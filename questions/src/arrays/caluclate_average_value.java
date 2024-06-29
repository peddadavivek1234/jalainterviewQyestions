package arrays;

public class caluclate_average_value {
	// Method to calculate the average value of an array
    static void calculateAverage(int[] array) {
        int sum = 0;
        // Calculate sum of array elements
        for (int num : array) {
            sum += num;
        }
        // Calculate average
        int average = sum / array.length;
        // Print the average value
        System.out.println("The Average value of the array is: " + average);
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate and print average of array elements
        calculateAverage(numbers);
    }
}
