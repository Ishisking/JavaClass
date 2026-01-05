package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max number is :" + max);
		int number = 25;
		boolean isEven = (number % 2 == 0) ? true : false;
		System.out.println(isEven);
	}

}
