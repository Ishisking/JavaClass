package LogicBuildingPractice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int lastdigit;
		int armstrong = 0;
		int copy = n;
		while (n != 0) {
			lastdigit = n % 10;
			n = n / 10;
			armstrong = armstrong + lastdigit * lastdigit * lastdigit;
		}
		if (copy == armstrong) {
			System.out.println("The Number " + copy + " is an Armstrong Number ");
		} else {
			System.out.println("The number " + copy + " is not an Armstrong Number");
		}
		
	}

}
