package loops;

public class printing_numbers {
	public static void main(String[] args) {
        int number = 1;
        // In while loop, we separately need to initialize and increment the variable
        // loop executes from 1 to 20
        while (number <= 20) {
            System.out.print(number + " ");
            // Every time the loop body is executed, this expression increments
            number++;
        }
    }
}
