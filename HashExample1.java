

//Java Program to Demonstrate Working of HashSet

//Importing HashSet class from java.util package
import java.util.HashSet;

//Main class
class HashExample1 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a HashSet object of string type
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to HashSet
		// using add() method
		hset.add("Canara");
		hset.add("Engineering");
		hset.add("College");
		hset.add("Bantwal");

		// Duplicate removed
		hset.add("Canara");

		// Printing HashSet elements using for each loop

		// Display command only
		System.out.println("HashSet contains: ");

		for (String temp : hset) {
			System.out.println(temp);
		}
	}
}
