package algorithms;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] newArr = new int[2];
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for(j = i + 1; j < nums.length;j++){
				if ((nums[i] + nums[j]) == target) {
					newArr[0] = i;
					newArr[1] = j;
					break;
				}
			}
		} 
		return newArr;
	}

	public static void main(String[] args) {
		TwoSum sol = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int[] res = sol.twoSum(nums, 17);
		System.out.println("Here:" + res[0] + " " + res[1]);
	}
}
