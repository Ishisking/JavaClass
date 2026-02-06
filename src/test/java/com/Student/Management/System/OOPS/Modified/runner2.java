package com.Student.Management.System.OOPS.Modified;

public class runner2 {

	public static void main(String[] args) {
		Student s5 = new Student("joy", 14, 20, 80, 85, 90, "8801270527",
				"Capital Heights Jia Sarai, Hauz Khas, NewDelhi");
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
*/		 Student s2 = new Student("Raj", 23, 7, 80, 80, 80,"9490584064","Ganeshpeth, Nagpur");
		 s2.calculateTotalMarks(); s2.calculatePercentage(); s2.calculateGrade();
		 s2.displayStudentInfo();
		 

	}

}
