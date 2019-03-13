package algorithms;

import java.util.Arrays;

public class RefTest {
	
	
	public static void main(String[] args) {
		RefTest reftest = new RefTest();
		int arr[] = new int[5];
		System.out.println(Arrays.toString(arr));
		reftest.add(arr, 5);
		System.out.println(Arrays.toString(arr));
	}
	
	public void add(int[] a, int b) {
		a[4] = b;
	}
}
