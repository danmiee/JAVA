package com.ruby.java_03_controlstatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("%");
		
		int a, n;
		double r = 0.03;
		
		
		a = in.nextInt();
		n = in.nextInt();
		
		int S = (int) (a * Math.pow(1+r, n));
		
		System.out.printf(
				"����: %d��, ����: %d��, ������: %s\n"
				+ "���� �ݾ� : %d��",a,n,df.format(r),S);
	}
}

// �ŵ����� : math.pow(�������,������)