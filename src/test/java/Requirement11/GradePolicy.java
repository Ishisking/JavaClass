package Requirement11;

public final class GradePolicy {	//Last child class so marked as final
	private static final int A_PLUS;	//final varaible should be in Uppercase
	private static final int A_GRADE;
	private static final int B_PLUS;
	private static final int B_GRADE;
	private static final int C_PLUS;
	private static final int C_GRADE;
	private static final int D_PLUS;
	private static final int D_GRADE;
	private static final int PASSING_MARKS;

	private GradePolicy() {  //Method Accessible only within the class

	}

	static {
		System.out.println("Grade Policy Loaded in the System");
		A_PLUS = 95;
		A_GRADE = 90;
		B_PLUS = 85;
		B_GRADE = 80;
		C_PLUS = 75;
		C_GRADE = 70;
		D_PLUS = 65;
		D_GRADE = 60;
		PASSING_MARKS = 33;
	}

	public static String calculateGrade(double percentage) {

		if (percentage >= A_PLUS && percentage <= 100) {
			return "A+";
		} else if (percentage >= A_GRADE && percentage < A_PLUS) {
			return "A";
		} else if (percentage >= B_PLUS && percentage < A_GRADE) {
			return "B+";
		} else if (percentage >= B_GRADE && percentage < B_PLUS) {
			return "B";
		} else if (percentage >= C_PLUS && percentage < B_GRADE) {
			return "C+";
		} else if (percentage >= C_GRADE && percentage < C_PLUS) {
			return "C";
		} else if (percentage >= D_PLUS && percentage < C_GRADE) {
			return "D+";
		} else if (percentage >= D_GRADE && percentage < D_PLUS) {
			return "D";
		} else {
			return "F";
		}
	}

}
