package datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 8, 7, 6, 45, 8, 45, 54, 56465, 787));

		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println(set);
	}
}
