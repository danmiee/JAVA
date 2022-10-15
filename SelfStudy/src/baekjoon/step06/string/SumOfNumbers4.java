package baekjoon.step06.string;

import java.util.Scanner;

class SNsub2 {
	// num3s ���� : �Է¹��� num2�� num1����ŭ �ڸ���
	public static String getNum2(int num1, long num2) {
		String num2s = String.valueOf(num2);
		String num3s = "";
		if(num2s.length()<num1) {
			System.out.println("�ʹ� ª���ϴ�.");
		} else {
			num3s = num2s.substring(0, num1);
		}
		return num3s;
	}
	public static void print(String num3s) {
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}

public class SumOfNumbers4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		long num2 = sc.nextLong();

		String str = SNsub2.getNum2(num1, num2);
		SNsub2.print(str);
		// static���� ����� ��� Ŭ�������� ��ü�� �޼ҵ� �ٷ� ȣ��
	}
}
