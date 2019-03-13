package algorithms;

public class BinarySearch {
	// array should be sorted.

	private int search(int arr[], int left, int right, int key) {
		mergeSort(arr, left, right);
		return binarySearch(arr, left, right, key);
	}

	void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);

			merge(arr, left, middle, right);
		}
	}

	void merge(int arr[], int left, int middle, int right) {
		int size1 = middle - left + 1;
		int size2 = right - middle;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[left + i];
		}
		for (int i = 0; i < size2; i++) {
			arr2[i] = arr[middle + 1 + i];
		}
		int i = 0, j = 0, k = left;

		while (i < size1 && j < size2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr[i];
				i++;
			} else {
				arr[k] = arr[j];
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

	int binarySearch(int arr[], int left, int right, int key) {
		if (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == key) {
				return middle;
			} else if (arr[middle] < key) {
				return binarySearch(arr, middle + 1, right, key);
			} else {
				return binarySearch(arr, left, middle - 1, key);
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch bs = new BinarySearch();
		int arr[] = { 1, 56, 47, 5, 12, 74, 52 };
		int res = bs.search(arr, 0, arr.length - 1, 74);
		if (res == -1) {
			System.out.println("Doesn't exist");
		} else {
			System.out.println("Found at " + res + " position in array.");
		}
	}
}