package baekjoon.step04.Array_1D;

import java.util.Scanner;

public class q05_OXquiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String ox;
		
		for(int i=0; i<n; i++) {	// ���̽��� �ݺ�
			int cnt =0;		// �������� ī��Ʈ
			int scr = 0;	// ��������
			ox = sc.next();			// ���ڿ� �Է�
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j)=='O') {
					cnt++;			// �������� ī��Ʈ
					scr = scr+cnt;	// �������� ���
				} else {
					cnt=0;			// �������� �ʱ�ȭ
				}
			}
		System.out.println(scr);	
		}
	}
}
