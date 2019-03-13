package sorting;

public class QuickSort {

	private int partition(int arr[], int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp= arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	private void sort(int arr[], int low, int high) {

		if (low < high) {
			int pP = partition(arr, low, high);
			
			sort(arr, low, pP - 1);
			sort(arr, pP + 1, high);
		}

	}
	
	public static void main(String args[]) {
		int arr[] = { 10, 20, 90, 40, 23, 56, 12 };
		int n = arr.length;

		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, n - 1);
		
		for(int i =0;i<n;++i){
			System.out.print(arr[i] + " ");
		}
	}
}
