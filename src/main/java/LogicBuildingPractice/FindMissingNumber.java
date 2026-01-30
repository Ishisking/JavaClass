package LogicBuildingPractice;

public class FindMissingNumber {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 4, 5, 6 };
		int totalNumbers = 6;
		int totalSumofAllNumbers = (totalNumbers * (totalNumbers + 1)) / 2;
		System.out.println(totalSumofAllNumbers);

		// Total sum of the given array
		int sumofArray = 0;
		for (int i = 0; i <= numbers.length - 1; i++) {
			sumofArray = sumofArray + numbers[i];
		}
		System.out.println(sumofArray);
		System.out.print("Missing Number = ");
		System.out.println(totalSumofAllNumbers - sumofArray);
	}

}
