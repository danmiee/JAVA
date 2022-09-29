package com.ruby.java.ch07.date_220926.v1;

import java.util.Scanner;

class Point {
	int x, y;

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
//		private���� ���ǵǾ������� �ڽ�Ŭ�������� ���Ұ�
	}

	public void getPoint() {
		System.out.printf("��ǥ : (%d, %d)\n", x, y);
	}

}

class ColorPoint extends Point {

	private String color;

	public void setColorPoint(int x, int y, String s) {
		super.setPoint(x, y);
//		super.x = x;
//		super.y = y;
//		���� ���� �ٿ��� �ۼ� ����
		this.color = s;
	}

	public void getColorPoint() {
		System.out.printf("(x,y,color) = (%d,%d,%s)", x, y, color);
	}
}

public class TestPoint_loop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("2���� ���ڿ� ������ �Է��ϸ� ��ǥ������ ����մϴ�.");
		System.out.println("-���Ḧ ���Ͻø� 999�� �Է��ϼ���-");

		Scanner sc = new Scanner(System.in);
		int x, y;
		String s;

		while ((x = sc.nextInt()) != 999) {
			y = sc.nextInt();
			s = sc.next();

			ColorPoint p = new ColorPoint();
			p.setColorPoint(x, y, s);
			p.getColorPoint();

		}

		System.out.println("�����ϼ̽��ϴ�.");

	}
}