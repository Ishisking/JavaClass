package LogicBuildingPractice;

import java.util.Scanner;

public class PallindromeusingStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number = sc.nextInt();
		int originalNumber = number;
		System.out.println("number =" + number + "and originalNumber =" + originalNumber);
		int reverse = 0;
		int lastdigit = 0;
		while (number != 0) {
			lastdigit = number % 10;
			reverse = reverse * 10 + lastdigit;
			number = number / 10;
		}
		System.out.println("Reverse of Number n is " + reverse);
		if (reverse == originalNumber) {
			System.out.println("Number : " + originalNumber + " is a Pallindrome");
		} else {
			System.out.println("Number is not a Pallindrome ");
		}
		sc.close();
	}

}
