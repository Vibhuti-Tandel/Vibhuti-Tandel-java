/*
 [61] Write a Java program to get the number of elements in a hash set. 
 */

package corejava;

import java.util.HashSet;
import java.util.Set;

public class M61 {

	public static void main(String[] args) {
		
		Set<Character> set = new HashSet<Character>();
		set.add('v');
		set.add('i');
		set.add('b');
		set.add('h');
		set.add('u');
		
		System.out.println("Set: "+set);
		System.out.println("Number of elements in hash set: "+set.size());
		
	}
}
