package sorting;

public class MergeSortCheck {

	private static void mergeSort(int arr[], int fI, int middle, int lI) {
		int size1 = middle - fI + 1;
		int size2 = lI - middle;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[fI + i];
		}
		for (int i = 0; i < size2; i++) {
			arr2[i] = arr[middle + 1 + i];
		}

		int i = 0, j = 0, k = fI;
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

	private static void pleaseSort(int arr[], int fI, int lI) {
		if (fI < lI) {
			int middle = (fI + lI) / 2;

			pleaseSort(arr, fI, middle);
			pleaseSort(arr, middle + 1, lI);

			mergeSort(arr, fI, middle, lI);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 11, 1, 13, 21, 3, 7 };
		int fI = 0;
		int lI = arr.length - 1;
		pleaseSort(arr, fI, lI);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
