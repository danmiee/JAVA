package baekjoon.step07.math;

import java.util.Scanner;

public class q02_Honeycomb {

	static int min(int num) {
		// ������ ���� �ּҰ��� �ʱⰪ 1
		int cnt = 1;
		// ���� ���۰��� �ʱⰪ 2
		int range = 2;
		// �� ��ȣ�� 1�̸� �� ���� 1
		if(num == 1)
			return 1;
		// �� ��ȣ�� 1�� �ƴϸ�
		else {
			// ���� ���۰��� �� ��ȣ���� �۰ų� ���� ���� �ݺ�
			while(range<=num) {
				// ����Ŭ�� �þ ������ ���� ���۰� 6���� ����
				range += 6*cnt;
				// ������ ���� �ּҰ��� +1
				cnt++;
			}
		}
		// ������ ���� �ּҰ��� ����
		return cnt;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϸ� ������ ���� �ּ� ������ ���մϴ�.(����: 0)");
		// �� ��ȣ �Է�
		int N;
		while((N=sc.nextInt())!=0) {
		System.out.println(min(N));
		}
		sc.close();
	}
}
