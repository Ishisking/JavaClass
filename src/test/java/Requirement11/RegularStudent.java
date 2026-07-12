package Requirement11;

public class RegularStudent extends Student {

	protected RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {
		double percentage = totalMarks / 3;
		return percentage;
	}

	public static class RegularStudentBuilder extends StudentBuilder {

		public RegularStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);
		}

		@Override
		public Student build() {
			Student s1 = new RegularStudent(this);
			return s1;

		}

	}
}
