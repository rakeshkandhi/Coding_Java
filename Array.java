package dsa;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a[] = { 1, 9, 3, 4, 5, 6, 7, 8 };
		max_ele(a);
		reverse(a);
	}

	public static int max_ele(int[] a) {
		int max = a[0];
		for (int i : a) {
			if (max < i)
				max = i;
		}
		return max;
	}

	public static void reverse(int[] a) {
		int temp, n = a.length;
		for (int i = 0; i < n / 2; i++) {
			temp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = temp;
		}
		System.out.print("Reversed array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}