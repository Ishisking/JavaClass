package com.SMS_INHERITANCE_PRACTICE;

public class GradePolicy {
	private static int aPlus;
	private static int aGrade;
	private static int bPlus;
	private static int bGrade;
	private static int cPlus;
	private static int cGrade;
	private static int dPlus;
	private static int dGrade;
	private static int passingMarks;

	static {
		System.out.println("Grade Policy Loaded in the System");
		aPlus = 95;
		aGrade = 90;
		bPlus = 85;
		bGrade = 80;
		cPlus = 75;
		cGrade = 70;
		dPlus = 65;
		dGrade = 60;
		passingMarks = 33;
	}

	public static String calculateGrade(double percentage) {

		if (percentage >= 95 && percentage <= 100) {
			return "A+";
		} else if (percentage >= 90 && percentage < 95) {
			return "A";
		} else if (percentage >= 85 && percentage < 90) {
			return "B+";
		} else if (percentage >= 80 && percentage < 85) {
			return "B";
		} else if (percentage >= 75 && percentage < 80) {
			return "C+";
		} else if (percentage >= 70 && percentage < 75) {
			return "C";
		} else if (percentage >= 65 && percentage < 70) {
			return "D+";
		} else if (percentage >= 60 && percentage < 65) {
			return "D";
		} else {
			return "F";
		}
	}
}
