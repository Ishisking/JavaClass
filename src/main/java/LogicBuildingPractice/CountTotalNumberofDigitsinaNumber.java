package LogicBuildingPractice;

public class CountTotalNumberofDigitsinaNumber {

	public static void main(String[] args) {
		int num = 1234;
		int lastdigit = 0;
		int count = 0;
		while (num != 0) {
			lastdigit = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Total Number of Digits : " + count);

	}

}
