package com.demo;

public class person {
	private String name;
	private int id;

	public person() { // Default Constructor
		System.out.println("Default Constructor for Person class");
	}

	public person(String name, int id) { // Parameterized Constructor
		this();  //Constructor chaining // Default constructor of person class
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.id = id;

	}

	public person(person other) { // Copy Constructor
		System.out.println("Copy Constructor");
		this.name = other.name;
		this.id = other.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
