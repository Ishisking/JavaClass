package com.array;

import java.util.Arrays;

public class JaggedArrayEx {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		for (int temp : a) {
			System.out.println(temp);
		}
		System.out.println(Arrays.toString(a));
		int b[][] = new int[2][2];
		b[0][0] = 100;
		b[0][1] = 200;
		b[1][0] = 400;
		b[1][1] = 600;
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

		int j[][] = new int[2][]; // JAGGED ARRAY
		j[0] = new int[] { 10, 20, 30 };
		j[1] = new int[] { 50 };
		System.out.println(j.length);
		System.out.println(j[1].length);
		//TRAVESING A JAGGED ARRAY
		for (int rowIndex = 0; rowIndex < j.length; rowIndex++) {
			for (int colIndex = 0; colIndex < j[rowIndex].length; colIndex++) {
				System.out.print(j[rowIndex][colIndex] + " ");
			}
			System.out.println("");
		}

	}

}
