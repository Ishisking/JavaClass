package LogicBuildingPractice;

public class MountainArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 10, 4, 2, 0 };
		System.out.println(mountainArrayCheck(a));
	}

	private static boolean mountainArrayCheck(int[] a) {
		// 1) Length of the Array should be greater than 2.
		if (a.length < 3) {
			return false;
		}
		// 2) The Elements from the 0th index to the ith index should be in Increasing
		// order.
		int i = 0;
		while (i + 1 < a.length && a[i + 1] > a[i]) {
			i++;
		}
		while (i + 1 < a.length && a[i + 1] < a[i]) {
			i++;
		}
		if (a.length - 1 == i) {
			return true;
		} else {
			return false;
		}
	}

}
