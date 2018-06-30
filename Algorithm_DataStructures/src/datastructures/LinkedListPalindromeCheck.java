package datastructures;

import java.util.LinkedList;

public class LinkedListPalindromeCheck {

	private boolean isPalidrome(LinkedList<String> list) {
		boolean flag = false;
		int j = list.size() - 1;
		for (int i = 0; i <= list.size() - 1; i++) {
			if (list.get(i).equals(list.get(j))) {
				j--;
				flag = true;
			} else {
				flag = false;
				System.out.println(flag);
				System.exit(0);
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("M");
		list.add("A");
		list.add("D");
		list.add("A");
		list.add("M");

		LinkedListPalindromeCheck check = new LinkedListPalindromeCheck();
		System.out.println(check.isPalidrome(list));
	}
}
