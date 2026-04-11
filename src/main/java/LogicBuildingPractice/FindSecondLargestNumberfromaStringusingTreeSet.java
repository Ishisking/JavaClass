package LogicBuildingPractice;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondLargestNumberfromaStringusingTreeSet {

	public static void main(String[] args) {
		String input = "11f03h4y5abc123";
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		char data[] = input.toCharArray();

		int num;
		TreeSet<Integer> dataSet = new TreeSet<Integer>();
		for (char character : data) {
			if (Character.isDigit(character)) {
				num = character - '0'; // convert the character into int!!
				dataSet.add(num);
			}
		}
		System.out.println(dataSet);
		dataSet.pollLast();
	//	System.out.println(dataSet);
		System.out.println("The Second Largest Number is : " + dataSet.last());
	}
}
