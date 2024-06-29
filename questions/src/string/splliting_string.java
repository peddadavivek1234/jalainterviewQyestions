package string;

public class splliting_string {
	public static void main(String[] args) {
		String spliting = "Splitting String";
        //split() method breaks a given string around matches
        String[] split = spliting.split(" "); //splits space

        for (String i : split) {
            System.out.println("Splitted : " + i);
        }
	}
}
