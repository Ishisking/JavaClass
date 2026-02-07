package com.Student.Management.System.OOPS.Modified;

import java.util.Objects;

public class teacher {
	private String teacherName;
	private int teacherAge;
	private String teacherContactNumber;
	private String teacherAddress;
	private String professionalDetails;
	private String employeeID; // T101
	private String specializedSubject;
	private int yearsOfExperience;
	private double salary;

	private static final double BASE_SALARY = 30000; // CONSTANTS ---final--STATIC--->UPPERCASE
	private static final double EXPERIENCE_BONUS = 2000;

	public teacher(String teacherName, int teacherAge, String teacherContactNumber, String teacherAddress,
			String professionalDetails, String employeeID, String specializedSubject, int yearsOfExperience) {
		if (validateTeacherAge(teacherAge) && validateContactNumber(teacherContactNumber)
				&& validateTeacherAddress(teacherAddress) && validateEmployeeID(employeeID)
				&& validateSpecializedSubject(specializedSubject) && validateYearsOfExperience(yearsOfExperience)) {

			this.teacherName = teacherName;
			this.teacherAge = teacherAge;
			this.teacherContactNumber = teacherContactNumber;
			this.teacherAddress = teacherAddress;
			this.professionalDetails = professionalDetails;
			this.employeeID = employeeID;
			this.specializedSubject = specializedSubject;
			this.yearsOfExperience = yearsOfExperience;
			calculateTotalSalary();
		}
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(int teacherAge) {
		if (teacherAge >= 21 && teacherAge <= 60) {
			this.teacherAge = teacherAge;
		} else {
			System.out.println("Invalid Teacher Age");
		}
	}

	public boolean validateTeacherAge(int teacherAge) {
		if (teacherAge >= 21 && teacherAge <= 60) {
			return true;
		} else {
			System.err.println("Invalid Teacher Age");
			return false;
		}
	}

	public String getContactNumber() {
		return teacherContactNumber;
	}

	public void setContactNumber(String teacherContactNumber) {
		if (teacherContactNumber != null && teacherContactNumber.matches("\\d{10}")) {
			this.teacherContactNumber = teacherContactNumber;
		} else {
			System.out.println("Invalid Contact Number Entered ");
		}
	}

	public boolean validateContactNumber(String teacherContactNumber) {
		if (teacherContactNumber != null && teacherContactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid Contact Number Entered");
			return false;
		}
	}

	public String getAddress() {
		return teacherAddress;
	}

	public void setAddress(String teacherAddress) {
		if (!teacherAddress.isEmpty() && teacherAddress.trim().length() >= 5) {
			this.teacherAddress = teacherAddress;
		} else {
			System.out.println("Invalid Teacher Address Must be at least 5 characters");
		}
	}

	public boolean validateTeacherAddress(String teacherAddress) {
		if (!teacherAddress.isEmpty() && teacherAddress.trim().length() >= 5) {
			this.teacherAddress = teacherAddress;
			return true;
		} else {
			System.err.println("Invalid Teacher Address Entered ");
			return false;
		}
	}

	public String getProfessionalDetails() {
		return professionalDetails;
	}

	public void setProfessionalDetails(String professionalDetails) {
		this.professionalDetails = professionalDetails;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		if (employeeID == null || !employeeID.matches("T\\d{3}")) {
			System.out.println("Invalid Employee ID. Format must be T followed by 3 digits (e.g., T101)");
		} else {
			this.employeeID = employeeID;
		}
	}

	public boolean validateEmployeeID(String employeeID) {
		if (employeeID == null || !employeeID.matches("T\\d{3}")) {
			System.err.println("Invalid Employee ID. Format must be T followed by 3 digits (e.g., T101)");
			return false;
		} else {
			return true;
		}
	}

	public String getSpecializedSubject() {
		return specializedSubject;
	}

	public void setSpecializedSubject(String specializedSubject) {
		if (validateSpecializedSubject(specializedSubject)) {
			this.specializedSubject = specializedSubject;
		}
	}

	public boolean validateSpecializedSubject(String specializedSubject) {
		if (!specializedSubject.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience >= 0 && yearsOfExperience <= 35) {
			return true;
		} else {
			System.err.println("Invalid Years of Experience");
			return false;
		}
	}

	public double getSalary() {
		return salary;
	}

	private void calculateTotalSalary() {
		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);
	}

	@Override
	public String toString() {
		return "teacher [teacherName=" + teacherName + ", teacherAge=" + teacherAge + ", teacherContactNumber="
				+ teacherContactNumber + ", teacherAddress=" + teacherAddress + ", professionalDetails="
				+ professionalDetails + ", employeeID=" + employeeID + ", specializedSubject=" + specializedSubject
				+ ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeID, professionalDetails, salary, specializedSubject, teacherAddress, teacherAge,
				teacherContactNumber, teacherName, yearsOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		teacher other = (teacher) obj;
		return Objects.equals(employeeID, other.employeeID)
				&& Objects.equals(professionalDetails, other.professionalDetails)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(specializedSubject, other.specializedSubject)
				&& Objects.equals(teacherAddress, other.teacherAddress) && teacherAge == other.teacherAge
				&& Objects.equals(teacherContactNumber, other.teacherContactNumber)
				&& Objects.equals(teacherName, other.teacherName) && yearsOfExperience == other.yearsOfExperience;
	}

	public void displayTeacherInfo() {
		System.out.println("-------Teacher Information--------");
		System.out.println("Name :" + teacherName);
		System.out.println("Age :" + teacherAge);
		System.out.println("Contact Number :" + teacherContactNumber);
		System.out.println("Address :" + teacherAddress);
		System.out.println("Professional Details :" + professionalDetails);
		System.out.println("EmployeeID :" + employeeID);
		System.out.println("Specialized Subject :" + specializedSubject);
		System.out.println("Years of Experience :" + yearsOfExperience);

		System.out.println("Salary :$ " + salary);
	}
}
