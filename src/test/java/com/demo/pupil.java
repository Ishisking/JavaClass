package com.demo;

import java.util.Objects;

public class pupil {
	private String name;
	private int rollNumber;
	private int age;
	private String grade;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;
	
	
	
	public pupil(String name, int rollNumber, int age, String grade, double marksObtainedInEnglish,
			double marksObtainedInScience, double marksObtainedInMaths) {
		this.name = name; //Constructor
		this.rollNumber = rollNumber;
		this.age = age;
		this.grade = grade;
		this.marksObtainedInEnglish = marksObtainedInEnglish;
		this.marksObtainedInScience = marksObtainedInScience;
		this.marksObtainedInMaths = marksObtainedInMaths;
	}
	
	@Override
	public String toString() {
		return "pupil [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", grade=" + grade
				+ ", marksObtainedInEnglish=" + marksObtainedInEnglish + ", marksObtainedInScience="
				+ marksObtainedInScience + ", marksObtainedInMaths=" + marksObtainedInMaths + "]";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pupil other = (pupil) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
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
		this.rollNumber = rollNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		this.marksObtainedInEnglish = marksObtainedInEnglish;
	}
	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}
	public void setMarksObtainedInScience(double marksObtainedInScience) {
		this.marksObtainedInScience = marksObtainedInScience;
	}
	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}
	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		this.marksObtainedInMaths = marksObtainedInMaths;
	}

	

}
