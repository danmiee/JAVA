package baekjoon.step06.string;

import java.math.BigInteger;
import java.util.Scanner;

public class q02_SumOfNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//
//		// ���� 2�� �Է¹���
//		
//		// num1 : num2�� ����� ������ ����		
//		
//		// num2�� ���ڿ��� �޾Ƽ� �迭�� ��ȯ?
//		int[] arr = new int [num1];
//		XXX
//		substring���� �߶󳻸� ��
		
	
		// ���� 1�� �Է¹ޱ�(num1)
		int num1 = sc.nextInt();
		
		// ���� 1�� �� �Է¹ޱ�(num2)
			// int�� �Է�
		BigInteger num2 = sc.nextBigInteger();
		String num2s = String.valueOf(num2);
		if(num2s.length()<num1) {
			System.out.println("�ʹ� ª���ϴ�.");
			return;
		}
		// �Էµ� �� �� �տ������� num1���� �޾ƿ���(num3)
		String num3s = num2s.substring(0, num1);
		
		// num3�� �ϳ��� ���ϱ�
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
		}
		
		// ���
		System.out.println(sum);
	}
}
