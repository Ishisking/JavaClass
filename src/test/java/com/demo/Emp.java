package com.demo;

public class Emp {
	private String name;

	private Emp(String name) {
		this.name = name;
	}

	public static Emp createEmpAccount(String name) {
		Emp e1 = new Emp(name);
		return e1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
