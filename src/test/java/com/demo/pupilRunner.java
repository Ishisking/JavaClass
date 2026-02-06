package com.demo;

public class pupilRunner {

	public static void main(String[] args) {
//toString() Application
		pupil p1 = new pupil("shyam", 15, 9, "A", 95, 100, 100);
		p1.setName("Ram");
		p1.setAge(11);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		System.out.println(p1.getRollNumber());
//		System.out.println(p1.getMarksObtainedInEnglish());
//		System.out.println(p1.getMarksObtainedInScience());
//		System.out.println(p1.getMarksObtainedInMaths());
//		System.out.println(p1.getGrade());
		System.out.println(p1);
		pupil p2 = new pupil("Ramesh", 11, 5, "B", 75, 80, 85);
		System.out.println(p2);
		pupil p3 = new pupil("Ramesh", 11, 5, "B", 75, 80, 85);
		System.out.println(p3);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));

	}

}
