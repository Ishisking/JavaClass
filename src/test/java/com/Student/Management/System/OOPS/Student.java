package com.Student.Management.System.OOPS;

public class Student {
	private String name;
	private int rollNumber;
	private int age;
	private String grade;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;

	
	public Student(String name, int rollNumber, int age, String grade, double marksObtainedInEnglish,
			double marksObtainedInScience, double marksObtainedInMaths) {
		this.name = name;	//This is a Parameterized Constructor as it has many 
		this.rollNumber = rollNumber; //parameters like name, age, grade...etc.
		this.age = age;
		this.grade = grade;
		this.marksObtainedInEnglish = marksObtainedInEnglish;
		this.marksObtainedInScience = marksObtainedInScience;
		this.marksObtainedInMaths = marksObtainedInMaths;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid Roll Number");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age < 35) {
			this.age = age;
		} else {
			System.out.println("Invalid Age Entered");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("Invalid Marks for English");
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("Invalid Marks for Science");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("Invalid Marks for Maths");
		}
	}

	public void calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
		System.out.println("Total Marks Obtained :" + totalMarks);
		double Percentage = totalMarks / 3;
		System.out.println("Percentage of the student is :" + Percentage);
	}

}
