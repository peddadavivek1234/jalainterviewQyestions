package collections;
import java.util.HashMap;

public class hash_map {
	public static void main(String[] args) {
		// Create a HashMap with Student ID as keys and Name as values
        HashMap<Integer, String> studentMap = new HashMap<>();

        // a. Inserting Student ID as Key & Name as value using put() method
        studentMap.put(1, "Sharan");
        studentMap.put(2, "Rohit");
        studentMap.put(3, "Leo");
        studentMap.put(4, "Keerthana");
        studentMap.put(5, "Aditya");
        studentMap.put(6, "Manoj");
        studentMap.put(7, "Mahideep");
        studentMap.put(8, "Prapul");
        studentMap.put(9, "Dheeraj");
        studentMap.put(10, "Rahul");
        
        System.out.println("\nKey-value pairs of the Student ID and Name : ");
        System.out.println("studentMap = " + studentMap);

        // b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(studentMap.get(6));

        // c. Creating a clone/copy of HashMap using clone() method (Not recommended, see note below)
        // Note: clone() method is protected in HashMap, hence it's not used here for cloning.

        // Creating a copy of HashMap using constructor
        HashMap<Integer, String> studentMapCopy = new HashMap<>(studentMap);
        System.out.println("\nCopy of HashMap studentMap : ");
        System.out.println("studentMapCopy = " + studentMapCopy);

        // d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(studentMap.containsKey(3));

        // e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(studentMap.containsValue("Sharan"));

        // f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(studentMap.isEmpty());

        // g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(studentMap.size());

        // h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(studentMap.keySet());

        // j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        studentMap.remove(2);
        System.out.println("studentMap = " + studentMap);

        // k. Copying all the elements of the Map to another Map using putAll() method
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("\nCopied all the elements of the studentMap to anotherMap :");
        System.out.println("anotherMap = " + anotherMap);
	}
}
