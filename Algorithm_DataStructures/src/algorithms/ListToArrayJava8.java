package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListToArrayJava8 {
	
	public static void test(List<Integer> arr) {
		int[] nums = arr.stream().map(i -> (i == null ? 45 : i)).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(nums));
	}


	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);
		list.add(4);
		list.add(5);
		test(list);
	}
}
