package com.ruby.java_09_api;

public class Test02 {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1==s3) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		if(s2==s4) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		/*
		 * new ��ɹ� : ������ heap �޸𸮿� �ν��Ͻ� ���� �����ϰ� �� �ּҰ��� ���������� ����
		 * "" : heap �޸� �� String Pool ã�ư� > ������ ���ڿ� ���� �ν��Ͻ� ������ ���� �������� �ʰ� ���� �ν��Ͻ� �ּҰ� ��ȯ
		 */
		
		if(s1.equals(s3)) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		if(s2.equals(s4)) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		// equalsIgnoreCase : ��ҹ��� ���о���
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
}
