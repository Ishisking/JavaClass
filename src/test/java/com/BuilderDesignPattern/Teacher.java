package com.BuilderDesignPattern;

public final class Teacher extends Person {

	private String empId;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	private final static double BASE_SALARY = 30000; // constants --- final ---- static ---UPPERCASE
	private final static double EXPERIENCE_BONUS = 2000;
	private static int teacherCounter = 0;

	public Teacher(String name, int age, String address, String contactNumber, String empId, String subject,
			int yearsOfExperience) {
		super(name, age, address, contactNumber);
		if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber) && validateEmpId(empId)
				&& validateSubject(subject) && validateYearsOfExperience(yearsOfExperience)) {

			this.empId = empId;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();
			teacherCounter++;
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

	public String getEmpId() {
		return empId;
	}

//	public void setEmpId(String empId) {
//		if (validateEmpId(empId)) {
//			this.empId = empId;
//		}
//	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
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

	public double getSalary() {
		return salary;
	}

	protected final void calculateSalary() { // Restricted Method Overriding
		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);

	}

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid Teacher Age");
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
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Contact Number is Invalid");
			return false;
		}
	}

	public boolean validateEmpId(String empId) {
		if (empId.matches("T\\d{3}")) {
			return true;
		} else {
			System.err.println("Invalid Emp Id");
			return false;
		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid Subject");
			return false;
		}
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience > 0 && yearsOfExperience < 35) {
			return true;
		} else {
			System.err.println("Invalid Years of Experience");
			return false;
		}
	}

	public static int getTeacherCount() {
		return teacherCounter;
	}

	public void displayTeacherInformation() {
		System.out.println("***********TEACHER INFORMATION************");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Emp Id : " + empId);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println("Subject : " + subject);
		System.out.println("Years of Experience : " + yearsOfExperience);
		System.out.println("Salary : $" + salary);
		System.out.println("-------------------------------------");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", empId=" + empId + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + "]";
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {

		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			// then update the address and contact Number
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the Teacher that Info has been Updated");
				return true;
			} else {
				System.err.println("No Approval from HR");
				return false;
			}
		}

		return false;
	}

	public boolean getHRApproval() {
		System.out.println("HR Approved the Request");
		return true; // dummy
	}

	public boolean updateInformation(String newAddress) {

		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			// then update the address and contact Number
			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying the Teacher that Info has been Updated");
				return true;
			} else {
				System.err.println("No Approval from HR");
				return false;
			}
		}

		return false;
	}

	public boolean updateInformation(String newContactNumber, boolean update) {

		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			// then update the address and contact Number
			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notifying the Teacher that Info has been Updated");
				return true;
			} else {
				System.err.println("No Approval from HR");
				return false;
			}
		}

		return false;
	}
}
