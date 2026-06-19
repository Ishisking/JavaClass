package com.SMSPractice;

import java.util.Scanner;

public class ProceduralprogrammingPractice {
	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double[] marksObtainedInEnglish = new double[100];
	public static double[] marksObtainedInScience = new double[100];
	public static double[] marksObtainedInMaths = new double[100];
	public static String[] studentGrade = new String[100];
	public static int[] studentRollNumber = new int[100];
	// Reading values from the terminal
	public static Scanner sc = new Scanner(System.in);
	public static int index = 0;

	public static void main(String[] args) {
//Store the information of the students
		int option;
		while (true) {
			System.out.println("Student Management System");
			System.out.println("1. Add a Student");
			System.out.println("2. Print Student Details");
			System.out.println("3. Print All Students Details");
			System.out.println("4. Exit");

			System.out.println("Enter an Option(1-4)");
			option = sc.nextInt();

			switch (option) {
			case 1:
				addStudent();// static methods can call other static methods
				break;
			case 2:
				printStudentInformation();
				break;
			case 3:
				printAllStudentInformation();
				break;
			case 4:
				exitApplication();
				break;
			}

		}
	}

	private static void exitApplication() {
		System.out.println("Exiting from the Application");
		System.exit(0);
	}

	private static void printAllStudentInformation() {
		for (int i = 0; i < index; i++) {
			System.out.println("****************************");
			System.out.println("Name" + studentName[i]);
			System.out.println("Age" + studentAge[i]);
			System.out.println("RollNumber" + studentRollNumber[i]);
			System.out.println("English" + marksObtainedInEnglish[i]);
			System.out.println("Science" + marksObtainedInScience[i]);
			System.out.println("Maths" + marksObtainedInMaths[i]);
			System.out.println("Grade" + studentGrade[i]);
		}
	}

	private static void printStudentInformation() {
		System.out.println("Print Student Information");
		System.out.println("Enter the Index");
		int userIndex = sc.nextInt();
		System.out.println("Name" + studentName[userIndex]);
		System.out.println("Age" + studentAge[userIndex]);
		System.out.println("RollNumber" + studentRollNumber[userIndex]);
		System.out.println("English" + marksObtainedInEnglish[userIndex]);
		System.out.println("Science" + marksObtainedInScience[userIndex]);
		System.out.println("Maths" + marksObtainedInMaths[userIndex]);
//		System.out.println("Total Marks" + totalMarksObtained);
//		System.out.println("Percentage Obtained" + percentage);
		System.out.println("Grade" + studentGrade[userIndex]);

	}

	public static void addStudent() {
		System.out.println("Enter Student Name");
		studentName[index] = sc.next();
		System.out.println("Enter the Student Age");
		studentAge[index] = sc.nextInt();
		System.out.println("Enter the RollNumber");
		studentRollNumber[index] = sc.nextInt();
		System.out.println("Enter the MarksOPbtainedIn English");
		marksObtainedInEnglish[index] = sc.nextDouble();
		System.out.println("Enter the MarksOPbtainedIn Science");
		marksObtainedInScience[index] = sc.nextDouble();
		System.out.println("Enter the MarksOPbtainedIn Maths");
		marksObtainedInMaths[index] = sc.nextDouble();
		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInScience[index]
				+ marksObtainedInMaths[index];
		double percentage = totalMarksObtained / 3.0;
		if (percentage >= 95) {
			studentGrade[index] = "A+";
		} else if (percentage >= 90 && percentage < 95) {
			studentGrade[index] = "A";
		} else if (percentage >= 85 && percentage < 90) {
			studentGrade[index] = "B+";
		} else if (percentage >= 80 && percentage < 85) {
			studentGrade[index] = "B";
		} else if (percentage >= 75 && percentage < 80) {
			studentGrade[index] = "C+";
		} else if (percentage >= 70 && percentage < 75) {
			studentGrade[index] = "C";
		} else if (percentage >= 65 && percentage < 70) {
			studentGrade[index] = "D+";
		} else if (percentage >= 60 && percentage < 65) {
			studentGrade[index] = "D";
		} else if (percentage < 60) {
			studentGrade[index] = "Fail";
		}
		index++;
		System.out.println("Student Information Stored Successfully");
		System.out.println();
	}
}
