package LogicBuildingPractice;

import java.util.Arrays;

public class FindSecondLargestNumberinArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 51, 25, 55, 61, 71, 88, 3, 5, 91 };
		Arrays.sort(a);
		int secondLargest = a[a.length - 2];
		System.out.println("Second Largest Number in the Array is :" + secondLargest);
	}
}
