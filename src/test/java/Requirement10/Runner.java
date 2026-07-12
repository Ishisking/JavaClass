package Requirement10;

import static com.BuilderDesignPattern.Student.*;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new RegularStudent.RegularStudentBuilder("Ishaan", 15, "Jia Sarai NewDelhi", "9490584064")
				.withRollNumber(315).withMarksObtainedInEnglish(89).withMarksObtainedInScience(85)
				.withMarksObtainedInMaths(98).build();
		System.out.println(s1);

		Student s2 = new SportStudent.SportStudentBuilder("samar", 15, "Pune", "9490584064").withSportsScore(90)
				.withRollNumber(314).withMarksObtainedInEnglish(95).withMarksObtainedInScience(95)
				.withMarksObtainedInMaths(100).build();
		System.out.println(s2);
	}

}
