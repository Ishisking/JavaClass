package LogicBuildingPractice;

public class AllArmStrongNumbers {

	public static void main(String[] args) {
		int lastdigit;
		for (int i = 1; i <= 1000; i++) {
			int copy = i;
			int armstrong = 0;
			while (copy != 0) {
				lastdigit = copy % 10;
				copy = copy / 10;
				armstrong = armstrong + lastdigit * lastdigit * lastdigit;
			}
			if (i == armstrong) {
				System.out.println("The Number " + i + " is an Armstrong Number ");
			}
		}
	}

}
