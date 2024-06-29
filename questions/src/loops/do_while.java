package loops;

public class do_while {
	public static void main(String[] args) {
        int number = 1;
        
        /* The Java do-while loop is executed at least once because
           the condition is checked after the loop body. */
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 10);
        
        /* Unlike while loop and for loop, the do-while
           checks the condition at the end of loop body */
    }
}
