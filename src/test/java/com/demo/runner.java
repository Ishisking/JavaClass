package com.demo;

public class runner {

	public static void main(String[] args) {
		person p1 = new person("Uday", 9);
		p1.setName("Ishaan");
		p1.setId(5);
		System.out.println(p1.getName());
		System.out.println(p1.getId());

//		person p2 = new person();
//		System.out.println(p2.getName());
//		System.out.println(p2.getId());
//
//		person copyperson = new person(p1);
//		System.out.println(copyperson.getName());
//		System.out.println(copyperson.getId());
	}

}
