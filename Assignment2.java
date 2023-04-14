package Collectin_framework1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> Lhs = new LinkedHashSet<>();
		Lhs.add("Ramudu");
		Lhs.add("Sita");
		Lhs.add("lakshmanudu");
		Lhs.add("Hanumanthudu");
		Lhs.add("Anjanidevi");
		Lhs.add("Sugrievudu");
		Lhs.add("Vaali");							
        System.out.println(Lhs);
       
        // print the values one by one using three ways.. for loop,for each,cursors..
        Iterator<String> i = Lhs.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
	}
        System.out.println("Iterator,Enum are the cursers..");
        
        // using for each print the elements one by one..
        for(String s : Lhs) {
        	System.out.println(s);
        }
        
        System.out.println(Lhs.size()); // print the size of the integer..
	}
}
