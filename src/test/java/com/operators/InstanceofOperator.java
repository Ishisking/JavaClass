package com.operators;

public class InstanceofOperator {

	public static void main(String[] args) {
		// Instance of ---->Tells if an object belongs to a certain class or not!
		// String name = "Ishaan";
		StringBuilder name = new StringBuilder("Ishaan");
		if (name instanceof Object) {
			System.out.println("YES");
		}
		Integer number = 10;
		if (number instanceof Integer) {
			System.out.println("YEPP");
		}
	}

}
