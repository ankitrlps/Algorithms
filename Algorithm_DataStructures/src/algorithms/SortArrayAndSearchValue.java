package algorithms;

public class SortArrayAndSearchValue {

	private void merge(int arr[], int left, int middle, int right) {

		int size1 = middle - left + 1;
		int size2 = right - middle;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[left + i];
		}

		for (int j = 0; j < size2; j++) {
			arr2[j] = arr[middle + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;
		while (i < size1 && j < size2) {
			if (arr1[i] <= arr2[j]) {
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

	private int binarySearch(int arr[], int low, int high, int key) {
		if (low <= high) {
			int middle = (low + high) / 2;
			if (arr[middle] == key) {
				return middle;
			}
			if (arr[middle] < key) {
				return binarySearch(arr, middle + 1, high, key);
			} else if (arr[middle] > key) {
				return binarySearch(arr, low, middle - 1, key);
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 12, 32, 20, 6, 40, 14, 14, 8 };
		int high = arr.length - 1;
		SortArrayAndSearchValue ms = new SortArrayAndSearchValue();
		
		//Sorting
		ms.sort(arr, 0, high);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//Searching
		int key = 12;
		int result = ms.binarySearch(arr, 0, high, key);
		if (result == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found at: " + result + "th position.");
		}
	}
}