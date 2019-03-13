package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MagicNumberAddSubtract {

	public static boolean arithmeticBoggle(int magicNumber, ArrayList<Integer> numbers) {

		int sum = 0;
		int size = numbers.size();

		for (int integer : numbers) {
			sum = sum + integer;
		}
		System.out.println(sum);
		
		int i = 1;
		
		
		
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		//arithmeticBoggle(10, list);
		
		int j = 2;
		int k = 1;
		String res;
		res = j + "" + k;
		int r = Integer.parseInt(res.substring(0, 1));
		System.out.println("index: " + r);
		System.out.println(res.charAt(0));
	}
}
