package string;

public class comparing_strings {
	public static void main(String[] args) {
		String str1 = "Comparing strings";
        String str2 = "Comparing strings";

        //two strings are compared using equals() method
        boolean e = str1.equals(str2);
        System.out.println("Equal : " + e);

        //equalsIgnoreCase() method ignores case differences
        boolean eic = str1.equalsIgnoreCase(str2);
        System.out.println("Equal(ignore case) : " + eic);

        //startsWith() method checks string begins
        boolean sw = str1.startsWith("Comp");
        System.out.println("Starts with : " + sw);

        //endsWith() method checks string ending
        boolean ew = str1.endsWith("ings");
        System.out.println("Ends with : " + ew);

        //compareTo() method returns 0 if both are equal
        int ct = str1.compareTo(str2);
        System.out.println("Compared : " + ct);
	}
}
