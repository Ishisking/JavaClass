package com.conditional;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 1000;
		int b = 1500;
		int x = (a > b) ? a : b;
	//	System.out.println("Max is x : " + x);
		if (a == x) {
			System.out.println(" a is largest : " + a);
		} else
			System.out.println("b is Largest : " + b);
	}
}
