/*
 [60] Write a Java program to iterate through all elements in a hash list.  
 */

package corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M60_IterateShashSet {

	public static void main(String[] args) {
		
		Set<Character> set = new HashSet<Character>();
		set.add('v');
		set.add('i');
		set.add('b');
		set.add('h');
		set.add('u');
		
		System.out.println(set);
		System.out.println("Iterating the elements of set: ");
		Iterator<Character> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
