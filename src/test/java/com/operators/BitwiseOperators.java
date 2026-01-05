package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 3;
		int result1 = number1 & number2;
		System.out.println(result1);
		int result2 = number1 | number2;
		System.out.println(result2);
		int result3 = number1 ^ number2;
		System.out.println(result3);
		System.out.println(~number1);
		System.out.println(5<<1);
		System.out.println(5>>1);
	}

}
