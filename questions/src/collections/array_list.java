package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class array_list {
	public static void main(String[] args) {
		 // Create an ArrayList of type String with 10 string elements
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList("Element 1", "Element 2", "Element 3", "Element 4", "Element 5",
                        "Element 6", "Element 7", "Element 8", "Element 9", "Element 10"));

        // a. Add an element to the ArrayList
        arrayList.add("New Element");
        System.out.println("After adding an element: " + arrayList);

        // b. Iterate through the ArrayList using Iterator
        System.out.println("Iterating through the ArrayList:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c. Add an element at a specific index
        int indexToAdd = 5;
        arrayList.add(indexToAdd, "Inserted Element");
        System.out.println("After adding at index " + indexToAdd + ": " + arrayList);

        // d. Remove an element from the ArrayList, Remove at an index
        String elementToRemove = "Element 3";
        if (arrayList.contains(elementToRemove)) {
            arrayList.remove(elementToRemove);
            System.out.println("After removing '" + elementToRemove + "': " + arrayList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the ArrayList.");
        }

        // Remove at a specific index
        int indexToRemove = 7;
        if (indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("After removing element at index " + indexToRemove + ": " + arrayList);
        } else {
            System.out.println("Index " + indexToRemove + " is out of bounds.");
        }

        // e. Update the element at a specific index
        int indexToUpdate = 2;
        String newElement = "Updated Element";
        if (indexToUpdate < arrayList.size()) {
            arrayList.set(indexToUpdate, newElement);
            System.out.println("After updating element at index " + indexToUpdate + ": " + arrayList);
        } else {
            System.out.println("Index " + indexToUpdate + " is out of bounds.");
        }

        // f. Check the element is present at a particular index
        int indexToCheck = 4;
        if (indexToCheck < arrayList.size()) {
            System.out.println("Element at index " + indexToCheck + ": " + arrayList.get(indexToCheck));
        } else {
            System.out.println("Index " + indexToCheck + " is out of bounds.");
        }

        // g. Get an element at a particular index
        System.out.println("Element at index 3: " + arrayList.get(3));

        // h. Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // i. Check the given element is present in the ArrayList
        String elementToCheck = "Element 6";
        if (arrayList.contains(elementToCheck)) {
            System.out.println("'" + elementToCheck + "' is present in the ArrayList.");
        } else {
            System.out.println("'" + elementToCheck + "' is not present in the ArrayList.");
        }

        // j. Remove all elements of the ArrayList
        arrayList.clear();
        System.out.println("After clearing all elements: " + arrayList);
	}
}
