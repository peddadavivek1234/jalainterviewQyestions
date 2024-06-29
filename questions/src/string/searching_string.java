package string;

public class searching_string {
	public static void main(String[] args) {
		String s1 = "Searching index";
        //The indexOf() method returns the position of first occurrence of character
        int a = s1.indexOf("index");
        //first occurrence of the letter "e", start from index 3
        int b = s1.indexOf("h", 3);
        System.out.println("At Index : " + a);
        System.out.println("At Index : " + b);
	}
}
