package com.ruby.java_04_array;

import java.util.Scanner;

public class Factorials {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[���ڸ� �Է��ϸ� ���丮�� ���� ����մϴ�.]");
		System.out.println("- ���� : 0 -");
		
		int inputN;
		
		while((inputN = sc.nextInt()) != 0) {
			
			System.out.print(inputN + "! = ");
			
			int fac = 1;
			for(int j=inputN; j>=1; j--) {
				fac = fac * j;
				if(j>1) {
					System.out.print(j + "*");
				} else {
					System.out.println("1 = " + fac);
				}
			}
			
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
