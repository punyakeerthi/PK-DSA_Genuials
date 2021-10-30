package SearchAlgo.BinarySearch.Problems;

/*Find the maximum element in an array which is first increasing and then decreasing
Difficulty Level : Easy
Last Updated : 06 Aug, 2021
Given an array of integers which is initially increasing and then decreasing, find the maximum value in the array. 
Examples : 
 

Input: arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}
Output: 500

Input: arr[] = {1, 3, 50, 10, 9, 7, 6}
Output: 50

Corner case (No decreasing part)
Input: arr[] = {10, 20, 30, 40, 50}
Output: 50

Corner case (No increasing part)
Input: arr[] = {120, 100, 80, 20, 0}
Output: 120 */
class FindMaximumNum {
  public static void main(String[] args) {

		// int arr[] = { 9, 10, 11, 13, 14, 50, 52, 53, 55, 3, 2 ,1};
		// int arr[] = { 99, 90, 16, 15, 14, 7, 6, 5, 4, 3, 2 ,1};
		 int arr[] = { 1,2,3,4,5,6,7,8,9,10,99, 90, 16, 15, 14, 7, 6, 5, 4, 3, 2 ,1};
		//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int start = 0;
		int end = arr.length - 1;
		int max = findMaximum(arr, start, end);

		System.out.println("Maximum: " + max);
	}

	public static int findMaximum(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start];
		} else if (end == start + 1) {
			if (arr[start] >= arr[end]) {
				return arr[start];
			} else {
				return arr[end];
			}
		} else {

			int mid = (start + end) / 2;

			if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
				return arr[mid];
			} else if (arr[mid] >= arr[mid + 1] && arr[mid] <= arr[mid - 1]) {
				return findMaximum(arr, start, mid - 1);
			} else {
				return findMaximum(arr, mid + 1, end);
			}

		}

	}
}

