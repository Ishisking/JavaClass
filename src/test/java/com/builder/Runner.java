package com.builder;

public class Runner {

	public static void main(String[] args) {
//		Emp e1 = new Emp("Jatin", 101, 100000);
//		System.out.println(e1);
		Emp e2 = new Emp.Builder().name("Uday").salary(50000).empId(102).build();
		System.out.println(e2);
	}

}
