package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class ZodiacOfBirth_ifelse {

	public static String zodiac(int birth) {
		
		if(birth%12==0)			return "�����̶�";
		else if(birth%12==1)	return "�߶�";
		else if(birth%12==2)	return "����";
		else if(birth%12==3)	return "������";
		else if(birth%12==4)	return "���";
		else if(birth%12==5)	return "�Ҷ�";
		else if(birth%12==6)	return "����";
		else if(birth%12==7)	return "�䳢��";
		else if(birth%12==8)	return "���";
		else if(birth%12==9)	return "���";
		else if(birth%12==10)	return "����";
		else if(birth%12==11)	return "���";
		else					return null;
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
