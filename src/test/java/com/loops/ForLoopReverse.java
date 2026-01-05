package com.loops;

public class ForLoopReverse {

	public static void main(String[] args) {
		System.out.println("1 to 5 Numbers :");
//		for (int i = 5; i >= 1; i--) {
//			System.out.println(i); }
//
		int i = 5, j = 1;
		for(; i >=1 && j <=5; i--, j++)
		{
			System.out.println(i+" "+j);
		}
	}
}
