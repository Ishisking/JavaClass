package com.SMSPractice;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private int rollNumber;
	private String address;
	private String contactNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;
	private double totalMarks;
	private double percentage;
	private String grade;
	
	
	public Student(String name, int age, int rollNumber, String address, String contactNumber,
			double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
		if (validateAge(age) && validateRollNumber(rollNumber) && validateContactNumber(contactNumber)
				&& validateAddress(address) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)) {

			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
			this.address = address;
			this.contactNumber = contactNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInScience = marksObtainedInScience;
			this.marksObtainedInMaths = marksObtainedInMaths;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (validateRollNumber(rollNumber)) {
			this.rollNumber = rollNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (validateMarks(marksObtainedInEnglish)) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (validateMarks(marksObtainedInScience)) {
			this.marksObtainedInScience = marksObtainedInScience;
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (validateMarks(marksObtainedInMaths)) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean validateAge(int age) {
		if (age >= 10 && age < 21) {
			return true;
		} else {
			System.err.println("Invalid Age Entered");
			return false;
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber < 1000) {
			return true;
		} else {
			System.err.println("Invalid Roll Number");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			System.err.println("Address in Invalid");
			return false;
		} else {
			return true;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null || contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Contact Number is Invalid");
			return false;
		}
	}

	public boolean validateMarks(double marksOfSubject) {
		if (marksOfSubject >= 100 || marksOfSubject < 0) {
			System.err.println("Invalid Marks Entered : " + marksOfSubject);
			return false;
		} else {
			return true;
		}
	}

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage == 0) {
			grade = "Cannot be Calculated";
		} else {
			if (percentage >= 95 && percentage <= 100) {
				grade = "A+";
			} else if (percentage >= 90) {
				grade = "A";
			} else if (percentage >= 85) {
				grade = "B+";
			} else if (percentage >= 80) {
				grade = "B";
			} else if (percentage >= 75) {
				grade = "C+";
			} else if (percentage >= 70) {
				grade = "C";
			} else if (percentage >= 65) {
				grade = "D+";
			} else if (percentage >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}
	}

	public void displayStudentInfo() {
		System.out.println("**************STUDENT INFORMATION*******************");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Address : " + address);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Marks Obtained In English :" + marksObtainedInEnglish);
		System.out.println("Marks Obtained in Science : " + marksObtainedInScience);
		System.out.println("Marks Obtained In Maths : " + marksObtainedInMaths);
		System.out.println("------------------------------");
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Percentage Obtained : " + percentage+" %");
		System.out.println("Grade : " + grade);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", marksObtainedInMaths="
				+ marksObtainedInMaths + ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade="
				+ grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, grade, marksObtainedInEnglish, marksObtainedInMaths,
				marksObtainedInScience, name, percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

}
