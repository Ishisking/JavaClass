package com.ExceptionHandling;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Line 1");
		try {
			
			int result = 10 / 0;   //RISKY CODE
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Line 2");
		System.out.println("Line 3");

	}

}
