/*
 [57] Write a Java program to copy one array list into another. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M57_CopyList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		System.out.println("First list: ");
		System.out.println(list);
		
		list2.add("Banana");
		list2.add("Apple");
		System.out.println("Second list: ");
		System.out.println(list2);
		
		System.out.println("Copying first list into second list...");
		list2.addAll(list);
		System.out.println(list2);
	 }
}
