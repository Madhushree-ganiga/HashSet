

//Java Program to Illustrate Working of HashSet
//From another Collection

//Importing utility classes
import java.util.*;

class HashExample2 {

	// Main driver method
	public static void main(String[] args)
	{

		ArrayList<String> ll = new ArrayList<String>();

		// Adding elements to ArrayList
		ll.add("Computer");
		ll.add("Science");

		// Creating HashSet object of string type
		HashSet<String> hs = new HashSet(ll);
		hs.add("Portal");
		hs.add("CANARA");

		// Iterating via iterators
		Iterator<String> iter = hs.iterator();

		// Condition holds true till there is single element
		// in thE List
		while (iter.hasNext()) {

			// Printing all elements inside objects
			System.out.println(iter.next());
		}
	}
}
