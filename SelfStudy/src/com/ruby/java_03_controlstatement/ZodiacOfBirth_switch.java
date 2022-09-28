package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class ZodiacOfBirth_switch {

	public static String zodiac(int birth) {
		switch(birth%12) {
		case 0 : return "�����̶�";
		case 1 : return "�߶�";
		case 2 : return "����";
		case 3 : return "������";
		case 4 : return "���";
		case 5 : return "�Ҷ�";
		case 6 : return "����";
		case 7 : return "�䳢��";
		case 8 : return "���";
		case 9 : return "���";
		case 10 : return "����";
		case 11 : return "���";
		}
		return null;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int birth;
		
		System.out.println("[������ �Է��ϸ� �츦 Ȯ���� �� �ֽ��ϴ�.]");
		System.out.println("- ���Ḧ ���Ͻø� 0�� �Է��ϼ���.-");
		
		while((birth = in.nextInt())!=0) {
			
			String zodiac = zodiac(birth);
			
			System.out.printf("%d�� => %s",birth,zodiac);
			
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
