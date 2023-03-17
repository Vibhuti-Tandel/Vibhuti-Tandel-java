/*
 [55] Write a Java program to search an element in an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M55_SearchElement {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		System.out.println("List of colors: ");
		System.out.println(list);
		System.out.println("Search 'Green' in list...");
		int s = list.indexOf("Green");
		System.out.println("'Green' found at "+s+" position");
	}
}
