package Requirement11;

public abstract class Person {
	protected String name;
	protected int age;
	protected String address;
	protected String contactNumber;
	private static int personCounter = 0;

	public Person(String name, int age, String address, String contactNumber) {
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
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

	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Updated the Contact Number and Address Info");
			return true;
		} else {
			return false;
		}
	}

	protected boolean updateInformation(String newAddress) {
		if (validateAddress(newAddress)) {
			this.address = newAddress;
			System.out.println("Updated Address Info");
			return true;
		} else {
			return false;
		}
	}

	protected boolean updateInformation(String newContactNumber, boolean update) {
		if (validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("Updated the Contact Number");
			return true;
		} else {
			return false;
		}
	}

	public static int getPersonCount() {
		return personCounter;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

}
