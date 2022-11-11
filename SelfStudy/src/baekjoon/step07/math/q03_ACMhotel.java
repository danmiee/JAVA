package baekjoon.step07.math;

import java.util.Scanner;

public class q03_ACMhotel {

	static int assign(int H, int W, int N) {
		// �� ��: y, ȣ ��: x
		int y = 0, x = 0;

		if (N % H == 0) {
			y = H*100;
			x = N / H;
		} else {
			y = (N % H) * 100;
			x = N / H + 1;
		}
		return x+y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� �׽�Ʈ ������ ����: ");
		int T = sc.nextInt();
		int n = 0;
		while (n < T) {
			System.out.print("ȣ���� �� ��, �� ��, ���° �մ�: ");

			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			System.out.println(assign(H, W, N));
			n++;
		}
		sc.close();
	}
}
