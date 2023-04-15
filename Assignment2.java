package Collection_frameworkmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment2 {

	public static void main(String[] args) {
		// LinkedHashMap....
		Map<String,Integer> LHM = new LinkedHashMap<>();
		
		LHM.put("subhashchandra Bose", 1);
		LHM.put("Chatrapathi Sivaji", 2);
		LHM.put("Dr.Br abdkar", 3);
		LHM.put("sardervallabhai patel", 4);
		LHM.put("Mahatma Gandhi", 5);
		LHM.put("Sarojini naidu", 6);
		
		for(Map.Entry<String, Integer> m : LHM.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
 
	}

}
