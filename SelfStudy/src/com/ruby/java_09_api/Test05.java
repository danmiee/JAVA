package com.ruby.java_09_api;

public class Test05 {

	public static void main(String[] args) {
		String address[] = {
				"��⵵ ������ ������", "����� �������� ��굿", "�泲 õ�Ƚ� ���ϱ�", "����� ��õ�� ��", "����� ���ı� ���̵�", "���� �ξȱ� �ξ���"
		};
		
		// indexOf() : ���ڿ��� ó������ �˻��Ͽ� ������ ����(��)�� ���۵Ǵ� �ε��� ���� (������ -1)
		System.out.println("1");
		for(int i=0; i<address.length; i++) {
			if(address[i].indexOf("�����") != -1) {
				System.out.println(address[i]);
			}
		}
		
		// lastIndexOf() : ���ڿ��� ó������ �˻��Ͽ� ������ ����(��)�� ���۵Ǵ� �ε��� ���� (������ -1)
		System.out.println("2");
		for(int i=0; i<address.length; i++) {
			if(address[i].lastIndexOf("������") != -1) {
				System.out.println(address[i]);
			}
		}
		
		// startsWith() : ���ڷ� ���޹��� ���ڿ��� �����ϴ��� �Ǵ�
		System.out.println("3");
		for(int i=0; i<address.length; i++) {
			if(address[i].startsWith("�����")) {
				System.out.println(address[i]);
			}
		}
		
		System.out.println("4");
		for(int i=0; i<address.length; i++) {
			if(address[i].endsWith("������")) {
				System.out.println(address[i]);
			}
		}
		
	}
}
