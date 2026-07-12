package com.ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		// Simple try Catch Block
		try {
			int result = 10 / 10;
			int a[] = new int[3];
			System.out.println(a[3]);
			Person p = null;
			System.out.println(p.getName());
		} catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Hello in the finally Block");
		}
	}

}
