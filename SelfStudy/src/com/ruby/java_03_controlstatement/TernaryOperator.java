package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class TernaryOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * ������ ���� �Է� > ��� 70 �̻� > ���
		 * 1�����̶� 60�� �̸��̸� ����
		 */
		
		Scanner in = new Scanner(System.in);
		int k, e, m;
		
		System.out.println("[������ ������ ������� �Է��ϼ���.]");
		System.out.println("-�Է��� �Ϸ�Ǹ� 0�� �Է��ϼ���.-");
		
		while((k = in.nextInt()) != 0) {
			e = in.nextInt();
			m = in.nextInt();
			
			int sum = k+e+m;
			double avg = (k+e+m)/3;
			String result;
			
//			if(avg>=70 && (k>=60 && e>=60 && m>=60)) {
//				result = "���";
//			} else if(avg>=70 && (k<60 || e<60 || m<60)) {
//				result = "����";
//			} else {
//				result = "Ż��";
//			}
			
			result = (avg>=70 && (k>=60 && e>=60 && m>=60)) ? "���" : 
				(result = (avg>=70) ? "����" : "Ż��");
			
			System.out.printf("�Է�: %d,%d,%d / �Ѱ�:%d / ���:%.2f > %s", k,e,m,sum,avg,result);
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
