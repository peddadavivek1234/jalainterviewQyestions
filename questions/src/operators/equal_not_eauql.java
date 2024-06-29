package operators;
import java.util.Scanner;

public class equal_not_eauql {
	public static void main(String[] args) {
        // To get the instance of Java Scanner which reads input from the user,
        // we need to pass the input stream (System.in) in the constructor of Scanner class.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        // "nextInt()" scans the next token of the input as an Int.
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        
        // Equal operator (==)
        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal.");
        }
        // Not equal operator (!=)
        else if (firstNumber != secondNumber) {
            System.out.println("The numbers are different.");
        }
    }
}
