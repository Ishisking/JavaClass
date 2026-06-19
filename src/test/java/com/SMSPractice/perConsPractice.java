package com.SMSPractice;

public class perConsPractice {
	String name;
	int id;
	public perConsPractice() {
	//Default Constructor
	}
	public perConsPractice(String name, int id) {
		//Parameterized Constructor
		this.name = name;
		this.id = id;
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
