package algorithms;

import java.util.stream.IntStream;

public class SearchInRotatedArray {

	public static int search(int[] nums, int target) {

		if (nums.length == 1)
			return nums[0] == target ? 0 : -1;

		if (nums.length == 2)
			return IntStream.range(0, nums.length).filter(i -> (nums[i] == target)).findFirst().orElse(-1);

		return binarySearch(nums, 0, nums.length - 1, target);
	}

	public static int binarySearch(int[] nums, int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			}

			if (nums[low] <= nums[mid]) {
				if (key < nums[mid] && key >= nums[low]) {
					return binarySearch(nums, low, mid - 1, key);
				} else {
					return binarySearch(nums, mid + 1, high, key);
				}
			} else {
				if (key > nums[mid] && key <= nums[high]) {
					return binarySearch(nums, mid + 1, high, key);
				} else {
					return binarySearch(nums, low, mid - 1, key);
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 3, 4 };
		System.out.println(search(arr, 1));
	}
}
