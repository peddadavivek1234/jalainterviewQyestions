package jala_questions;

public class logical_operator {
	public static void main(String[] args) {
		int x = 10,y= 20,z=30;
		//Logical AND(&&)
		System.out.println(x>y && x>z);
		System.out.println(x<y && x<z);
		System.out.println(x>y && x<z);
		
		//Logical OR(||)
		System.out.println(x>y || x>z);
		System.out.println(x<y || x<z);
		System.out.println(x>y || x<z);
		
		//Logical NOT(!())
		System.out.println( !(x>z));
		System.out.println( !(x<z));
	}
}
