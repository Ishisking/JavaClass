package com.SMS_INHERITANCE_PRACTICE;

import java.util.Objects;

public class Student extends Person {
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;
	private double totalMarks;
	private double percentage;
	private String grade;
	private static int studentCounter = 0;

	public Student(String name, int age, String address, String contactNumber, int rollNumber,
			double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
		super(name, age, address, contactNumber);
		if (validateAge(age) && validateRollNumber(rollNumber) && validateAddress(address)
				&& validateContactNumber(contactNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)) {

			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInScience = marksObtainedInScience;
			this.marksObtainedInMaths = marksObtainedInMaths;
			studentCounter++;
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
			grade = GradePolicy.calculateGrade(percentage);
		}
	}

	public static int getStudentCount() {
		return studentCounter;
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
		System.out.println("Percentage Obtained : " + percentage + " %");
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

	public boolean updateInformation(String newAddress, String newContactNumber) {
//Parent Approval
		System.out.println("Requesting for Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then update the person address with new Address
			// person contact NUmber with New Contact Number

			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying Parent....");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}

	private boolean parentApproval() {
		return true; // dummy approval
	}

	public boolean updateInformation(String newAddress) {
		// Parent Approval
		System.out.println("Requesting for Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then update the person address with new Address
			// person contact NUmber with New Contact Number

			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying Parent....");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}

	public boolean updateInformation(String newContactNumber, boolean update) {
		// Parent Approval
		System.out.println("Requesting for Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then update the person address with new Address
			// person contact NUmber with New Contact Number

			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notifying Parent....");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}
}