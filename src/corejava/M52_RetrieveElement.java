/*
 [52] Write a Java program to retrieve an element (at a specified index) from a given array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M52_RetrieveElement {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("React");
		list.add("PHP");
		list.add("Android");
		System.out.println("Your List: "+list);
		System.out.println("Element at 3rd position: "+list.get(2));
	}
}
