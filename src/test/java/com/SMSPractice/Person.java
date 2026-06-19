Person.javapackage com.SMSPractice;

public class Person {
	protected String name;
	int age;
	String address;
	String contactNumber;
	int personCounter = 0;

	public Person(String name, int age, String address, String contactNumber, int personCounter) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.contactNumber = contactNumber;
		this.personCounter = personCounter;
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

	public int getPersonCounter() {
		return personCounter;
	}

	public void setPersonCounter(int personCounter) {
		this.personCounter = personCounter;
	}

	public boolean validateAge(int age) {
		if (age >= 10 && age < 21) {
			return true;
		} else {
			System.err.println("Invalid Age Entered");
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

}
