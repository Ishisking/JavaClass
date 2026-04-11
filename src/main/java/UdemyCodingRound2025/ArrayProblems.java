package UdemyCodingRound2025;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 0, 1, 3, 2 };
		int totalSum = 0;
		System.out.println(Arrays.toString(a));
		for (int c : a) {
			totalSum = totalSum + c;
		}
		System.out.println(totalSum);
		System.out.println("************************************************************");

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		for (int num : a) {
			if (num > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = num;
			} else if (num > secondLargestNumber && num != largestNumber) {
				secondLargestNumber = num;
			}
		}
		System.out.println("Largest Number is :" + largestNumber);
		System.out.println("Second Largest Number is :" + secondLargestNumber);
		System.out.println("************************************************************");
		int len = a.length;
		int mid = a.length / 2;
		System.out.println("Length of Array is: " + a.length);

		int left = 0;
		int right = mid - 1;
		System.out.println(Arrays.toString(a));
		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(a));

		System.out.println("************************************************************");
		int totalNumberofElements = a.length;
		double avg = ((double) totalSum / totalNumberofElements);
		System.out.println("Average :" + avg);
		System.out.println(Arrays.toString(a));
		int l = mid;
		int r = a.length-1;
		while (l < r) {
			int tempo = a[l];
			a[l] = a[r];
			a[r] = tempo;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
