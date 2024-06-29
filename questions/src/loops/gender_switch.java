package loops;
import java.util.Scanner;

public class gender_switch {
	public static void main(String[] args) {
        System.out.print("Enter a Character (M/F): ");
        Scanner scanner = new Scanner(System.in);
        
        // The Java String class "charAt()" method returns a char value at the given index number.
        char gender = scanner.next().charAt(0);
        
        // The Java switch statement executes one statement from multiple conditions.
        switch (gender) {
            // The case values must be unique. In case of duplicate value, it renders compile-time error.
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Invalid input. Please enter 'M' for Male or 'F' for Female.");
                break;
        }
    }
}
