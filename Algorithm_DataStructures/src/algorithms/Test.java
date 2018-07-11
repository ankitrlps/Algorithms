package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Test {

	/*
	 * private int remove(int[] nums) { for (int i = 0; i < nums.length; i++) {
	 * nums[i] = nums[i + 1]; }
	 * 
	 * return nums.length; }
	 */

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ankit", 1);
		map.put("rlps", 2);
		map.put("sis", 3);
		
		System.out.println(map.values());
	}

}
