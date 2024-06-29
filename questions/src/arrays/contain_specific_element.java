package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class contain_specific_element {
	// Method to verify if the array contains two specified elements (12, 23)
    // Creating a method which receives an array and integers as parameters
    static void contains(int[] arr, int num1, int num2) {
        boolean containsNum1 = false;
        boolean containsNum2 = false;

        // Using for-each loop to check each element in the array
        for (int i : arr) {
            // Checks if the element matches num1
            if (i == num1) {
                containsNum1 = true;
            }
            // Checks if the element matches num2
            if (i == num2) {
                containsNum2 = true;
            }
        }

        // Prints whether num1 is found or not
        if (containsNum1) {
            System.out.printf("Contains %d in the array\n", num1);
        } else {
            System.out.printf("Doesn't Contain %d in the array\n", num1);
        }

        // Prints whether num2 is found or not
        if (containsNum2) {
            System.out.printf("Contains %d in the array\n", num2);
        } else {
            System.out.printf("Doesn't Contain %d in the array\n", num2);
        }

        // Prints the original array
        System.out.println("my_arr[] = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] myArr = {11, 22, 12, 33, 44, 23, 55};

        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values to verify (num1 & num2): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Passing array and elements to verify
        contains(myArr, num1, num2);
    }
}
