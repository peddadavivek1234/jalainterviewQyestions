package jala_questions;

import java.util.Scanner;

public class equal_notequal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		if(x==y) {
			System.out.println("Both Numbers are equal");
		}
		else {
			System.out.println("Both Numbers are not equal");
		}
	}
}
