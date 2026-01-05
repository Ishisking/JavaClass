package com.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Mathematical Operations + - * / %
		int number1 = 10; // Declaration + Initialization
		int number2 = 20;
		double result;
		result = number1 + number2;
		System.out.println("Result = " + result);
		result = number1 - number2;
		System.out.println("Result = " + result);
		result = number1 * number2;
		System.out.println("Result = " + result);
		result = ((double)number1) / number2;    //Explicit TypeCasting
		System.out.println("Result = " + result);//Here we are telling java explicity to consider number1 as double and not integer
		result = number1 % number2;
		System.out.println("Result = " + result);
	}

}
