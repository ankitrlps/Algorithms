package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {

	private static Boolean palindromeNumber(int x) {
		int reverse = 0;
		int num = x;

		while (x > 0) {
			reverse = reverse * 10 + x % 10;
			x /= 10;
		}
		if (reverse == num) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x = 1234554321;
		System.out.println(palindromeNumber(x));
		
	}
}
