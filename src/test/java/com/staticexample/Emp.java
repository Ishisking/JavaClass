package com.staticexample;

public class Emp {
	private String name;
	public static String companyName;
	static {
		//Early initialization of the static variables
		// Initialize the static variables
		// code Block
		companyName = "Infosys";
		System.out.println("Hi i am in the static block");
//if we have any Resources that are to be initialized during class loading time
//static block will be used to setup the logger, database connectivity, to read
		//properties file.
	}
	static {
		System.out.println("Static Block No.2");
	}
	static {
		System.out.println("Static Block No.3");
	}

	public Emp(String name) {
		super();
		this.name = name;
		companyName="Accenture";
		System.out.println("Inside the constructor");
	}

}
