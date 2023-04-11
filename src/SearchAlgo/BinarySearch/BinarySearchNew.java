package SearchAlgo.BinarySearch;

//Binary search
class BinarySearchNew {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int low = 0;
		int high = arr.length - 1;
		int key = 7;

		Boolean isFound = binarySearchAlgo(arr, key, low, high);

		int index = search(arr, key);

		System.out.println(index);
	}

	static Boolean binarySearchAlgo(int arr[], int key, int low, int high) {

		Boolean isKeyFound = false;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				isKeyFound = true;
				return isKeyFound;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return isKeyFound;

	}

	public static int search(int[] nums, int target) {
		int index = -1, low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				index = mid;
				break;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return index;
	}
}
