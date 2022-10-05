package com.ruby.java.ch11;

public class ExceptionFinallyTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try {
			
			System.out.println("1");
			
			String s = null;
			s.length();
			// null�� ���̴� ���Ҽ� ����
			
			System.out.println("2");
			
			System.out.println("3");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			
			System.out.println("OK");
			// ���� �߻��� ������� �׻� ����
			
		}
		
		System.out.println("4");
		
	}
	
}
