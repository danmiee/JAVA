package com.ruby.java.ch06.date_220923;

public class ThisTest {
	int i = 1;

	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;

		second(4);
	}

	public void second(int i) {
		int j = 5;
		this.i = i + j;
		/*
		 * this.i = i + j;
		 * System.out.println(i); // 4
		 *  �� ���⼭ i �� this.i �� �ٸ�
		 * i = i + j; // 9
		 * System.out.println(i); // 9
		 * 
		 * �̷��� ���� ������ ����ϴ� ���� �������� ����
		 */
	}

	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
	}

}
