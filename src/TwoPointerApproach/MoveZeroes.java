package TwoPointerApproach;

import java.util.Arrays;

public class MoveZeroes {

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}

	public static int[] moveZeroL(int num[]) {
		int l = 0;
		int r = num.length - 1;
		// System.out.println(l+" "+r);
		while (l < r) {

			if (num[l] == 1) {
				int temp = num[l];
				num[l] = num[r];
				num[r] = temp;
				r = r - 1;

			} else {
				l = l + 1;
			}

		}

		return num;

	}

	public static int[] moveZeroR(int num[]) {
		int l = 0;
		int r = num.length - 1;
		// System.out.println(l+" "+r);
		while (l < r) {

			if (num[r] == 1) {
				int temp = num[r];
				num[r] = num[l];
				num[l] = temp;
				l = l + 1;

			} else {
				r = r - 1;
			}

		}

		return num;

	}

	public static void main(String[] args) {

		int num[] = { 0, 1, 0, 1, 0, 1, 1, 0 };

		System.out.println(Arrays.toString(num));

		int numsortedL[] = moveZeroL(num);

		System.out.println(Arrays.toString(numsortedL));

		int numsortedR[] = moveZeroR(num);

		System.out.println(Arrays.toString(numsortedR));
	}

}
