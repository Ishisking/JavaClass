package com.Student.Management.System.OOPS.Modified;

import java.util.Objects;

public class Student extends person {
	private final int rollNumber;
	private String grade;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInScience;
	private final double marksObtainedInMaths;
	private final double totalMarks;
	private final double percentage;
	private static int studentCounter = 0;

//	public Student(String name, int age, String address, String contactNumber, int rollNumber,
//			double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
//		super(name, age, address, contactNumber);
//		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
//				&& validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)
//				&& validateContactNumber(contactNumber)) {
//
//			this.rollNumber = rollNumber;
//			this.grade = grade;
//			this.marksObtainedInEnglish = marksObtainedInEnglish;
//			this.marksObtainedInScience = marksObtainedInScience;
//			this.marksObtainedInMaths = marksObtainedInMaths;
//			studentCounter++;
//		}
//	}
	private Student(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);

		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		totalMarks = calculateTotalMarks();
		percentage = calculatePercentage();
		grade = calculateGrade();
		studentCounter++;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			this.contactNumber = contactNumber;
		} else {
			System.out.println("Invalid contact number. It must contain exactly 10 digits.");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (!address.isEmpty() && address.trim().length() >= 5) {
			this.address = address.trim();
		} else {
			System.out.println("Invalid Address Must be at least 5 characters. ");
		}
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
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
		if (validateRollNumber(rollNumber)) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid Roll Number");
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber < 100) {
			return true;
		} else {
			System.err.println("Invalid Roll Number of the Student");
			return false;
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 11 && age < 21) {
			this.age = age;
		} else {
			System.out.println("Invalid Age Entered");
		}
	}

	public String getGrade() {
		return grade;
	}

	public boolean validateMarks(double marksoftheSubject) {
		if (marksoftheSubject > 0 && marksoftheSubject <= 100) {
			return true;
		} else {
			System.err.println("Invalid Student Marks");
			return false;
		}

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

	public double calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
		return totalMarks;
	}

	public double calculatePercentage() {
		double percentage = totalMarks / 3;
		return percentage;
	}

	public String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "Cannot be Calculated";
		} else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", grade=" + grade
				+ ", marksObtainedInEnglish=" + marksObtainedInEnglish + ", marksObtainedInScience="
				+ marksObtainedInScience + ", marksObtainedInMaths=" + marksObtainedInMaths + ", totalMarks="
				+ totalMarks + ", percentage=" + percentage + ", contactNumber=" + contactNumber + ", address="
				+ address + "]";
	}

	public static int getTotalStudentCount() {
		return studentCounter;
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

	public void displayStudentInfo() {
		System.out.println("--------------Student Information--------------");
		System.out.println("Name : " + name);
		System.out.println("Age :" + age);
		System.out.println("Roll Number :" + rollNumber);
		System.out.println("Contact Number :" + contactNumber);
		System.out.println("Address : " + address);
		System.out.println("English Marks :" + marksObtainedInEnglish);
		System.out.println("Science Marks :" + marksObtainedInScience);
		System.out.println("Maths Marks :" + marksObtainedInMaths);
		System.out.println("---------------------------------------");
		System.out.println("Total Marks :" + totalMarks);
		System.out.println("Percentage Obtained :" + percentage + "%");
		System.out.println("Grade Obtained : " + grade);
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {
		// Parent Approval
		System.out.println("Requesting for Parent Approval ");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			// then update Person.address with newAddress and Person.contactNumber with
			// newContactNumber
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the Parent ....");
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

	public boolean updateInformation(String newAddress, boolean update) {
		System.out.println("Updating New Address");
		// Only Address is being Modified
		if (!address.isEmpty() && address.trim().length() >= 5) {
			System.out.println("Notifying the Parents about the Address Change");
			return true;
		} else {
			System.out.println("Invalid Address Entered");
			return false;
		}

	}

	public boolean updateInformation(String newContactNumber) {
		System.out.println("Requesting for Parents Approval");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			if (super.updateInformation(newContactNumber)) {
				System.out.println("Notifying the Parent...");
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static class StudentBuilder {
		// Mandatory
		private String name;
		private int age;
		private String address;
		private String contactNumber;
		// optional
		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInScience;
		private double marksObtainedInMaths;

		public StudentBuilder(String name, int age, String address, String contactNumber) {
			if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)) {
				this.name = name;
				this.age = age;
				this.address = address;
				this.contactNumber = contactNumber;
			}
		}

		public StudentBuilder withRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}

		public StudentBuilder withMarksObtainedInEnglish(double marksObtainedInEnglish) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			return this;
		}

		public StudentBuilder withMarksObtainedInScience(double marksObtainedInScience) {
			this.marksObtainedInScience = marksObtainedInScience;
			return this;
		}

		public StudentBuilder withMarksObtainedInMaths(double marksObtainedInMaths) {
			this.marksObtainedInMaths = marksObtainedInMaths;
			return this;
		}

		public boolean validateAge(int age) {
			if (age >= 11 && age < 21) {
				return true;
			} else {
				System.out.println("");
				System.err.println("Invalid Age of the Student");
				return false;
			}
		}

		public boolean validateContactNumber(String contactNumber) {
			if (contactNumber != null && contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("Invalid contact number. It must contain exactly 10 digits.");
				return false;
			}
		}

		public boolean validateAddress(String address) {
			if (!address.isEmpty() && address.trim().length() >= 5) {
				System.out.println("Valid Address");
				return true;
			} else {
				System.err.println("Invalid Address");
				return false;
			}
		}

		public Student build() {
			Student student = new Student(this);
			return student;
		}
	}
}// End of class Student