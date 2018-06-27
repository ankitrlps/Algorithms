package algorithms;

public class MinimumElementRotatedSortedArray {

	private static int find(int arr[], int left, int right) {
		int mid = (left + right) / 2;
		if (arr[left] < arr[right]) {
			return arr[left];
		}
		if (left == right) {
			return arr[0];
		}
		if (arr[mid] > arr[mid + 1]) {
			return arr[mid + 1];
		}
		if (arr[mid - 1] > arr[mid])
			return arr[mid];
		if (arr[mid] < arr[right]) {
			return find(arr, left, mid - 1);
		} else {
			return find(arr, mid + 1, right);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 7, 8, 1, 2, 3, 4, 5 };
		System.out.println("Minimum element: " + find(arr, 0, arr.length - 1));

		int arr1[] = { 8, 0, 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Minimum element: " + find(arr1, 0, arr.length - 1));

		int arr2[] = { 4, 5, 6, 7, 8, 1, 2, 3 };
		System.out.println("Minimum element: " + find(arr2, 0, arr.length - 1));
	}
}
