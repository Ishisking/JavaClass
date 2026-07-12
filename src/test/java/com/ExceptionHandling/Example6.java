package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {

	public static void main(String[] args) {
		// Java to read Demo.txt file and print the content on the console
		File file = new File("demo.txt"); // Initialization
		FileReader fileReader; // Initialization
		BufferedReader bufferedReader = null; // Initialization
		String data = null; // Initialization
		try {
			fileReader = new FileReader(file); // Perform the Risky code
			bufferedReader = new BufferedReader(fileReader);
			data = bufferedReader.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close(); // Close the file
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println(data);

	}

}
