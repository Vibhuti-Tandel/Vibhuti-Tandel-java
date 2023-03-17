/*
 [76] Write a Java program to get a collection view of the values contained in this map.
 */

package corejava;

import java.util.HashMap;
import java.util.Map;

public class M76 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Prachi");
		map.put(102, "Rahul");
		map.put(103, "Pihu");
		map.put(104, "Vanshi");
		map.put(105, "Hiya");
		System.out.println("Hash Map values: "+map.values());
	}
}
