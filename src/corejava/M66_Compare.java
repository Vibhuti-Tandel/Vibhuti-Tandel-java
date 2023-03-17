/*
 [66] Write a Java program to compare two array lists. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M66_Compare {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("blue");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("red");
		list2.add("green");
		list2.add("blue");
		
		System.out.println("List1: "+list);
		System.out.println("List2: "+ list2);
		
		System.out.println("Comparing both lists: "+ list.equals(list2));
		
		System.out.println("\nAdding 'pink' in list2...");
		list2.add("pink");
		System.out.println("Now both list are...");
		System.out.println("List1: "+list);
		System.out.println("List2: "+ list2);
		System.out.println("Comparing both lists after change in list2: "+list.equals(list2));
	}
}
