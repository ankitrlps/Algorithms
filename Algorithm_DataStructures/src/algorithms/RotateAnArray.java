package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateAnArray {

	public static int[] leftRotate(int[] a, int times) {
		if(a.length == 0){
			return a;
		}
		
		int length = a.length;
		int[] newArray = new int[length];
		
		for(int i = 0; i < length; i++){
			int index = (i + times) % length;
			newArray[i] = a[index];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = leftRotate(arr, 2);
		IntStream stream = Arrays.stream(newArr);
		stream.forEach(i -> System.out.print(i + " "));
		
		// { OR } - Arrays.stream(newArr).forEach(i -> System.out.print(i + " "));
		
	}
}
