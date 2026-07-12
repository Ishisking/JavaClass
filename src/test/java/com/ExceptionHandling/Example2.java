package com.ExceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		// Simple try Catch Block
		try {
			int result = 10 / 10;
			Person p = null;
			System.out.println(p.getName());
		}
		/*
		 * catch (ArithmeticException e) { System.err.println(e.getMessage());
		 * e.printStackTrace(); } catch (NullPointerException e) {
		 * System.err.println(e.getMessage()); e.printStackTrace(); } catch
		 * (IndexOutOfBoundsException e) { System.err.println(e.getMessage());
		 * e.printStackTrace(); }
		 */ // catch block can be written in one line as below
		catch (ArithmeticException | NullPointerException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
