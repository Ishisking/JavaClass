package com.StringDemo;

public class StringDemo {

	public static void main(String[] args) {
		int x = 10;
		String name = "ishaan";
		String name2 = "ishaan";
		int y = 10;
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(x == y); // value comparison takes place
		System.out.println(name == name2); // reference Hashcode is compared
		System.out.println(name.equals(name2)); // values are checked here
		System.out.println(name.equalsIgnoreCase(name2));// values are checked

	}

}
