package com.BuilderDesignPattern;

import static com.BuilderDesignPattern.Student.*;

public class Runner1 {

	public static void main(String[] args) {
//		Student s1 = new Student("Ishaan", 15, "Karvenagar Pune", "9545368430", 315, 57, 80, 97);
//		s1.calculateTotalMarks();
//		s1.calculatePercentage();
//		s1.calculateGrade();
//		s1.displayStudentInfo();
//		s1.updateInformation("MGR Chennai Central", "9494668776");
//		s1.displayStudentInfo();
//		s1.updateInformation("Gondia");
//		s1.updateInformation("8989898989", false);
//		s1.displayStudentInfo();
//
//		System.out.println("--------------------------");
//		System.out.println(getStudentCount());
//		System.out.println(demo);
//		System.out.println("--------------------------");

		Student s2 = new Student.StudentBuilder("Jatin", 15, "Kolhapur", "9494668776").withMarksObtainedInEnglish(77)
				.withMarksObtainedInScience(80).withMarksObtainedInMaths(99).withRollNumber(314).build();
		s2.displayStudentInfo();
	}

}
