package com.Student.Management.System.OOPS;

public class runner2 {

	public static void main(String[] args) {
		Student s1 = new Student("Uday", 15, 20, "A", 65, 80, 95);
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
		s1.setName("Karan");
		s1.setRollNumber(22);
//		s1.age = 34;
//		s1.rollNumber = 22;
//		s1.marksObtainedInEnglish = 85;
//		s1.marksObtainedInScience = 75;
//		s1.marksObtainedInMaths = 86;
//		s1.grade = "B";
//
		System.out.println(s1.getName());
//		System.out.println(s1.age);
		System.out.println(s1.getRollNumber());
//		System.out.println(s1.marksObtainedInEnglish);
//		System.out.println(s1.marksObtainedInScience);
//		System.out.println(s1.marksObtainedInMaths);
//		s1.calculateTotalMarks();
//		System.out.println(s1.grade);

	}

}
