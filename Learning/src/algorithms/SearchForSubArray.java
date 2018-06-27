package algorithms;

public class SearchForSubArray {

	private boolean isSubsetOf(int arr1[], int arr2[], int size1, int size2) {
		sort(arr1, 0, size1);

		for (int i = 0; i <= size2; i++) {

			if (binarySearch(arr1, 0, size1, arr2[i]) == -1) {
				return false;
			}
		}
		return true;
	}

	private int binarySearch(int arr[], int low, int high, int key) {
		if (low <= high) {
			int middle = (low + high) / 2;

			if (arr[middle] == key) {
				return middle;
			} else if (arr[middle] > key) {
				return binarySearch(arr, low, middle - 1, key);
			} else {
				return binarySearch(arr, middle + 1, high, key);
			}
		}
		return -1;
	}

	private void merge(int arr[], int low, int middle, int high) {
		int size1 = middle - low + 1;
		int size2 = high - middle;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[low + i];
		}
		for (int j = 0; j < size2; j++) {
			arr2[j] = arr[middle + 1 + j];
		}
		int i = 0, j = 0, k = low;
		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < size1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < size2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	private void sort(int arr[], int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;

			sort(arr, low, middle);
			sort(arr, middle + 1, high);

			merge(arr, low, middle, high);
		}
	}

	public static void main(String args[]) {
		SearchForSubArray sub = new SearchForSubArray();
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };
		int size1 = arr1.length - 1;
		int size2 = arr2.length - 1;
		if (sub.isSubsetOf(arr1, arr2, size1, size2) == true) {
			System.out.println("Yes, arr1 is a subset of arr2.");
		} else {
			System.out.println("No");
		}
	}

}
