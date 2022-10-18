package baekjoon.step06.string;

import java.util.Scanner;

public class q05_Word {

	public static void main(String[] args) {

		// ��ҹ��ڷ� �̷���� �ܾ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] strArray = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			strArray[i] = String.valueOf(str.charAt(i));
		}

		// ���� ���� ���� ���ĺ� Ȯ��
		int[] cnt = new int[strArray.length];
		for (int i=0; i<strArray.length; i++) {
			cnt[i] = 1;
		}

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				// ��ҹ��� ���о��� ��
				if (strArray[i].equalsIgnoreCase(strArray[j])) {
					++cnt[i];
				}
			}
		}

		// cnt�� max �� ã��
		int max = 0;
		String res = "";
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				res = strArray[i];
			} else if (max == cnt[i]) {
				res = "?";
			}
		}

		System.out.println(res.toUpperCase());

		sc.close();
	}
}
