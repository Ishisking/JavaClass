package com.StringDemo;

import java.util.Arrays;

public class StringMethodsPart3 {

	public static void main(String[] args) {
		String data = "Hello World I am new to Java!!!";
		String words[] = data.split(" ");
		for (String c : words) {
			System.out.println(c);
		}
		System.out.println(Arrays.toString(words));
	}

}
