package Collectin_framework1;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) {
		// set interface it is child interface of collection is a child interface of the iteratable..
		// set interface methods are implements class are Hash set,LinkedHashset,sorted set,navigable set..
		HashSet<Integer>Hs = new HashSet<>();
		Hs.add(32);
		Hs.add(33);
		Hs.add(34); // adding the elements by using add method..
		Hs.add(35);
		Hs.add(36);
		Hs.add(37);
		Hs.add(38);
		Hs.add(38); // cannot allowed duplicate values...
		Hs.add(31);
		Hs.add(31);
		//Hs.clear();  set interface clear means delete all the objects and values..
		
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(Arrays.asList(new Integer [] {0,1,2,3,4,5}));  // 
		System.out.println(s);
		System.out.println(Hs);	
	    	
	    System.out.println(Hs.hashCode()); // instance address of the heap memory.....
	    
	    HashSet<String> hs = new HashSet<>();
	    System.out.println(Hs.isEmpty());  // Print boolean false.... elements are present so execute false..
	    System.out.println(hs.isEmpty());  // Print boolean true.... elements are not present so execute true..
	}
}
