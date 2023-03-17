/*
 [49] Write a Java program to create a new array list, add some colors (string) and print out the collection. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M49_ColorList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		System.out.println("List of colors: ");
		System.out.println(list);
	}
}
