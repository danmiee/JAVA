package com.ruby.java_09_API;

public class Test03 {

	public static void main(String[] args) {
		
		// String�� ������ ���ڿ��� ���������� char Ÿ���� �迭�� ó���� 
		String s = "have a good day!";
		
		int length = s.length();
		System.out.println("�� ���� �� : " + length);
		char c;
		
		// charAt : ���ڷ� ���޹��� �ε����� �ش��ϴ� ���� ����
		for(int i=0; i<length; i++) {
			c = s.charAt(i);
			System.out.println(c);
		}
	}
}
