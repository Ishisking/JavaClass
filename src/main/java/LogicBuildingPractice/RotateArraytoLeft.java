package LogicBuildingPractice;

import java.util.Arrays;

public class RotateArraytoLeft {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		k = k % a.length;
		int left = 0, right = a.length - 1;
		a = reverse(a, 0, k-1);
		System.out.println(Arrays.toString(a));
		a = reverse(a, k, a.length-1);
		System.out.println(Arrays.toString(a));
		a = reverse(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static int[] reverse(int a[], int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		return a;
	}
}