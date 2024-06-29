package arrays;
import java.util.Arrays;

public class find_the_second_largest {
	// Method to find the second-largest number in an array
    public static void findSecondLargest(int[] arr) {
        int temp;
        // Sorting the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // The second largest number will be the second last element after sorting
        System.out.println("The second largest number in the array: " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] myArr = {11, 22, 33, 44, 55};
        // Printing the array as string
        System.out.println("Array: " + Arrays.toString(myArr));
        // Calling the method to find the second largest number
        findSecondLargest(myArr);
    }

}
