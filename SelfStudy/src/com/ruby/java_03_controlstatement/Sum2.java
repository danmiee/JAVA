package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int inputN = in.nextInt();

		int i, j, k;
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;

		for (i = 0; i <= inputN; i++)
			sum += i;
		for (j = 1; j <= inputN; j = j + 2)
			oddsum += j;
		for (k = 2; k <= inputN; k = k + 2)
			evensum += k;

		System.out.println("��ü �� : " + sum);
		System.out.println("Ȧ�� �� : " + oddsum);
		System.out.println("¦�� �� : " + evensum);

		in.close();
	}

}
