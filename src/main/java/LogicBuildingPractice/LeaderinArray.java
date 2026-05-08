package LogicBuildingPractice;

public class LeaderinArray {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };
		int maxRight = a[a.length - 1];
		int length = a.length - 2;
		System.out.println("Leader in Array");
		System.out.print(maxRight + " ");
		for (int index = length; index >= 0; index--) {
			if (a[index] > maxRight) {
				maxRight = a[index];
				System.out.print(maxRight + " ");
			}
		}
	}

}
