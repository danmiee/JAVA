package com.ruby.java.ch06.date_220923;

class student {
	private int sno;
	private String name;
	private double height;

	public void getStudent(int s, String n, double h) {
		sno = s;
		name = n;
		height = h;
		// ���� �ٲ�� �۵��ȵ�!!
	}

	public void showStudent() {
		System.out.println("�й� : " + sno);
		System.out.println("���� : " + name);
		System.out.println("Ű : " + height);
	}
	
}

public class ProcenStudent {
	
	public static void main(String[] args) {
		
		student s = new student();
		/* 
		 * new student �� student : ������!
		 * new student�� �ϳ� �� ���� �ٸ� ���� �� ���� �ִ� : overloading
		 */
		s.getStudent(18,"������",158.0);
		s.showStudent();
		
	}
}