/*
 [58] Write a Java program to shuffle elements in an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M58_Shuffle {

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
		System.out.println("List after shuffling...");
		Collections.shuffle(list);
		System.out.println(list);
	}
}
