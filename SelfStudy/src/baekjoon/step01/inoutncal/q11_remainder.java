package baekjoon.step01.inoutncal;

/*
 * ü���� ŷ1, ��1, ��2, ���2, ����Ʈ2, ��8���� ����
 * ��� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� Ȯ��
 * 
 *  �Է� : 6�� ���� �Է�(0�ʰ� 10����)
 *  ��� : ���� ��
 */

import java.util.Scanner;

public class q11_remainder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>=2 && a<=10000) {
			if (b>=2 && b<=10000) {
				if (c>=2 && c<=10000) {
					System.out.println((a+b)%c);
					System.out.println(((a%c)+(b%c))%c);
					System.out.println((a*b)%c);
					System.out.println(((a%c)*(b%c))%c);
				}
			}
		}
		
	}
}
