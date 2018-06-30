package algorithms;

public class MissingNumber {
	
	private static int findNum(int nums[]) {
		int arraySize = nums.length + 1;
		
		int finalTotal = arraySize * (arraySize+1)/2;
		int sum = 0;
		
		for(int i = 0; i < nums.length ; i++){
			sum += nums[i];
		}
		
		int missNum = finalTotal - sum;
		
		return missNum;
	}
	
	public static void main(String[] args) {
		int nums[] = {4,2,5,6,7,1,3,9,11,8};
		System.out.println(findNum(nums));
	}
}
