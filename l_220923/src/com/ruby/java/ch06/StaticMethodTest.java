package com.ruby.java.ch06;

public class StaticMethodTest {
/*
 * class method : static���� ���ǵ� method
 * print1(class method)�� print2(not class method)�� ���� 
 */
	public static void main(String[] args) {
		StaticMethodTest.print1();
		print1();	// ��ü�� ������ ���� ȣ���(������ ��)
		//print2();	// static �ƴϹǷ� ��ü��� error
		StaticMethodTest s = new StaticMethodTest();
		s.print2();
		// ��ü�� �����Ƿ� ȣ�� ����
	}

	public static void print1() {
		System.out.println("hello");
	}

	public void print2() {
		System.out.println("java");
	}
}
