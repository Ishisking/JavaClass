package com.SMSPractice;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Ishaan", 15, 315, "Karvenagar Pune", "9545368430", 57, 80, 97);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();
		Student s5 = new Student("Brahma", 14, 156, "Band Bakery Bakepura", "8801270527", 95, 98, 95);
		s5.calculateTotalMarks();
		s5.calculatePercentage();
		s5.calculateGrade();
		s5.displayStudentInfo();
//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
//		System.out.println(s1.getRollNumber());
//		System.out.println(s1.getMarksObtainedInEnglish());
//		System.out.println(s1.getMarksObtainedInMaths());
//		System.out.println(s1.getMarksObtainedInScience());
//		System.out.println(s1.getGrade());
//		s1.calculateTotalMarks();
//		System.out.println(s1);
//		Student s2 = new Student("Jatin", 14, 35, 95, 95, 100, "A");
//		s2.calculateTotalMarks();
//		System.out.println(s2);
//		System.out.println(s1.equals(s2));
//		Student expectedData = new Student("Shaan", 24, 21, 65, 66, 45, "C");
//		System.out.println(expectedData);
//		Student actualData = new Student("Shaan", 24, 21, 65, 66, 45, "C");
//		System.out.println(actualData);
//		System.out.println(expectedData.equals(actualData));

		Teacher t1 = new Teacher("Jatin", 35, "New Delhi", "9490584064", "T101", "Java", 10);
		t1.displayTeacherInformation();
		Teacher t2 = new Teacher("Sunita", 35, "Mumbai", "9440045155", "T102", "Java", 10);
		t2.displayTeacherInformation();
	}
}
