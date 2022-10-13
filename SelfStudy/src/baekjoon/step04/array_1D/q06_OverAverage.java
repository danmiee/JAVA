package baekjoon.step04.array_1D;

import java.util.Scanner;

public class q06_OverAverage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0; i<c; i++) {		// ���̽� ������ŭ �ݺ�
			int n = sc.nextInt();		// �л� ��
			int [] scr = new int[n];	// �л��� ����
			int sum = 0;				// �հ�����
			double avg = 0;				// �������
			int cnt = 0;				// ����̻� �л� ��
			double percent = 0;			// ����̻� �л� ����
			
			for(int j=0; j<n; j++) {
				scr[j] = sc.nextInt();
				sum += scr[j];
				avg = sum/n;			// �������
			}
			for(int j=0; j<n; j++) {				
				if(scr[j]>avg) {
					cnt++;				// ��ճѴ� �л� ��
				}
			}
			percent = (double) cnt/n*100;
			System.out.println(String.format("%.3f", percent) + "%");
		}
	}
}
