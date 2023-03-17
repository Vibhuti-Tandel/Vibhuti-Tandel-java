/*
 [64] Write a Java program to reverse elements in an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M64_ReverseAL {

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
		System.out.println("List after reversing elements: ");
		Collections.reverse(list);
		System.out.println(list);
	}
}
