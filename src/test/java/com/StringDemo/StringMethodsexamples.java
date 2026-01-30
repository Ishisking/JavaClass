package com.StringDemo;

public class StringMethodsexamples {

	public static void main(String[] args) {
		String data = "     apple    ";
		String data2 = "Apple";
		// Equals and EqualsIgnore case
		System.out.println(data.hashCode());
		System.out.println(data2.hashCode());
		// Method 1
		System.out.println(data == data2);// checks references Hash code
		System.out.println(data.equals(data2)); // checks values
		System.out.println(data.equalsIgnoreCase(data2));

		// Method 2 length() check : Returns me the size of the String !! Total Number
		// of characters present in the string
		System.out.println(data.length());

		// Method 3 trim()
		data = data.trim();
		System.out.println(data.length());

		// Method 4 & Method 5 toLowerCase() toUpperCase()
		data = data.toLowerCase();
		System.out.println(data.toUpperCase());
		System.out.println(data.toLowerCase());

		// Method 6 String Concatenation Joining of Multiple Strings
		System.out.println(data + "123" + "abc");
		System.out.println(data.concat("XYZ"));
		// METHOD charAT()
		System.out.println(data.charAt(4));
		// Method contains()
		System.out.println(data.contains("pp"));
		// Method isEmpty
		System.out.println(data.isEmpty());
		String meta = "";
		System.out.println(".isEmpty()");
		System.out.println(meta.isEmpty());
		String data3 = ""; //Empty String
		System.out.println(data3.isEmpty());
	}

}
