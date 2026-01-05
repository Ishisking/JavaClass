package com.conditional;

public class MaxofThreeNos {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		if (a > b && a > c) {
			System.out.println("a is Largest a = " + a);
		} else if (b > a && b > c) {
			System.out.println("b is Largest b = " + b);
		} else
			System.out.println("c is largest c = " + c);
	}

}
