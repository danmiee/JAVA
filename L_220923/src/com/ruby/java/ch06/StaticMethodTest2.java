package com.ruby.java.ch06;

public class StaticMethodTest2 {
	
	int num = 123;
	/*
	 * main �� : class�� data
	 * main �� : �Լ� �� ���ú���
	 */
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}

	public static void print1() {
	// static : ������ ������ ��ü�� ��� �۵��Ǿ�� ��
//		int num2 = num;
		// ��ü���� ������� �� ���� ���̹Ƿ� ���� �۵��ϴ� static���� ���Ұ�
		System.out.println("hello");
	}

	public void print2() {
		@SuppressWarnings("unused")
		int num3 = num;
		System.out.println("java");
	}
}
