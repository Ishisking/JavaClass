package com.Student.Management.System;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// Store the information of the Students
		String studentName;
		int studentAge;
		double marksObtainedInEnglish;
		double marksObtainedInScience;
		double marksObtainedInMaths;
		String studentGrade;
		int studentRollNumber;
		System.out.println("Student Management System");
		System.out.println("Enter the Student Name");
		Scanner sc = new Scanner(System.in);
		studentName = sc.next();
		System.out.println("Enter the Student Age ");
		studentAge = sc.nextInt();
		System.out.println("Enter the Marks Obtained in English");
		marksObtainedInEnglish = sc.nextDouble();
		System.out.println("Enter the Marks Obtained in Science");
		marksObtainedInScience = sc.nextDouble();
		System.out.println("Enter the Marks Obtained in Mathematics");
		marksObtainedInMaths = sc.nextDouble();
		System.out.println("Enter Student Roll No.");
		studentRollNumber = sc.nextInt();
		// Calculate Student Grade Automatically
		studentGrade = calculateGrade(marksObtainedInEnglish, marksObtainedInScience, marksObtainedInMaths);
		System.out.println("\n------ Student Details ------");
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Age :" + studentAge);
		System.out.println("Marks Obtained");
		System.out.println("ENGLISH :" + marksObtainedInEnglish);
		System.out.println("SCIENCE :" + marksObtainedInScience);
		System.out.println("MATHEMATICS :" + marksObtainedInMaths);
		System.out.println("Student Grade :" + studentGrade);
		System.out.println("Student Roll No.:" + studentRollNumber);

		sc.close();

	}

	// Grade Calculation Method
	private static String calculateGrade(double marksObtainedInEnglish, double marksObtainedInScience,
			double marksObtainedInMaths) {
		double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
		double Average = totalMarks / 3;
		if (Average >= 95) {
			return "A+";
		} else if (Average >= 90) {
			return "A";
		} else if (Average >= 85) {
			return "B+";
		} else if (Average >= 80) {
			return "B";
		} else if (Average >= 75) {
			return "C+";
		} else if (Average >= 70) {
			return "C";
		} else if (Average >= 65) {
			return "D+";
		} else if (Average >= 60) {
			return "D";
		} else {
			return "Fail";
		}
	}
}