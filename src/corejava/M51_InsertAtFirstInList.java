/*
 [51] Write a Java program to insert an element into the array list at the first position. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M51_InsertAtFirstInList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(109);
		list.add(14);
		list.add(89);
		System.out.println(list);
		//Inserting element at first position
		list.add(0, 101);
		System.out.println("List after inserting 101 at first position: ");
		System.out.println(list);
	}
}
