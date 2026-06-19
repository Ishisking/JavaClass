package com.SMS_INHERITANCE_PRACTICE;

public class B extends A {
	int x = 30;

	public B(int x, int y) {
		super(x, y);
	}

	public void add() {
		int y = 40;
		System.out.println(super.x + y);
	}
}
