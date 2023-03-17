/*
 [72] Write a Java program to increase the size of an array list. 
 */

package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class M72_IncreaseSize {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(90);
		list.add(89);
		
		System.out.println("Your list: "+list);
		System.out.println("Size of list: "+list.size());
		System.out.println("Increasing list size by 7");
		list.ensureCapacity(7);
		list.add(0);
		list.add(10);
		System.out.println(list);
	}
}
