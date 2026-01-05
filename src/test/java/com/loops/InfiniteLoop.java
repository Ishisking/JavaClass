package com.loops;

public class InfiniteLoop {
	public static void main(String[] args) {
		int i = 1;
		while (true) {
			if (i == 6) {
				break; // Exit from the Loop
			} else {
				System.out.println("Hi Iam in a Loop");
				i++;
			}
		}
	}
}
