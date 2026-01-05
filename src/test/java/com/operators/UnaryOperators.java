package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a; // Declaration
		a = +5; // Assignment Positive Number
		int b;
		b = -a; // -5
		System.out.println(" b " + b);
		System.out.println(" a " + a);
		int c;
		c = --a; // PRE DECREMENT --DECREMENT first and then use
		System.out.println("c " + c);
		System.out.println("a " + a);
		c = ++a; // PRE INCREMENT --INCREMENT first and then use
		System.out.println("c " + c);
		System.out.println("a " + a);
		c = a--; // POST DECREMENT --USE FIRST AND THEN DECREMENT
		System.out.println("c " + c);
		System.out.println("a " + a);
		c = a++; // POST INCREMENT --USE First and then Increment
		System.out.println("c " + c);
		System.out.println("a " + a);
		boolean isStatus = false;
		isStatus = !isStatus;
		System.out.println(isStatus);
	}

}
