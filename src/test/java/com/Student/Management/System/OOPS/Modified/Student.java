package com.Student.Management.System.OOPS.Modified;

import java.util.Objects;

public class Student {
	private String name;
	private int rollNumber;
	private int age;
	private String grade;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;
	private double totalMarks;
	private double percentage;
	private String contactNumber;
	private String address;

	public Student(String name, int rollNumber, int age, double marksObtainedInEnglish, double marksObtainedInScience,
			double marksObtainedInMaths, String contactNumber, String address) {
		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)
				&& validateContactNumber(contactNumber)) {
			this.name = name; // This is a Parameterized Constructor as it has many
			this.rollNumber = rollNumber; // parameters like name, age, grade...etc.
			this.age = age;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInScience = marksObtainedInScience;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.contactNumber = contactNumber;
			this.address = address;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
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
		if (rollNumber >= 1 && rollNumber < 100) {
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

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			// System.out.println("Valid contact number");
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

	public boolean validateAge(int age) {
		if (age >= 18 && age < 35) {
			return true;
		} else {
			System.out.println("");
			System.err.println("Invalid Age of the Student");
			return false;
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

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
//				double Percentage = totalMarks / 3;
//		System.out.println("Percentage of the student is :" + Percentage);
	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage == 0) {
			grade = "Cannot be Calculated";
		} else {
			if (percentage >= 95) {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", grade=" + grade
				+ ", marksObtainedInEnglish=" + marksObtainedInEnglish + ", marksObtainedInScience="
				+ marksObtainedInScience + ", marksObtainedInMaths=" + marksObtainedInMaths + ", totalMarks="
				+ totalMarks + ", percentage=" + percentage + ", contactNumber=" + contactNumber + ", address="
				+ address + "]";
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
		System.out.println("Percentage Obtained :" + percentage+"%");
		System.out.println("Grade Obtained : " + grade);
	}
}
