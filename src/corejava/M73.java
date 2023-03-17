/*
 [73] Write a Java program to replace the second element of an Array List with the specified element. 
 */

package corejava;

import java.util.ArrayList;

public class M73 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("peach");
		al.add("violet");
		System.out.println("Original list: "+al);
		System.out.println("\nReplacing second element with 'sky blue'...");
		al.set(1, "sky blue");
		System.out.println("List: "+al);
	}
}
