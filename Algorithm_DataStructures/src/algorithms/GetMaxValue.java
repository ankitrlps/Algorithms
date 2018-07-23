package algorithms;

public class GetMaxValue {
	public static void main(String[] args) throws java.lang.Exception {
		System.out.println(getMax(new int[] { 1, 2, 3, 9, 6, 5 }, 0, 6 - 1));
		System.out.println(getMax(new int[] { 1, 9, 7, 8, 6, 5 }, 0, 6 - 1));
		System.out.println(getMax(new int[] { 1, 3, 7, 13, 10, 5 }, 0, 6 - 1));
		System.out.println(getMax(new int[] { 1, 2, 10, 9, 8, 5 }, 0, 6 - 1));
		System.out.println(getMax(new int[] { 1, 9, 10, 11, 12, 11, 10, 60, 5 }, 0, 9-1));
	}

	static int getMax(int[] arr, int low, int high) {
		int mid = (low + high) / 2;

		while (low < high) {
			if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
				return arr[mid];
			} else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return getMax(arr, low + 1, high);
			} else if (arr[mid] < arr[mid - 1]) {
				return getMax(arr, low, high - 1);
			}
		}
		return -1;
	}
}