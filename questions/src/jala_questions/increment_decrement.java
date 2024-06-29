package jala_questions;

public class increment_decrement {
	static void preIncrement(int x,int y) {
		int z = y + (++x);
		System.out.println("Values after preIncrement "+z);
	}
	static void postIncrement(int x,int y) {
		int z = y + (x++);
		System.out.println("Values after postIncrement "+z);
	}
	static void preDecrement(int x,int y) {
		int z = y + (--x);
		System.out.println("Values after preDecrement "+z);
	}
	static void postDecrement(int x,int y) {
		int z = y + (x--);
		System.out.println("Values after postDecrement "+z);
	}
	public static void main(String[] args) {
		int x = 20, y= 10;
		preIncrement(x,y);
		postIncrement(x,y);
		preDecrement(x,y);
		postDecrement(x,y);
	}
}
