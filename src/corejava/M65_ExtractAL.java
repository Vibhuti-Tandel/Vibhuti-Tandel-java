/*
 [65] Write a Java program to extract a portion of an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M65_ExtractAL {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Kiwi");
		list.add("Apple");
		list.add("Strawberry");
		list.add("Mango");
		list.add("Guavava");
		list.add("Banana");
		System.out.println("Your list: ");
		System.out.println(list);
		System.out.println("Extracting array list from index 1 to 3:");
		System.out.println(list.subList(1, 4));
	}
}
