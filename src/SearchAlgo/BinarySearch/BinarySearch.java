package SearchAlgo.BinarySearch;

//Binary search
class BinarySearch {
 
    
    public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int low = 0;
		int high = arr.length - 1;
		int key = 11;

		Boolean isFound = binarySearch(arr, key, low, high);
		Boolean isFoundP = recBinarySearch(arr, key, low, high);

		System.out.println(isFound);
		System.out.println(isFoundP);
	}

	// Binary search with iteration
	public static Boolean binarySearch(int[] arr, int key, int low, int high) {

		Boolean isExist = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				isExist = true;
				break;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return isExist;

	}

	public static Boolean recBinarySearch(int[] arr, int key, int low, int high) {

		Boolean isExist = false;
		if (low == high) {
			if (arr[low] == key) {
				isExist = true;
				return isExist;
			} else {
				return isExist;
			}

		} else {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				isExist = true;
				return isExist;
			} else if (key < arr[mid]) {
				return recBinarySearch(arr, key, low, mid - 1);
			} else {
				return recBinarySearch(arr, key, mid + 1, high);
			}

		}

	}
    
  }

