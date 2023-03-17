/*
 [62] Write a Java program to associate the specified value with the specified key in a Hash Map. 
 */

package corejava;

import java.util.HashMap;
import java.util.Map;

public class M62_Hashmap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Prachi");
		map.put(102, "Rahul");
		map.put(103, "Pihu");
		map.put(104, "Vanshi");
		map.put(105, "Hiya");
		System.out.println("Hash Map: "+map);
	}
}
