package com.SMS_INHERITANCE_PRACTICE;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Ishaan", 15, "Karvenagar Pune", "9545368430", 315, 57, 80, 97);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();
		s1.updateInformation("MGR Chennai Central", "9494668776");
		s1.displayStudentInfo();
		s1.updateInformation("Gondia");
		s1.updateInformation("8989898989", false);
		s1.displayStudentInfo();

		Teacher t1 = new Teacher("Jatin", 35, "New Delhi", "9490584064", "T101", "Java", 10);
		t1.displayTeacherInformation();
		t1.updateInformation("Baner Pune", "8801270527");
		t1.displayTeacherInformation();

		Person s5 = new Student("Brahma", 14, "Band Bakery Bakepura", "8801270527", 156, 95, 98, 95);
//Object will be created of child class and Reference will be of Parent class
		((Student) s5).calculateTotalMarks(); // Explicit Type casting or Downcasting
		((Student) s5).calculatePercentage();
		((Student) s5).calculateGrade();
		((Student) s5).displayStudentInfo();
		s5.updateInformation("Dharampeth Nagpur", "9494444916"); // Method overriding will happen here
		((Student) s5).displayStudentInfo();

		System.out.println("Total Persons Joined Today :" + Person.getPersonCount());
		System.out.println("Total Students Joined Today :" + Student.getStudentCount());
		System.out.println("Total Teachers Joined Today :" + Teacher.getTeacherCount());
	}
}
