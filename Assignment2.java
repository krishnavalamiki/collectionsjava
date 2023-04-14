package Collectin_framework;

import java.util.LinkedList;

public class Assignment2 {

	public static void main(String[] args) {
		// List interface impliments class..
		LinkedList<String> Ll = new LinkedList<>();
		Ll.add("Rangamma");
		Ll.add("Nageswarao");
		Ll.add("Sivamma");    // adding the elements in the list interface by impliments the classes.
		Ll.add("Ranmjineyulu");
		Ll.add("Pusphavathi");
		Ll.add("Manjunath");
		Ll.add("Krishna");
		System.out.println(Ll);
		
		Ll.set(0,"Talaari Rangamma");
		System.out.println(Ll); // updating the elements in the list classes..
		
		Ll.remove(0);
		System.out.println(Ll);   // Remove the elements in the list classes..
		
		System.out.println(Ll.getLast()); // get the  Last element in the list class..
		
	    System.out.println(Ll.getFirst()); // get the first element in the list class..
	    
	    System.out.println(Ll.get(1));    // get the element particular index...
  
	    System.out.println(Ll.contains("Sivamma"));  // checking the element is it there or not..
	}

}
