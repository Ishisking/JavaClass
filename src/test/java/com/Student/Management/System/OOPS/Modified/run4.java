package com.Student.Management.System.OOPS.Modified;

public class run4 {

	public static void main(String[] args) {
		Student s1 = new RegularStudent.RegularStudentBuilder("Uday", 15, "Karvenagar Pune 411052", "9545368430")
				.withRollNumber(25).withMarksObtainedInEnglish(90).withMarksObtainedInMaths(95)
				.withMarksObtainedInScience(85).build();
		System.out.println(s1);
		Student s2 = new SportsStudent.SportsStudentBuilder("Ishan", 16, "jia sarai NewDelhi", "9490584064")
				.withSportsScore(85).withMarksObtainedInEnglish(90).withMarksObtainedInMaths(100)
				.withMarksObtainedInScience(88).build();
		System.out.println(s2);
	}

}
