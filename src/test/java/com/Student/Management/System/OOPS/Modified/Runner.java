package com.Student.Management.System.OOPS.Modified;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Uday", 15, 20, "A", 65, 80, 95);
		s1.setName("yogesh");
		s1.setRollNumber(315);
		s1.setAge(34);
		s1.setMarksObtainedInEnglish(90);
		s1.setMarksObtainedInScience(97.5);
		s1.setMarksObtainedInMaths(95);
		s1.setGrade("A");

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getMarksObtainedInEnglish());
		System.out.println(s1.getMarksObtainedInScience());
		System.out.println(s1.getMarksObtainedInMaths());
		s1.calculateTotalMarks();
		System.out.println("Grade obtained is: " + s1.getGrade());
//		Student s1;		//s1 is Reference Variable, Student is User Defined Data type
//		s1=new Student(); //s1 is created inside Stack Memory

	}

}
