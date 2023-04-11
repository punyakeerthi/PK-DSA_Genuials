package TwoPointerApproach;

import java.util.Arrays;

public class MoveZeroesWithRelativeSort {

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}

	public static int[] moveZeroL(int nums[]) {

		int slow = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[slow];
				nums[slow] = nums[i];
				nums[i] = temp;
				slow = slow + 1;
			}

		}
		// System.out.println(Arrays.toString(nonZeroArr));

		return nums;

	}

	public static void main(String[] args) {

//		int num[] = { 0, 1, 0, 3, 12 };

		int num[] = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };

		System.out.println("Before: " + Arrays.toString(num));

		int numsortedL[] = moveZeroL(num);

		System.out.println("After " + Arrays.toString(numsortedL));

	}

}
