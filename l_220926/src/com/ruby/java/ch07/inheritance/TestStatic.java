package com.ruby.java.ch07.inheritance;

//	static �Լ� �˱�

public class TestStatic {
	
	static void show() {
		System.out.println("Hello");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		show();
		// ���� Ŭ������ ������ Ŭ���� ���� ����
		
		TestStatic.show();
		// static �Լ� ȣ�� ����
		
		/*
		 * class�� member�� �ƴ� method�� ���� �ʿ䰡 ���� ��
		 * ��ü�� ��� ȣ���� �� �ִ� static�� Ȱ���Ѵ�.
		 */
	}
	
}
