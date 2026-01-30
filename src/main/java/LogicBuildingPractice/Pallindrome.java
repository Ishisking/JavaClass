package LogicBuildingPractice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("number =" + number);
//		 Convert this number to String
//		int number = 899;

		String originalNumberInString = Integer.toString(number);
		String originalNumberInString2 = number + "";
		// Reverse this String and for that i will be using special Class
		// --StringBuilderClass
		StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = reverseStringBuilder.reverse().toString();
		System.out.println("Reverse Number ="+reverseString);
		System.out.print(reverseStringBuilder.reverse());
// Compare 2 Strings
		if (originalNumberInString.equals(reverseString)) {
			System.out.print(" : is a Pallindrome");
		} else
			System.out.print(" : is not a Pallindrome");
		 sc.close();
	}

}
