package com.Student.Management.System.OOPS.Modified;

public class runner2 {

	public static void main(String[] args) {
		Student s5 = new Student("joy", 14, "Capital Heights Jia Sarai, Hauz Khas, NewDelhi", "8801270527", 20, 80, 85,
				90);
		s5.calculateTotalMarks();
		s5.calculatePercentage();
		s5.calculateGrade();
		s5.displayStudentInfo();
		/*
		 * Student s1 = new Student("Uday", 15, 18, 65, 80, 95);
		 * s1.calculateTotalMarks(); s1.calculatePercentage(); s1.calculateGrade(); //
		 * System.out.println(s1.getName()); // System.out.println(s1.getRollNumber());
		 * // s1.setName("Karan"); // s1.setRollNumber(22); System.out.println(s1);
		 * Student expectedData = new Student("Ishaan", 24, 19, 95, 95, 100);
		 * expectedData.calculateTotalMarks(); expectedData.calculatePercentage();
		 * expectedData.calculateGrade(); System.out.println(expectedData); Student
		 * actualData = new Student("Ishaan", 24, 19, 95, 95, 100);
		 * actualData.calculateTotalMarks(); actualData.calculatePercentage();
		 * actualData.calculateGrade();
		 * System.out.println(expectedData.equals(actualData));
		 * System.out.println(actualData); // s1.age = 34; // s1.rollNumber = 22; //
		 * s1.marksObtainedInEnglish = 85; // s1.marksObtainedInScience = 75; //
		 * s1.marksObtainedInMaths = 86; // s1.grade = "B"; // //
		 * System.out.println(s1.getName()); // System.out.println(s1.age); //
		 * System.out.println(s1.getRollNumber()); //
		 * System.out.println(s1.marksObtainedInEnglish); //
		 * System.out.println(s1.marksObtainedInScience); //
		 * System.out.println(s1.marksObtainedInMaths); // s1.calculateTotalMarks(); //
		 * System.out.println(s1.grade); // System.out.println(s1); // Hash Code of Heap
		 */
		person s2 = new Student("Raj", 18, "Ganeshpeth, Nagpur", "9490584064", 7, 80, 80, 80);// polymorphism(UPCASTING)
		((Student) s2).calculateTotalMarks(); // THIS IS DOWNCASTING---> we have to write explicitly
		((Student) s2).calculatePercentage();
		((Student) s2).calculateGrade();
		((Student) s2).displayStudentInfo();
		s2.updateInformation("Gatewayof India Mumbai", "9949990762"); // Java overrides the method by calling the update
																		// information
		((Student) s2).displayStudentInfo(); // from child class
		person t1 = new teacher("Anita joshi", 21, "123 TeachersColony Chennai", "9494668776", "Msc Bed", "T101",
				"Maths", 5);
		// object is going to be created of child class and Reference type will be of
		// parent class
		((teacher) t1).displayTeacherInfo(); // Explicit type casting or Downcasting
		t1.updateInformation("F1 Keerti Enclave Pune", "9545368430"); // method overriding will happen here
		((teacher) t1).displayTeacherInfo();
		person s3 = new Student("Abhinav", 17, "Newlax, gond", "1234567891", 11, 75, 85, 95);
		((Student) s3).calculateTotalMarks();
		((Student) s3).calculatePercentage();
		((Student) s3).calculateGrade();
		((Student) s3).displayStudentInfo();
		System.out.println("Contact NUmber updation");
		s3.updateInformation("9494668776");
		((Student) s3).displayStudentInfo();
		System.out.println("Address updation &contact number updation");
		s3.updateInformation("Flat No 205 Visakhapatnam", "9949990762");
		((Student) s3).displayStudentInfo();
		System.out.println("Address updation");
		System.out.println("--------------------");
		s3.updateInformation("Sai Restaurant room no3, pedawaltaire 400001", true);
		((Student) s3).displayStudentInfo();
		person t2 = new teacher("Pallavi Gupta", 33, "1/2 TeachersColony Gond", "9545368430", "Msc Bed", "T102",
				"Maths", 6);
		((teacher) t2).displayTeacherInfo(); // Explicit type casting or Downcasting
		t2.updateInformation("F1 Balaji Residency Tumsar Road", "9440012430"); // method overriding will happen here
		((teacher) t2).calculateTotalSalary();
		((teacher) t2).displayTeacherInfo();
		t2.updateInformation("7680996205");
		((teacher) t2).displayTeacherInfo();
		t2.updateInformation("Newlaxminagar Gondia", true);
		((teacher) t2).displayTeacherInfo();
		s3.updateInformation("205 Vishnu Heights,Visakhapatnam", true);
		((Student) s3).displayStudentInfo();
		s3.updateInformation("9491444961");
		((Student) s3).displayStudentInfo();
		s3.updateInformation("Balaji Telefilms Hyderabad", "9999999999");
		((Student) s3).displayStudentInfo();

		person t3 = new teacher("Sonakshi", 33, " TB Toli Gond", "9545368430", "Msc Ded", "T103", "Maths", 7);
		((teacher) t3).calculateTotalSalary();
		((teacher) t3).displayTeacherInfo();
		System.out.println("============================");

		System.out.println("Total Persons Joined the Organisation :" + person.getTotalPersonCount());
		System.out.println("Total Student Enrolled :" + Student.getTotalStudentCount());
		System.out.println("Total Teacher Joined :" + teacher.getTotalTeacherCount());
	}

}
