package com.ruby.java.ch06.date_220923;

class Count1 {
	public static int totalCount;
	int count;
}

public class StaticMethodTest3 {
	
	int num = 123;
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		@SuppressWarnings("unused")
		Count1 c = new Count1();
		/* �ش� ��Ű�� �� ���ǵ� class�� ��밡��
		 * �������� ������̳� class�� ������ ���� ���� ���� ����.
		 */
		exam.print2();
	}

	public static void print1() {
//		int num2 = num;
		System.out.println("hello");
	}

	public void print2() {
		@SuppressWarnings("unused")
		int num;
//		num = num;
		// num(print2) = num(class) ��� ���ִ� ��� ��￹��
		System.out.println("java");
	}
}
