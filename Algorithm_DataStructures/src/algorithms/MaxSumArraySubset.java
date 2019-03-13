package algorithms;

import java.util.Arrays;

public class MaxSumArraySubset {

	/*
	 * This is to find a subset in an array which has the maximum sum. Array can
	 * have both negative and positive numbers.
	 */
	
	private static void merge(int[] arr, int left, int mid, int right) {
		
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		for(int i = 0; i < size1; i++){
			arr1[i] = arr[left + i];
		}
		
		for(int j = 0; j < size2; j++){
			arr2[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		while(i < size1 && j < size2){
			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < size1){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < size2){
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
	}
	
	private static void sort(int[] arr, int left, int right) {
		if(left < right){
			
			int mid = (left + right) / 2;
			
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
			
		}
	}
	
	private static int[] maxSumSubArray(int[] arr) {
		int[] newArr = new int[2];
		if(arr.length < 3){
			return arr;
		}
		
		sort(arr, 0, arr.length - 1);
		
		newArr[0] = arr[arr.length - 2];
		newArr[1] = arr[arr.length - 1];
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 11, 9 };
		
		Arrays.stream(maxSumSubArray(arr)).forEach(i -> System.out.print(i + " "));
	}

}
