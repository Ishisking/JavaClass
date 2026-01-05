package LogicBuildingPractice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		int on = n;
		System.out.println("n =" + n + "and on =" + on);
		int reverse = 0;
		int lastdigit = 0;
		while (n != 0) {
			lastdigit = n % 10;
			reverse = reverse * 10 + lastdigit;
			n = n / 10;
		}
		System.out.println("Reverse of Number n is "+on);
		if (reverse == on) {
			System.out.println("Number on =" + on + " is a Pallindrome");
		} else {
			System.out.println("Number is not a Pallindrome ");
		}
		sc.close();
	}

}
