package string;

public class matching_string {
	public static void main(String[] args) {
		String matching = "Matching a String";
        // Testing if regex is present or not
        boolean match = matching.matches("(.*)String(.*)");
        //Boolean value, returns true if matches else false
        System.out.println("Matches : " + match);
	}
}
