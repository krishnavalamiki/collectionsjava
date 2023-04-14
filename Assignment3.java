package Collectin_framework;
import java.util.Vector;

public class Assignment3 {

	public static void main(String[] args) {
		// List interface implements the class is Stack
	    // stack is class which is implements by the interface is vector
		// vector is following the LEFO principle. Last in firstout..
		Vector<String> s = new Vector<String>();
		s.add("Ramayanam");
		s.add("Mahabharatam");
		s.add("Bagavatgeetha"); // adding method given the collection add the elements.
		s.add("Garudapuranam");
		s.add("Bible");
		s.add("Kuran");
		s.set(2, "Hanuman chalis");  // update the elements and objects...
		s.remove(2);  // remove the element in the particular element..
		System.out.println(s.contains("Bible"));
		System.out.println(s.toString());
		for(String s1: s) {
			System.out.println(s1);
		}
		System.out.println(s.get(0)); // Accessing the element.. in the vector class..
	    System.out.println(s.indexOf("Ramayanam"));
	    System.out.println(s.lastIndexOf(3));
	}

}
