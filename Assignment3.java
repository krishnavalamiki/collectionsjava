package Collectin_framework1;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment3 {

	public static void main(String[] args) {
	   TreeSet<Integer> Ts = new TreeSet<>();
	   Ts.add(32);
	   Ts.add(33);
	   Ts.add(34);
	   Ts.add(35);
	   Ts.add(36);
	   Ts.add(37);
	   Ts.add(38);
	   Ts.add(39);
	   Ts.add(40);
	   Ts.add(41);
	   System.out.println(Ts.toString());
	   
	   Iterator<Integer> di = Ts.descendingIterator(); // print the values descending order by using iterator in descending..
	   while(di.hasNext()) {
		   System.out.println(di.next());
	   }
	   
	   System.out.println(Ts.remove(35)); // remove Particular element.. 
	   System.out.println(Ts);
	   
	   Ts.removeAll(Ts);
	   System.out.println(Ts);
	   }

}
