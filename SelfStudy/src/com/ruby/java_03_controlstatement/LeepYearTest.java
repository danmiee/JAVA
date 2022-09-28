package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class LeepYearTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int year;

		System.out.printf("[����˻�]\n����:0\n");

		while ((year = in.nextInt()) != 0) {
			String result = 
					(year % 4 == 0) ? 
							((year % 100 != 0) ? "����" : 
										((year % 400 == 0) ? "����" : "���")
							) :"���";
			
			System.out.printf("%d�� => %s",year,result);
		}
		System.out.println("Good bye!!");
	}

}
