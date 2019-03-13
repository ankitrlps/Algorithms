package algorithms;

public class DiagonalDifference {

	public static int diagonal(int[][] arr) {
		int leftSum = 0;
		int rightSum = 0;
		int k = arr.length - 1;
		for(int i = 0; i < arr.length; i++){
			leftSum += arr[i][i];
			rightSum += arr[i][k];
			k--;
		}
		return Math.abs(leftSum - rightSum);
	}
	
	public static void main(String[] args) {
		int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
		System.out.println(diagonal(arr));
	}
}
