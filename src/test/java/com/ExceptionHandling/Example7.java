package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example7 {
								// TRY CATCH WITH RESOURCES
	public static void main(String[] args) {
		// Java to read Demo.txt file and print the content on the console
		File file = new File("demo.txt"); // Initialization
		String data = null; // Initialization
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			// Perform the Risky code
			data = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);

	}

}
