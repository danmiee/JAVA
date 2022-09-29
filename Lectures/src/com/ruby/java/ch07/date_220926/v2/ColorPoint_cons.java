package com.ruby.java.ch07.date_220926.v2;

/*
 *  ������
 *  show�� cp�� �����Ͽ� cp.show�� ����ϱ�
 */

class Point {
	private int x, y;

	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// ������ ����
	
	public void show() {
		System.out.println(x+ y);
	}
}

public class ColorPoint_cons extends Point {
	
	private String color;
	public ColorPoint_cons(int x, int y, String color) {
		super(x, y); // �θ� ������ ȣ��
		this.color = color; // �ش� Ŭ���� ������ ���� 
	}
	public void show() {
		super.show();
		System.out.println(color);
	}
	// 
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Point p = new Point();
		ColorPoint_cons cp = new ColorPoint_cons(10, 20, "red");
		cp.show();
	}
}