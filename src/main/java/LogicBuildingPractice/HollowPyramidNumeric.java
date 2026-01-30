package LogicBuildingPractice;

public class HollowPyramidNumeric {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == number) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}
