package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class PrimeNumber_loop {

	/*
	 * �Ҽ� �Ǵ� �Ҽ� : 1�� �ڱ��ڽ��� ������ ���� �������� �� �������� 0�� �ƴϴ� ���ǹ� - �������� 0�̴� break; �Ǵ� > �ڱ��ڽ�
	 * : �Ҽ� / �ڱ��ڽ� X : �Ҽ��ƴ� �ݺ��� - 2~9�� ������
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int inputN, i;

		System.out.println("[�Ҽ����� Ȯ���ϰ� ���� ���ڸ� �Է��ϼ���.]");
		System.out.println("[���� : 0]");

		while ((inputN = in.nextInt()) != 0) {

			for (i = 2; i <= inputN; i++) {
				if (inputN % i != 0) {
					
				} else if (inputN == i) {
					System.out.println("�Ҽ��Դϴ�."); break;
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�."); break;
				}
			}

		}
		
		System.out.println("�����ϼ̽��ϴ�.");

	}
}
