package LogicBuildingPractice;

public class EvenOddusingBitwise {

	public static void main(String[] args) {
		int number = 590;
		if ((number & 1) == 1) {
			System.out.println("The number is odd");
		} else
			System.out.println("The number is even");
	}

}
