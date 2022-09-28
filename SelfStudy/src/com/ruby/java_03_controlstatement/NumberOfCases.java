package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class NumberOfCases {

/*
 * 2g, 3g, 5g �� 10���� ����Ͽ� 10~100 ���� ���� ǥ���ϴ� ����� �� ���ϱ�
 * (�ߴ� �� 1�� �̻� ���)
 * - �ݺ��� Ȱ�� / 3�� ��ø
 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("[���� ���� �Ǵ� ���� �Է��ϼ���.]");
		System.out.println("-����:0-");
		
		Scanner in = new Scanner(System.in);
		
		int n;
		while((n=in.nextInt())!=0) {
			
			if(n<10 || n>100) {
				System.out.println("10~100 ���� ������ �Է����ּ���.");
				break;
			}
			System.out.println("�Է°�: "+n);
			int i,j,k,count;
			count = 0;
			for(i=1; i<=10; i++) {
				for(j=1; j<=10; j++) {
					for(k=1; k<=10; k++) {
						if(2*i+3*j+5*k==n) {
							count++;
							System.out.printf("(%d,%d,%d)",i,j,k);
						}
					}
				}
			} System.out.printf("\n����Ǽ�: %d��",count);
		}
		System.out.println("Good bye!!");
	}

}
