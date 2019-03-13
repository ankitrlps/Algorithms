package datastructures;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListRemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list);
		
		list.clear();
		
		list.addAll(lhs);
		System.out.println(list);
		
	}
}
