/*
 [75] Write a Java program to compare two sets and retain elements which are same on both sets. 
 */

package corejava;

import java.util.HashSet;
import java.util.Set;

public class M75 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(44);
		set1.add(86);
		set1.add(85);
		System.out.println("Set1 : "+ set1);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(12);
		set2.add(34);
		set2.add(86);
		set2.add(95);
		System.out.println("Set2 : "+ set2);
		
		System.out.println("Retaining elements which are same on both set...");
		set1.retainAll(set2);
		System.out.println("Hash set content: "+set1);
	}
}
