package com.array;

public class Demo {

	public static void main(String[] args) {
		int x = 10; // Local variable and it is also a Primitive Variable
//		int marks[] = new int[4]; // Array Initialization
		System.out.println(x);
//		System.out.println(marks);
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks.length);
//		marks[0] = 9;
//		marks[1] = 8;
//		marks[2] = 7;
//		marks[3] = 5;
		int marks[]= {9,8,7,5};
//		for (int index = 0; index < marks.length; index++) {
//			System.out.println(marks[index]); }
		//Enhanced FOR Loop
		for(int c : marks)
		{
			System.out.println(c);
		}
		}
}
