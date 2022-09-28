package training;
/*
 * Ŭ���� �����
 * ���� 2�� �Է¹ޱ�
 * �ִ����� ���
 * �ּҰ���� ���
 */

import java.util.Scanner;

class Gcd {
	// Ŭ���� ����
	public static int gcd(int min, int max) {
		/*
		 *  ���ȣ�� : �ڱ��ڽ��� ȣ���ϴ� ��
		 *  .. �߸����� ���ѷ���!!
		 *  ���⼭�� min�� max���� ū ���
		 *  max / min = 0...min
		 *  �� ū ���� �������� ���� �� �����Ƿ� �������� �׻� min
		 */ 
		int rem = max % min;
		// �ִ������� ���ϴ� �޼ҵ� ����
		if (rem == 0) {
			return min;
			// y%x=0�̸� x=�ִ�����, y=�ּҰ����
		} else {
			return gcd(rem, min);
			// rem�� 0�� �ƴϸ� y=x, x=y%x ��ȯ
		}
	}
}

public class Gcdlcm {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2���� ������ �Է��ϸ� �ִ������� �ּҰ������ ����մϴ�.");
		System.out.println("���Ḧ ���Ͻø� 0�� �Է��ϼ���.");

		Scanner sc = new Scanner(System.in);
		int x, y;
		while ((x = sc.nextInt()) != 0) {
			y = sc.nextInt();

			System.out.println("�Է°�: " + x + "," + y);
			System.out.println("�ִ�����: " + Gcd.gcd(x, y));
			System.out.println("�ּҰ����: " + x * y / Gcd.gcd(x, y));
		}

		System.out.println("�����ϼ̽��ϴ�.");
	}

}