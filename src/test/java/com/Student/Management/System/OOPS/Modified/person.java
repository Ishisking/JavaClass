package com.Student.Management.System.OOPS.Modified;

public class person {
	protected String name;
	protected int age;
	protected String address;
	protected String contactNumber;
	private static int personCounter = 0;

	public person(String name, int age, String address, String contactNumber) {
		super();
		if (validateAddress(address) && validateContactNumber(contactNumber)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			personCounter++;
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
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	private boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			System.err.println("Invalid Person Address Entered ");
			return false;
		} else {
			return true;
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

	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid contact number. It must contain exactly 10 digits.");
			return false;
		}
	}

	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Updated Contactnumber & Address");
			return true;
		} else {
			return false;
		}
	}

	protected boolean updateInformation(String newContactNumber) {
		if (validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("Contact Number has been Updated");
			return true;
		} else {
			return false;
		}
	}

	protected boolean updateInformation(String newAddress, boolean update) {
		if (validateAddress(newAddress)) {
			this.address = newAddress;
			System.out.println("New Address has been Updated");
			return true;
		} else {
			return false;
		}
	}

	public static int getTotalPersonCount() {
		return personCounter;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

}
