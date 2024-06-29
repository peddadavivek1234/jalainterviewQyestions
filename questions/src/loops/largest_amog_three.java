package loops;
import java.util.Scanner;

public class largest_amog_three {
	public static void main(String[] args) {

        int firstNum, secondNum, thirdNum;
        Scanner scanner = new Scanner(System.in);
        
        // Inputs stored in firstNum, secondNum, thirdNum
        System.out.print("Enter First Number : ");
        firstNum = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        secondNum = scanner.nextInt();
        System.out.print("Enter Third Number : ");
        thirdNum = scanner.nextInt();

        // Checks which number is largest among the three
        if ((firstNum > secondNum) && (firstNum > thirdNum)) {
            System.out.println("The Largest Number is : " + firstNum);
        } else if ((secondNum > firstNum) && (secondNum > thirdNum)) {
            System.out.println("The Largest Number is : " + secondNum);
        } else {
            System.out.println("The Largest Number is : " + thirdNum);
        }
    }
}
