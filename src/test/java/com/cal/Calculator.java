package com.cal;

public class Calculator {

	public static void main(String[] args) { // Starting Point
		double number1;
		int number2;
		number1 = 10; // 10.0
		number2 = 5; // 5
		double result = number1 + number2;
		calculateSum(); // Method Calling
		System.out.println(result); // 15.0
		result = number1 - number2;
		System.out.println(result); // 5.0
		result = number1 / number2;
		System.out.println(result); // 2.0
		result = number1 * number2;
		System.out.println(result); // 50.0

	} // End of Main method

	public static void calculateSum() { // Method Declaration
		double result = 300 + 15;
		System.out.println(result);
	}

}
