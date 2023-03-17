/*
 [71] Write a Java program to check whether a map contains key-value mappings (empty) or not. 
 */

package corejava;

import java.util.HashMap;
import java.util.Map;

public class M71_MapEmptyOrNot {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Prachi");
		map.put(102, "Rahul");
		map.put(103, "Pihu");
		map.put(104, "Vanshi");
		map.put(105, "Hiya");
		System.out.println("Hash Map: "+map);
		System.out.println("\nIs Hash map empty? "+map.isEmpty());
	}
}
