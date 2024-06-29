package arrays;

public class add_integer {
	 // Function to calculate sum of integer values in an array
    static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        // Printing array elements using for-each loop
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculating sum of array elements using calculateSum method
        int sum = calculateSum(numbers);

        // Displaying the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
