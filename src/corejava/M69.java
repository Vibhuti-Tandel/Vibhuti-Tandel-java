/*
 [69] Write a Java program to convert a hash set to an array. 
 */

package corejava;

import java.util.HashSet;
import java.util.Set;

public class M69 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("Vibhuti");
		set.add("java");
		set.add("AA grade");
		System.out.println("Gieven set: "+set);
		
		System.out.println("\nConverting set into array: ");
		String arr[] = new String[set.size()]; 
		set.toArray(arr);
		System.out.println("Array: ");
		for(String str: arr)
		{
			System.out.println(str);
		}
	}
}
