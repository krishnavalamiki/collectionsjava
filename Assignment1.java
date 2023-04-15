package Collection_frameworkmap;

import java.util.HashMap;
import java.util.Map;


public class Assignment1 {

	public static void main(String[] args) {
	 // tree map,Hash map,LinkedHash map
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Nageswarao");
		m.put(2, "Sivamma");
		m.put(3, "Ramanjineyulu");
		m.put(4, "pusphavathi");
		m.put(5, "Manjunath");
		m.put(6, "krishna");
		m.put(7, "Rangamma");
		m.put(8, "Madhanna");
		System.out.println(m.get(8)); // accessing particular value...
		
		System.out.println(m.keySet()); // print only key values..
		
		
       for(Map.Entry<Integer, String> m1 : m.entrySet()) {
    	   System.out.println(m1.getValue()+"\n"+m1.getKey()); // print the values one by one using
    	   // for each loop..
       }
	}

}
