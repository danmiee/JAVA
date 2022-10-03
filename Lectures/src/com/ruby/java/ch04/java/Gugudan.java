package com.ruby.java.ch04.java;

public class Gugudan {

	public void printGugudan(int col) {

		/*
		 * ���� ������ �ַ�ǿ��� ����Ⱥκ�
		 * main(String[] args) > printGugudan(int col)
		 * int col; > ��⳻�뿡 ���ԵǾ����Ƿ� ����
		 * col=Integer.paraseInt(args[0]); > ���ʿ��� �κ����� ����
		 */

		if (col < 1 || 9 <= col) {
			System.out.println("col is not valid!");
			return;
		}
		
		for (int i = 2; i < 10; i += col) {
			
			for (int j = 1; j < 10; j++) {
				
				for (int k = 0; k < col; k++) {
					
					if (10 <= i + k) {
						System.out.print("\n");
						break;
					}
					
					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
					// %d : ����
					if (k < col - 1)
						System.out.print("\t");
					// \t : tab
					else
						System.out.print("\n");
					// \n : new line
					
				}
				
			}
			System.out.println();
			
		}
	}
}
