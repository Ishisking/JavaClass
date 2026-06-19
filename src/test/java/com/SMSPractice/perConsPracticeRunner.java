package com.SMSPractice;

public class perConsPracticeRunner {

	public static void main(String[] args) {
		perConsPractice p1=new perConsPractice();
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		perConsPractice p2=new perConsPractice("Ishan", 314);
		System.out.println(p2.getName());
		System.out.println(p2.getId());
		p1.setId(315);
		p1.setName("Ishaan");
		System.out.println(p1.getName());
		System.out.println(p1.getId());
	}

}
