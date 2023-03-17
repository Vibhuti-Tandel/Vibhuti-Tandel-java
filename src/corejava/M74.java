/*
 [74] Write a Java program to print all the elements of an Array List using the position of the elements. 
 */

package corejava;

import java.util.ArrayList;

public class M74 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("peach");
		al.add("violet");
		System.out.println("List: "+al);
		
		String arr[] = new String[al.size()];
		al.toArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at index "+i+" is "+arr[i]);
		}
	
	}
}
