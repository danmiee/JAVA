package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class Sum2_loop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("[���� �Է� �� ��(��ü/Ȧ��/¦��) ���]");
		
		int i, j, k, inputN;

		while ((inputN = in.nextInt()) != 0) {

			int sum = 0;
			int oddsum = 0;
			int evensum = 0;

			for (i = 0; i <= inputN; i++) {
				sum += i;
			}
			for (j = 0; j <= inputN; j++) {
				if(j%2 == 1) {
					oddsum += j;
				}
			}
			for (k = 0; k <= inputN; k++) {
				if(k%2 == 0) {
					evensum += k;
				}
				continue;
			}
			System.out.println("��ü �� : " + sum);
			System.out.println("Ȧ�� �� : " + oddsum);
			System.out.println("¦�� �� : " + evensum);
		}

		System.out.println("Good bye!!");

		in.close();
	}

}
