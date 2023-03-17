/*
 [59] Write a Java program to append the specified element to the end of a hash set. 
 */

package corejava;

import java.util.HashSet;
import java.util.Set;

public class M59_HashSetAppend {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(215);
		set.add(101);
		set.add(123);
		set.add(190);
		System.out.println("Set: "+set);
	}
}
