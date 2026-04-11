package UdemyCodingRound2025;

import java.util.Arrays;

public class MaxProductofTriplets {
	public static void main(String[] args) {
		int a[] = { -10, -3, 5, 6, -20 };
		int n = a.length;
		if (n < 3) {
			System.err.println("Minimum No. of Elements that should be there in an Array should be 3");
			System.exit(0);
		}
		// Step1: Sort the Array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int resultOne = a[n - 1] * a[n - 2] * a[n - 3];
		System.out.println(resultOne);
		int resultTwo = a[0] * a[1] * a[n - 1];
		int result = Math.max(resultOne, resultTwo);
		System.out.println(result);

	}
}
