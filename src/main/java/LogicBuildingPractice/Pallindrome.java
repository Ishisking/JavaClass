package LogicBuildingPractice;

//import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number :");
//		int number = sc.nextInt();
//		System.out.println("number =" + number);
//		 Convert this number to String
		int number = 899;

		String originalNumberInString = Integer.toString(number);
		String originalNumberInString2 = number + "";
		// Reverse this String and for that i will be using special Class
		// --StringBuilderClass
		StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = reverseStringBuilder.reverse().toString();
		System.out.println(reverseStringBuilder.reverse());
// Compare 2 Strings
		if (originalNumberInString.equals(reverseString)) {
			System.out.println("Pallindrome");
		} else
			System.out.println("Its not a Pallindrome");
		// sc.close();
	}

}
