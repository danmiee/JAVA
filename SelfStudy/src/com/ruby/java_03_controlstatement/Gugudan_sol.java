package com.ruby.java_03_controlstatement;

public class Gugudan_sol {

	public void print(int x) {

		int i, j, k;
		
		for (i = 2; i < 10; i+=x) {
			
			for (j = 1; j < 10; j++) {
				/*
				 * i++ ���·� 2�ܰ� for�� �ϼ��ϸ�
				 * ù°�� : 2�� / ��°�� : 3�� ...
				 * ���� ��µ�
				 */
				for (k = 0; k < x; k++) {
					/*
					 *  �ܺ��� ����ϱ� ���� �ʿ��� �κ�
					 *  i+k�� ����ؾ� ù°���� �� �ܺ� *1 ���ظ� ��µ�
					 *  ��� �� �Է��ϴ� x���� ���� ���ϴ� �ܿ��� �ٹٲ� ����
					 */
					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
					// ������ ���� ���
					if (k < x - 1)		System.out.print("\t");
					// �ش� �� �ȿ��� �� ���̸� ������ ����
					else				System.out.println();
					// �� ���� �� �ٹٲٱ�
					if (i + k >= 10)	break;
					// *9 ���ر��� ����� �� for(k)���� ����������
					}
				}
			System.out.println();
			}
		}

	public static void main(String[] args) {

		Gugudan_sol gg = new Gugudan_sol();
		gg.print(4);
	}
}
