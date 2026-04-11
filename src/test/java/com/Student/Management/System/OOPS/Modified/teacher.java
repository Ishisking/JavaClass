package com.Student.Management.System.OOPS.Modified;

import java.util.Objects;

public final class teacher extends person {

	private String professionalDetails;
	private String employeeID; // T101
	private String specializedSubject;
	private int yearsOfExperience;
	private double salary;
	private static int teacherCounter = 0;
	private static final double BASE_SALARY = 30000; // CONSTANTS ---final--STATIC--->UPPERCASE
	private static final double EXPERIENCE_BONUS = 2000;

	public teacher(String name, int age, String address, String contactNumber, String professionalDetails,
			String employeeID, String specializedSubject, int yearsOfExperience) {
		super(name, age, address, contactNumber);
		if (validateTeacherAge(age) && validateContactNumber(contactNumber) && validateTeacherAddress(address)
				&& validateEmployeeID(employeeID) && validateSpecializedSubject(specializedSubject)
				&& validateYearsOfExperience(yearsOfExperience)) {

			this.professionalDetails = professionalDetails;
			this.employeeID = employeeID;
			this.specializedSubject = specializedSubject;
			this.yearsOfExperience = yearsOfExperience;
			teacherCounter++;
		}
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		if (validateTeacherAge(age)) {
			this.age = age;
		} else {
			System.out.println("Invalid Teacher Age");
		}
	}

	public boolean validateTeacherAge(int age) {
		if (age >= 21 && age <= 60) {
			return true;
		} else {
			System.err.println("Invalid Teacher Age");
			return false;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		} else {
			System.out.println("Invalid Contact Number Entered ");
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid Contact Number Entered");
			return false;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateTeacherAddress(address)) {
			this.address = address;
		} else {
			System.out.println("Invalid Teacher Address Must be at least 5 characters");
		}
	}

	public boolean validateTeacherAddress(String address) {
		if (!address.isEmpty() && address.trim().length() >= 5) {
			this.address = address;
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

//	private final void setEmployeeID(String employeeID) {
//		if (employeeID == null || !employeeID.matches("T\\d{3}")) {
//			System.out.println("Invalid Employee ID. Format must be T followed by 3 digits (e.g., T101)");
//		} else {
//			this.employeeID = employeeID;
//		}
//	}

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

	protected final void calculateTotalSalary() {//Restricted Method Overriding
		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);
	}

	public static int getTotalTeacherCount() {
		return teacherCounter;
	}

	@Override
	public String toString() {
		return "teacher [teacherName=" + name + ", teacherAge=" + age + ", teacherContactNumber=" + contactNumber
				+ ", teacherAddress=" + address + ", professionalDetails=" + professionalDetails + ", employeeID="
				+ employeeID + ", specializedSubject=" + specializedSubject + ", yearsOfExperience=" + yearsOfExperience
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeID, professionalDetails, salary, specializedSubject, address, age, contactNumber,
				name, yearsOfExperience);
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
				&& Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(name, other.name)
				&& yearsOfExperience == other.yearsOfExperience;
	}

	public void displayTeacherInfo() {
		System.out.println("-------Teacher Information--------");
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Contact Number :" + contactNumber);
		System.out.println("Address :" + address);
		System.out.println("Professional Details :" + professionalDetails);
		System.out.println("EmployeeID :" + employeeID);
		System.out.println("Specialized Subject :" + specializedSubject);
		System.out.println("Years of Experience :" + yearsOfExperience);

		System.out.println("Salary :$ " + salary);
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {
		System.out.println("Notifying HR for Approval...");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the teacher that information is Updated");
				return true;
			}
		}
		return false;
	}

	private boolean getHRApproval() {
		System.out.println("HR Approved the Request ");
		return true;
	}

	public boolean updateInformation(String newAddress, boolean update) {
		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress, update)) {
				System.out.println("Notifying the Teacher that information is Updated");
				return true;
			}
		}
		return false;
	}

	public boolean updateInformation(String newContactNumber) {
		System.out.println("Notifying HR Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newContactNumber)) {
				System.out.println("Notifying the Teacher that Contact Number has been updated");
				return true;
			}
		}
		return false;
	}
}
