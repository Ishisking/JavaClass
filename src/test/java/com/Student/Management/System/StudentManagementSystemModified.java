package com.Student.Management.System;

import java.util.Scanner;

public class StudentManagementSystemModified {
	public static String studentName[] = new String[100]; // GLOBAL VARIABLE
	public static int studentAge[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static String studentGrade[] = new String[100];
	public static int studentRollNumber[] = new int[100];
	public static int index=0;
	// Reading Values from the terminal/console
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Store the information of the Students
		int option;
		while(true) {
		System.out.println("Student Management System");
		System.out.println("1. Add a Student");
		System.out.println("2. Print Student details");
		System.out.println("3. Print All Student details");
		System.out.println("4. Exit");

		System.out.println("Enter an option from [1-4]");
		option = sc.nextInt();

		switch (option) {
		case 1:
			addStudent();// Static methods can call another static methods
			break;
		case 2:
			printStudentInformation();
			break;
		case 3:
			printAllStudentInformation();
			break;
		case 4:
			exitApp();
			break;
		}
	  }
	}
	private static void exitApp() {
		System.out.println("Exiting from the App.....");
		System.exit(0);
	}

	private static void printAllStudentInformation() {
		for (int i = 0; i < index; i++) {
			System.out.println("*************************************************");
			System.out.println("Student Name :" + studentName[i]);
			System.out.println("Student Age :" + studentAge[i]);
			System.out.println("Student Roll No.:" + studentRollNumber[i]);
			System.out.println("Marks Obtained");
			System.out.println("ENGLISH :" + marksObtainedInEnglish[i]);
			System.out.println("SCIENCE :" + marksObtainedInScience[i]);
			System.out.println("MATHEMATICS :" + marksObtainedInMaths[i]);
			System.out.println("Student Grade :" + studentGrade[i]);
			System.out.println("**************************************************");	
		}
	}

	private static void printStudentInformation() {
		System.out.println("Print Student Information");
		System.out.println("Enter the Student index");
		int userindex=sc.nextInt();
		System.out.println("\n------ Student Details ------");
		System.out.println("Student Name :" + studentName[userindex]);
		System.out.println("Student Age :" + studentAge[userindex]);
		System.out.println("Student Roll No.:" + studentRollNumber[userindex]);
		System.out.println("Marks Obtained");
		System.out.println("ENGLISH :" + marksObtainedInEnglish[userindex]);
		System.out.println("SCIENCE :" + marksObtainedInScience[userindex]);
		System.out.println("MATHEMATICS :" + marksObtainedInMaths[userindex]);
		System.out.println("Student Grade :" + studentGrade[userindex]);
		System.out.println();
	}

	public static void addStudent() {
		System.out.println("Enter Student Roll No.");
		studentRollNumber[index] = sc.nextInt();
		System.out.println("Enter the Student Name");
		studentName[index] = sc.next();
		System.out.println("Enter the Student Age ");
		studentAge[index] = sc.nextInt();
		System.out.println("Enter the Marks Obtained in English");
		marksObtainedInEnglish[index] = sc.nextDouble();
		System.out.println("Enter the Marks Obtained in Science");
		marksObtainedInScience[index] = sc.nextDouble();
		System.out.println("Enter the Marks Obtained in Mathematics");
		marksObtainedInMaths[index] = sc.nextDouble();
		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInScience[index] + marksObtainedInMaths[index];
		double percentageObtained = totalMarksObtained / 3.0;
		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D+";
		} else if (percentageObtained >= 60) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		} 
		index++;
		System.out.println("Student Info Stored Successfully");
		System.out.println();
//you cannot read single character with Scanner Class in String format and 
		// then convert String to Char! str.charAT(0);
	}
}