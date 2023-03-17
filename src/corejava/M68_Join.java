/*
 [68] Write a Java program to join two array lists. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M68_Join {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("blue");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("white");
		list2.add("purple");
		list2.add("balck");
		
		System.out.println("List1: "+list);
		System.out.println("List2: "+ list2);
		
		System.out.println("Joining two lists...");
		list.addAll(list2);
		System.out.println(list);
		
	}
}
