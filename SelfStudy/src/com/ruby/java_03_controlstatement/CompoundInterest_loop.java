package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class CompoundInterest_loop {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int a, n;
		double r = 0.03;
		
		System.out.println("[���ݰ� ��ġ�Ⱓ�� �Է��ϸ� ����ݾ��� ����մϴ�.(������ 3% ����)]");
		System.out.println("---���Ḧ ���Ͻø� 0�� �Է��ϼ���.---");
		
		while((a = in.nextInt()) != 0) {
			n = in.nextInt();
			
			int S = (int) (a * Math.pow(1+r, n));
			
			System.out.printf(
					"����: %d��, ����: %d��\n"
					+ "���� �ݾ� : %d��",a,n,S);
			
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}

// �ŵ����� : math.pow(�������,������)