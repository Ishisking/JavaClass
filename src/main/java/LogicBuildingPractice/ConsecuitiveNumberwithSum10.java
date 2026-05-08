package LogicBuildingPractice;

public class ConsecuitiveNumberwithSum10 {

	public static void main(String[] args) {
		int a[] = { 7, 5, 1, 4, 5, 8, 2 };
		int target = 10;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
				if (sum == target) {
					for (int k = i; k <= j; k++) {
						System.out.print(a[k]);
					}
					System.out.println();
				}
				if (sum > target) {
					break;
				}
			}

		}

	}

}
