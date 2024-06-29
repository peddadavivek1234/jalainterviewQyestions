package string;

public class upper_lower {
	public static void main(String[] args) {
		String upper1 = "upper case";
        String upper2 = "LOWER CASE";
        //toUpperCase() method converts lower to upper case
        String lower1 = upper1.toUpperCase();
        //toLowerCase() method converts upper to lower case
        String lower2 = upper2.toLowerCase();
        System.out.println("Converted to upper case : " + lower1);
        System.out.println("Converted yo lower case : " + lower2);
	}
}
