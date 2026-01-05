package com.cal;

public class cal {

	public static void main(String[] args) {
		int numberOne = 16;
		int numberTwo = 50;
		int numberThree = 10;
		addThreeNumbers(numberOne, numberTwo, numberThree);
		addTwoNumbers(44.4, 40);
		addTwoNumbers(numberOne, numberTwo);
		addTwoNumbers(40,28);
	}
		private static void addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
		System.out.println(numberOne + numberTwo + numberThree);
	}
	private static void addTwoNumbers(int numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}
	private static void addTwoNumbers(double numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}
}
