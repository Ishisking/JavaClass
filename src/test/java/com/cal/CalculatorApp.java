package com.cal;

public class CalculatorApp {

	public static void main(String[] args) { // Starting Point
		double number1;
		int number2;
		number1 = 11; // 10.0
		number2 = 5; // 5
		double result;
		result = calculateSum(number1, number2); // Method Calling
		System.out.println(result); // 105.0
		result = CalculateSubstractionofTwoNumbers(number1, number2);
		System.out.println(result); // 95.0
		result = calculateDivisionofTwoNumbers(number1, number2);
		System.out.println(result);
		result = calculateMultiplicationofTwoNumbers(number1, number2);
		System.out.println(result);

	} // End of Main method

	public static double calculateMultiplicationofTwoNumbers(double number1, int number2) {
		double result;
		result = number1 * number2;
		return result; // 50.0
	}

	public static double calculateDivisionofTwoNumbers(double number1, int number2) {
		double result;
		result = number1 / number2;
		return result; // 2.0
	}

	public static double CalculateSubstractionofTwoNumbers(double number1, int number2) {
		double result;
		result = number1 - number2;
		return result; // 5.0
	}

	public static double calculateSum(double number1, int number2) { // Method Declaration
		double result = number1 + number2;
		return result;
	}

}