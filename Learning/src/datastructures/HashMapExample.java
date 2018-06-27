package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Age");
		hashmap.put(2, "Name");
		hashmap.put(3, "gender");
		hashmap.put(4, "address");

		// Set<Map.Entry<Integer, String>> set = hashmap.entrySet();
		// System.out.println(set);
		for (Map.Entry<Integer, String> eS : hashmap.entrySet()) {
			System.out.println(eS.getKey() + " : " + eS.getValue());
		}
	}
}
