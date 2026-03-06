package LogicBuildingPractice;

import java.util.Arrays;

public class FindSecondLargestNumberfromaString {

	public static void main(String[] args) {
		String input = "abc123";
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		char[] inputArray = input.toCharArray();
//		char temp = '3'; // 51 ASCII value for character '3'(temp-0=51-48=3)
//		int number = temp - '0'; // 51-48=3
//		System.out.println(number);
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int num;
		for (char c : inputArray) {
			if (Character.isDigit(c)) {
				num = c - '0'; // convert the character into int!!
				if (num > first) {
					second = first;
					first = num;
				} else if (num > second && num < first) {
					second = num;
				}

			}
		}
		System.out.println("The Second Largest Number is : "+second);
	}
}
