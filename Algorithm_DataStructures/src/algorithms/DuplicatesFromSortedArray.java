package algorithms;

public class DuplicatesFromSortedArray {

	private static int removeDuplicates(int[] arr) {
		int j = 0;
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[arr.length - 1];

		for (int i = 0; i <= j; i++) {
			arr[i] = temp[i];
			// System.out.print(arr[i] + " ");
		}
		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 8 };
		int res = removeDuplicates(arr);
		for (int i = 0; i <= res; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}