package baekjoon.step06.string;

import java.util.Scanner;

public class q04_RepeatString {

	public static void show(int rpnum, String str) {
		// str.charAt()�� rpnum��ŭ �ݺ��Ͽ� ����ϱ�
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<rpnum; j++) {
				System.out.print(str.charAt(i));
			}
		}System.out.println();
	}

	public static void main(String[] args) {
		// �׽�Ʈ �� ���̽��� ���� �Է¹ޱ� (csnum)
		Scanner sc = new Scanner(System.in);
		int csnum = sc.nextInt();
		// csnum��ŭ �ݺ��� ����
			// �� �׽�Ʈ ���̽��� �ݺ�Ƚ�� �Է¹ޱ� (rpnum)
			// ���ڿ� �Է¹ޱ� (str)
		int rpnum;
		String str;
		for(int i=0; i<csnum; i++) {
			rpnum = sc.nextInt();
			str = sc.next();
			show(rpnum, str);
		}
		sc.close();
	}
}
