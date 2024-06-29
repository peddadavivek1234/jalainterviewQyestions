package jala_questions;

public class arthematic_operators {
	static void addition(int x,int y) {
		int add = x+y;
		System.out.println("Addition of x + y = "+add);
	}
	static void Subtratction(int x,int y) {
		int subtract = x-y;
		System.out.println("Subtraction of x + y = "+subtract);
	}
	static void multiplication(int x,int y) {
		int mul = x*y;
		System.out.println("Multiplication of x + y = "+mul);
	}
	static void division(int x,int y) {
		int div = x/y;
		System.out.println("Division of x + y = "+div);
	}
	public static void main(String[] args) {
		int x = 10,y = 5;
		addition(x,y);
		Subtratction(x,y);
		multiplication(x,y);
		division(x,y);
	}
}
