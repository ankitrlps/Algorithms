package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ProbabilityOfElementOccurencesInArray {

	public static void probOccur(int[] arr) {

		Map<Integer, Integer> parentMap = new HashMap<>();
		Map<Integer, Integer> childMap = new HashMap<>();
		IntStream.range(0, arr.length - 1).forEach(i -> {
			if (parentMap.containsKey(arr[i])) {
				if (parentMap.get(arr[i]) == arr[i + 1]) {
					if (childMap.containsKey(arr[i + 1])) {
						childMap.put(arr[i + 1], childMap.get(arr[i + 1]) + 1);
						System.out.println("Probability of " + arr[i] + " , " + arr[i+1] + " = " + childMap.get(arr[i+1]));
					} else {
						childMap.put(arr[i + 1], 1);
					}
				}else{
					parentMap.put(arr[i], arr[i+1]);
				}
			} else {
				parentMap.put(arr[i], arr[i + 1]);
			}
		});
		childMap.forEach((k, v) -> {
			System.out.println(k + "||" + v);
		});
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3, 7, 1, 5, 8, 3, 9, 4, 10 };
		probOccur(arr);
	}
}
