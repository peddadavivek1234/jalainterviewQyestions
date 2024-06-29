package jala_questions;

public class smaller_larger_number {
	public static void main(String[] args) {
		int x = 10, y = 20;

        if (x < y) {
            System.out.println("Smaller number: " + x);
            System.out.println("Larger number: " + y);
        } else if (x > y) {
            System.out.println("Smaller number: " + y);
            System.out.println("Larger number: " + y);
        } else {
            System.out.println("Both numbers are equal.");
        }
	}
}
