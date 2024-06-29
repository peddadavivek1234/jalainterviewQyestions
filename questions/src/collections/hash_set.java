package collections;
import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
	public static void main(String[] args) {
		 // Create a HashSet of type String
        HashSet<String> hashSet = new HashSet<>();

        // a. Adding elements to the HashSet using add() method
        hashSet.add("zero");
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.add("six");
        hashSet.add("seven");
        hashSet.add("eight");
        hashSet.add("nine");
        // HashSet does not allow duplicate elements
        hashSet.add("nine");
        
        System.out.println("\nAfter adding elements to HashSet :");
        System.out.println("hashSet = " + hashSet);

        // b. Iterating through the HashSet by using Iterator object
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // c. Creating a clone/copy of HashSet (Note: HashSet does not have a clone() method)
        // For demonstration, we can create a new HashSet and addAll elements from original HashSet
        HashSet<String> copySet = new HashSet<>(hashSet);
        System.out.println("\nCopy of HashSet : ");
        System.out.println("copySet = " + copySet);

        // d. Removing a specific element using remove() method
        hashSet.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("hashSet = " + hashSet);

        // e. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(hashSet.isEmpty());

        // f. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(hashSet.size());

        // g. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(hashSet.contains("one")); //returns boolean value

        // j. Removing all elements of the HashSet using clear() method
        hashSet.clear();
        System.out.println("\nAfter removing all elements of the HashSet :");
        System.out.println("hashSet = " + hashSet);
	}
}
