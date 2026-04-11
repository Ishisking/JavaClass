package com.Student.Management.System.OOPS.Modified;

public class Runner3 {

	public static void main(String[] args) {
		Student s1 = new Student.StudentBuilder("Ishaan", 15, "Vasant vihar NewDelhi", "8801270527")
				.withRollNumber(22).withMarksObtainedInEnglish(95)
				.withMarksObtainedInScience(85).withMarksObtainedInMaths(95).build();
		System.out.println(s1);
		s1.displayStudentInfo();

	}

}
