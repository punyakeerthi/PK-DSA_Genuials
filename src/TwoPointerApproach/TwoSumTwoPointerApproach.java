package TwoPointerApproach;

import java.util.Arrays;

/*1. Two Sum
Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109*/

public class TwoSumTwoPointerApproach {

	public static int[] twoSum(int[] nums, int target) {

		int indexArr[] = new int[2];

		int numsSort[]=nums.clone();
		Arrays.sort(numsSort);
		System.out.println(Arrays.toString(numsSort));
		int l = 0;
		int r = nums.length - 1;
		


		while (l < r) {
			if ((numsSort[l] + numsSort[r]) == target) {
				break;
			}

			else if ((numsSort[l] + numsSort[r]) > target) {
				r = r - 1;
			} else {
				l = l + 1;
			}

		}

		indexArr[0] = numsSort[l];
		indexArr[1] = numsSort[r];
		return indexArr;

	}

	public static int findIndex(int arr[], int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}

		return 0;

	}

	public static void main(String[] args) {

//		int nums[] = { 2, 7, 11, 15 };
	//	int target = 9;
		// int nums[] = { 3, 2, 4 };
		//int target = 6;

		
		// int nums[] = {3, 3};
		//int target = 6;
		
		 int nums[] = {3,2,3};
		 System.out.println(nums.length-1);
		int target = 6;

		
		System.out.println(Arrays.toString(nums));
		int indexArr[] = twoSum(nums, target);
		System.out.println(Arrays.toString(nums));

		System.out.println(Arrays.toString(indexArr));
		int l=Integer.MIN_VALUE,r=Integer.MIN_VALUE;
		if(indexArr[0]!=indexArr[1])
		{
			l = findIndex(nums, indexArr[0]);
			r = findIndex(nums, indexArr[1]);
		}
		else
		{
			 l = findIndex(nums, indexArr[0]);
			nums[l]=Integer.MIN_VALUE;
			 r = findIndex(nums, indexArr[0]);
						
		}

		System.out.println(l + " " + r);

	}

}
