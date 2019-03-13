package sorting;

public class MergeSort {

	private void merge(int arr[], int left, int middle, int right) {
		int size1 = middle - left + 1;
		int size2 = right - middle;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[left + i];
		}
		for (int j = 0; j < size2; ++j) {
			arr2[j] = arr[middle + 1 + j];
		}
		int i = 0;
		int k = left;
		int j = 0;
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

	private void sort(int arr[], int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;

			sort(arr, leftIndex, middle);
			sort(arr, middle + 1, rightIndex);

			merge(arr, leftIndex, middle, rightIndex);
		}
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int arr[] = { 12, 32, 51, 10, 5, 17, 40, 14 };
		ms.sort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
