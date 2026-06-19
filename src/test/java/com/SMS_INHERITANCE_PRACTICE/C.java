package com.SMS_INHERITANCE_PRACTICE;

public class C extends A {
	protected int z;

	public C(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

public void add() {
	System.out.println(x+y+z);
	}
}
