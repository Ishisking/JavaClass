package com.ExceptionHandling;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		if (validateAge(age)) {
			this.name = name;
			this.age = age;
		}
	}

	private boolean validateAge(int age) {
		if (age >= 18 && age <= 65) {
			return true;
		} else { // throw new IllegalArgumentException("Invalid Age");
			try {
				throw new InvalidAgeException("Invalid Age");
			} catch (InvalidAgeException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
