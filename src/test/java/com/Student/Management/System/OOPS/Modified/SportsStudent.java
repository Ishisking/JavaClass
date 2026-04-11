package com.Student.Management.System.OOPS.Modified;

public class SportsStudent extends Student {
	private double sportsScore;

	protected SportsStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);

		this.sportsScore = ((SportsStudentBuilder) studentBuilder).sportsScore;
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public String toString() {
		return "SportsStudent [sportsScore=" + sportsScore + ", grade=" + grade + ", totalMarks=" + totalMarks
				+ ", percentage=" + percentage + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", contactNumber=" + contactNumber + "]";
	}

	@Override
	public double calculatePercentage() {
		System.out.println("Total Marks" + getTotalMarks());
		System.out.println("Sports Marks " + sportsScore);
		double academicPercentage = getTotalMarks() / 3.0;
		double finalPercentage = (0.8 * academicPercentage) + (0.2 * sportsScore);
		return finalPercentage;
	}

	public static class SportsStudentBuilder extends StudentBuilder {
		private double sportsScore;

		public SportsStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);
		}

		public SportsStudentBuilder withSportsScore(double sportsScore) {
			if (sportsScore >= 0 && sportsScore <= 100) {
				this.sportsScore = sportsScore;
			}
			return this;
		}

		@Override
		public Student build() {
			Student s1 = new SportsStudent(this);
			return s1;
		}

	}
}
