/*
 [70] Write a Java program to convert a hash set to a List/Array List.  
 */

package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class M70 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add(101);
		set.add("java");
		set.add("AA grade");
		System.out.println("Gieven set: "+set);
		
		System.out.println("Converting set into arraylist: ");
		List list = new ArrayList(set);
		System.out.println("List: "+list);
	}
}
