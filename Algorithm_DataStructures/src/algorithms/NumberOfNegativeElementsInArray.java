package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfNegativeElementsInArray {

	public static int countNegativeNumbers(int[] arr) {
		Integer[] ii = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		int oldLength = ii.length;
		
		if(Arrays.asList(ii).indexOf(0) != -1){
			Arrays.sort(ii);
			return Arrays.asList(ii).indexOf(0);
		}else{
			Integer[] arr1 = new Integer[oldLength + 1];
			IntStream.range(0, oldLength).forEach(i -> {
				arr1[i] = ii[i];
			});
			arr1[arr1.length - 1] = 0;
			
			Arrays.sort(arr1);
			
			return Arrays.asList(arr1).indexOf(0);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, -2, -6, 5, -9, 100, -11 };
		
		System.out.println(countNegativeNumbers(arr));
	}
}