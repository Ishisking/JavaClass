package LogicBuildingPractice;

public class PrintConsequtiveNumbersWhoseSumis10 {

	public static void main(String[] args) {
		int a[] = { 7, 5, 1, 4, 5, 8, 2 };
		int target = 10;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum = sum + a[j];
				if (sum > target) {
					break;
				}
				if (sum == target) {
					for (int k = i; k <= j; k++) {
						System.out.println(a[k]);
					}
				}
			}
		}
	}

}
