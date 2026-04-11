package UdemyCodingRound2025;

import java.util.Arrays;

public class RearrangeEvenandOdd {

	public static void main(String[] args) {
		int a[] = { 4, 0, 1, 0, 9, 6, 0, 2, 5, 3, 7 };
		int left = 0;
		int right = a.length - 1;
		System.out.println("Start :" + Arrays.toString(a));
		while (left < right) {

			while (left < right && a[left] % 2 == 0) {
				left++;
			}
			while (left < right && a[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(a));
		}
		int evenEnd = 0;
		while (evenEnd < a.length && a[evenEnd] % 2 == 0) {
			evenEnd++;
		}
		Arrays.sort(a, 0, evenEnd);
		Arrays.sort(a, evenEnd, a.length);
		System.out.println("        EvenEnd :    " + evenEnd);
		System.out.println("Result " + Arrays.toString(a));
	}
}
