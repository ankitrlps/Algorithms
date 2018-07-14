package algorithms;

import java.util.Random;

public class ShuffleArrayElements {

	private static void shuffle(int arr[]) {

		int len = arr.length;
		Random ran = new Random();
		
		for(int i = len - 1; i > 0; i--){
			int r = ran.nextInt(len);
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
		
		for(int i =0;i<len;i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 56, 45, 98, 45, 8, 26, 84, 62, 4, 10, 7 };
		shuffle(arr);
	}
}
