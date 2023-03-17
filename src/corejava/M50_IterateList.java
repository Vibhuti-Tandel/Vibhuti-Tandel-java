/*
 [50] Write a Java program to iterate through all elements in an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M50_IterateList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(101);
		list.add("Vibhuti");
		list.add("Java");
		list.add("MCA");
		list.add(95.6);
		
		System.out.println("Iterating List elements...");
		
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
