package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class PrimeNumber {

	/*
	 * �Ҽ� �Ǵ� �Ҽ� : 1�� �ڱ��ڽ��� ������ ���� �������� �� �������� 0�� �ƴϴ� ���ǹ� - �������� 0�̴� break; �Ǵ� > �ڱ��ڽ�
	 * : �Ҽ� / �ڱ��ڽ� X : �Ҽ��ƴ� �ݺ��� - 2~9�� ������
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int inputN, i;
		inputN = in.nextInt();
		
			for (i = 2; i <= inputN; i++) {
				if (inputN % i != 0) {
					
				} else if (inputN == i) {
					System.out.println("�Ҽ��Դϴ�."); break;
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�."); break;
				}
			}

	}
}
