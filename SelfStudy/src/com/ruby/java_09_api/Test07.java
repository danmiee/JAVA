package com.ruby.java_09_api;

public class Test07 {

	public static void main(String[] args) {
		
		String s = "�ѱ�,�Ϻ�,�߱�,�̱�,����,������";
		
		// split() : ������ �����ڷ� ���ڿ��� �߶� String[] �迭�� ��ȯ
		String[] list = s.split(",");
		// split("������",�и��Ǵ� ���ڿ� ����)
		String[] list2 = s.split(",",2);
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("===============");
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("===============");
		
		String email = "purum@rubypaper.co.kr";
		int i = email.indexOf("@");

		// substring(���� ���� ���� ��ġ, ���� ���� �� ��ġ+1)
		String id = email.substring(0,i);
		// substring() : ���ڿ� �Ϻκи� ������ �� ���
		String company = email.substring(i+1);
		System.out.println(id);
		System.out.println(company);
	}
}
