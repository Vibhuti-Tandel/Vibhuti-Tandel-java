/*
 [54] Write a Java program to remove the third element from an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M54_RemoveElement {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("React");
		list.add("PHP");
		list.add("Android");
		System.out.println("Your List: "+list);
		System.out.println("List after removing 3rd element: ");
		list.remove(2);
		System.out.println(list);
	}
}
