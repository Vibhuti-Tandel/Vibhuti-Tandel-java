/*
 [53] Write a Java program to update specific array element by given element. 
 */

package corejava;

import java.util.ArrayList;
import java.util.List;

public class M53_UpdateElement {

public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("React");
		list.add("PHP");
		list.add("Android");
		System.out.println("Your List: "+list);
		System.out.println("Updating element PHP by Angular:");
		list.set(3, "Angular");
		System.out.println(list);
	}
}
