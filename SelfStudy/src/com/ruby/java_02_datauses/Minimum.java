package com.ruby.java_02_datauses;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		int a = x/50000;
		int b = (x-(a*50000))/10000;
		int c = (x-((a*50000)+(b*10000)))/5000;
		int d = (x-((a*50000)+(b*10000)+(c*5000)))/1000;
		int e = x%1000;

			
		System.out.printf(
				"5���� * %d��\n"
				+ "1���� * %d��\n"
				+ "5õ�� * %d��\n"
				+ "1õ�� * %d��\n"
				+"%d�� ����"
				,a,b,c,d,e);
		
		in.close();
		
	}
}
