package Requirement11;

import java.util.Objects;

public abstract class Student extends Person {
	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInScience;
	private final double marksObtainedInMaths;
	protected final double totalMarks;
	protected double percentage;
	protected String grade;
	private static int studentCounter = 0;
	public static int demo = 15;

//	public Student(String name, int age, String address, String contactNumber, int rollNumber,
//			double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
//		super(name, age, address, contactNumber);
//		if (validateAge(age) && validateRollNumber(rollNumber) && validateAddress(address)
//				&& validateContactNumber(contactNumber) && validateMarks(marksObtainedInEnglish)
//				&& validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)) {
//
//			this.rollNumber = rollNumber;
//			this.marksObtainedInEnglish = marksObtainedInEnglish;
//			this.marksObtainedInScience = marksObtainedInScience;
//			this.marksObtainedInMaths = marksObtainedInMaths;
//			studentCounter++;
//		}
//	}
	protected Student(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		totalMarks = calculateTotalMarks();
		studentCounter++;
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

	private boolean validateAge(int age) {
		if (age >= 10 && age < 21) {
			return true;
		} else {
			System.err.println("Invalid Age Entered");
			return false;
		}
	}

	private boolean validateRollNumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber < 1000) {
			return true;
		} else {
			System.err.println("Invalid Roll Number");
			return false;
		}
	}

	private boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			System.err.println("Address in Invalid");
			return false;
		} else {
			return true;
		}
	}

	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null || contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Contact Number is Invalid");
			return false;
		}
	}

	private boolean validateMarks(double marksOfSubject) {
		if (marksOfSubject >= 100 || marksOfSubject < 0) {
			System.err.println("Invalid Marks Entered : " + marksOfSubject);
			return false;
		} else {
			return true;
		}
	}

	public final double calculateTotalMarks() { // restrict Method Overriding
		double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
		return totalMarks;
	}

	public abstract double calculatePercentage();

	public final String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "Cannot be Calculated";
		} else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
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
		System.out.println("==========================================================");
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

	public abstract static class StudentBuilder { // INNER CLASS
		// Mandatory
		private String name;
		private int age;
		private String address;
		private String contactNumber;
		// Optional
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

		private boolean validateAge(int age) {
			if (age >= 10 && age < 21) {
				return true;
			} else {
				System.err.println("Invalid Age Entered");
				return false;
			}
		}

		private boolean validateAddress(String address) {
			if (address.isEmpty() || address == null) {
				System.err.println("Address in Invalid");
				return false;
			} else {
				return true;
			}
		}

		private boolean validateContactNumber(String contactNumber) {
			if (contactNumber != null || contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("Contact Number is Invalid");
				return false;
			}
		}

		public abstract Student build(); // We don't know how to implement the build as it is parent class method but it
											// must
// be implemented in child class according to the child class condition(Regular student & sports student) so we will
//		implement build method in child class accordingly so create an abstract method in parent class.
//		public Student build() {
//			Student student = new Student(this);
//			return student;
//		}

	}
}