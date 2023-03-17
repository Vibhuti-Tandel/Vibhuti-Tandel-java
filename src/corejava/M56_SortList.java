/*
 [56] Write a Java program to sort a given array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M56_SortList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		System.out.println("List of colors: ");
		System.out.println(list);
		System.out.println("List after sorting....");
		list.sort(null);
		System.out.println(list);
	}
}
