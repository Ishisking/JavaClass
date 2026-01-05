package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical Operators !!!---Multiple Conditions
		// Logical AND : && --All the conditions needs to be True
		// Logical OR : || -- Atleast One Condition needs to be True
		// Logical NOT : ! ----Inversion

		System.out.println((5 > 4) && (5 < 2));
		System.out.println((5 > 4) || (5 < 2));
		System.out.println(!(5 < 2));
		System.out.println(!((5 > 4) || (5 < 2)));
	}

}
