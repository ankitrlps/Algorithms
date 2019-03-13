package algorithms;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Test {

/*	private int remove(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i + 1];
		}

		return nums.length;
	}*/

	public static void main(String[] args) {

		/*int[] nums = new int[] { 1, 1, 2, 3, 4, 6, 7, 8, 9 };
		int[] newNums = new int[nums.length - 1];

		for (int i = 0; i < newNums.length; i++) {
			newNums[i] = nums[i + 1];
		}
		System.out.println(Arrays.toString(newNums));*/
		DecimalFormat bd = new DecimalFormat("###.######");
		double d = 3213.32321d;
		String res = bd.format(d);
		System.out.println(res);
		
	}

}
