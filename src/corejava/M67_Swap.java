/*
 [67] Write a Java program of swap two elements in an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M67_Swap {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		System.out.println("List: "+list);
		System.out.println("\nSwapping 'yellow' with 'pink'...");
		Collections.swap(list, 1, 4);
		System.out.println("List after swapping: "+ list);
	}
}
