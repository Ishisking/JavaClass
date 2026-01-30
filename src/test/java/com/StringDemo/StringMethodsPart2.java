package com.StringDemo;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		String data = "Hello World";

		String result = data.substring(1, 5);
		System.out.println(result);
		// replace
		String replaceddata = data.replace('l', 'L');
		System.out.println(replaceddata);
		
		char c=data.charAt(4);
		System.out.println(c);
		
int indexofcharacter=data.indexOf('o');//Return you the index of First Occurrence!!
System.out.println(indexofcharacter);
int indexofLastoccurrence=data.lastIndexOf('o');
System.out.println(indexofLastoccurrence);
	}
	

}
