package Collection_frameworkmap;

import java.util.Map;
import java.util.TreeMap;

public class Assignment3 {

	public static void main(String[] args) {
		// TreeMap it is child class of sorted map and navigable map interfaces..
		Map<Integer,String> tm = new TreeMap<>();
		
		// subjects ..
		tm.put(1, "Telugu");
		tm.put(2, "Hindhi");
		tm.put(3, "English");
		tm.put(4, "Science");
		tm.put(5, "Physics");
		tm.put(6, "Maths");
		tm.put(7, "Sanskrit");
		tm.put(8, "Enivronment");
		
		for(Map.Entry<Integer,String> m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
