/*
 [63] Write a Java program to count the number of key-value (size) mappings in a map. 
 */

package corejava;

import java.util.HashMap;
import java.util.Map;

public class M63_HMSize {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Prachi");
		map.put(102, "Rahul");
		map.put(103, "Pihu");
		map.put(104, "Vanshi");
		map.put(105, "Hiya");
		System.out.println("Hash Map: "+map);
		System.out.println("Size of key-value mappings: "+map.size());
	}
}
