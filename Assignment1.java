package Collectin_framework;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		// List Interface impliments by ArrayList,LinkedList,vector
		//ArrayList..
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);     // Adding elements to list interface classes using add() method...
		al.add(40);
		al.add(50);
       System.out.println(al);
       al.add(4, 60);
       System.out.println(al);
       
       al.set(0, 15);          // updating elements in list interface by using set method..
       System.out.println(al); 
       al.remove(0);            // remove the elements from list interface..
       System.out.println(al);
       System.out.println(al.get(4)); // Accessing the element in the given list interface..
       
       
       System.out.println(al.contains(20)); // given elements are contains in the list interface..
       // it executes only boolean expression true (or) false..
	}
}
