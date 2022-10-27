package baekjoon.step06.string;

import java.util.Scanner;

public class q07_BakwordsNum {

	// ���ڸ� �� 2�� �Է�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int bwnum1 = change(num1);
		int bwnum2 = change(num2);
		
		compareTo(bwnum1, bwnum2);

		sc.close();
	}
	
	// ���� �ٲٱ�
	public static int change(int num) {
		
		// �����ڸ� ��
		int a = num / 100;
		
		// �����ڸ� ��
		int b = (num - (a*100)) / 10;
		
		// �����ڸ� ��
		int c = num % 10;
		
		int bwnum = c*100 + b*10 + a; 
		
		return bwnum;
	}
	
	// ��Һ�
	public static void compareTo(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		} else if(num1<num2) {
			System.out.println(num2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}
	
}
