package baekjoon.step01.inoutncal;

/*
 * ü���� ŷ1, ��1, ��2, ���2, ����Ʈ2, ��8���� ����
 * ��� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� Ȯ��
 * 
 *  �Է� : 6�� ���� �Է�(0�ʰ� 10����)
 *  ��� : ���� ��
 */

import java.util.Scanner;

public class q10_chess {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x1 = 1-sc.nextInt();
		int x2 = 1-sc.nextInt();
		int x3 = 2-sc.nextInt();
		int x4 = 2-sc.nextInt();
		int x5 = 2-sc.nextInt();
		int x6 = 8-sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d",x1,x2,x3,x4,x5,x6);
	}

}
