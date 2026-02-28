package com.inheritance;

public class B extends A {
		int x=30;
	public B(int x, int y) {
		super(x, y);

	}

	public void add() {
		int x=50;
		int y=70;
System.out.println(super.x + y);
	}

}
