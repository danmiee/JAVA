package com.ruby.java_02_datauses;

import java.util.Scanner;

public class IntroduceMyself {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		int yyyy = in.nextInt();
		int mm = in.nextInt();
		int dd = in.nextInt();
		double height = in.nextDouble();
		int weight = in.nextInt();
		String work = in.next();
		
		System.out.printf("�̸� : %s\n",name);
//		System.out.println("������� : "+yyyy+"�� "+mm+"�� "+dd+"�� ");
		System.out.printf("������� : %d�� %d�� %d��\n",yyyy, mm, dd);
		System.out.println("Ű : "+height);
		System.out.println("ü�� : "+weight+"Kg");
		System.out.println("���� : "+work);
		
		in.close();
	}
}
