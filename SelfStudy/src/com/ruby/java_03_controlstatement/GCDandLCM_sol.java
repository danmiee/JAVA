package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class GCDandLCM_sol {

	public static int gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		// ù ȸ�������� ���ǹ��ϳ� �ݺ��Ǹ鼭 �ִ����� ���� ��ȯ��
		else
			return gcd(n2, n1 % n2);
		/*
		 * ��Ŭ���� ȣ������ ���� ��ġ�̵� (������: ū�� �ڸ�, ������: ������ �ڸ�)
		 */
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt();

		int gcd = gcd(n1, n2);
		// ������ ������ gcd �޼ҵ� Ȱ��
		int lcm = (n1*n2)/gcd;

//		System.out.println(gcd);
//		// �ִ�����
//		System.out.println(n1 * n2 / gcd);
//		// �ּҰ���� : ������*ū��/�ִ�����
		
		System.out.printf("�ִ�����: %d\n",gcd);
		System.out.printf("�ּҰ����: %d",lcm);
	}

}

//	����� Ȱ���Ͽ� 2�� �ݺ��� �����???