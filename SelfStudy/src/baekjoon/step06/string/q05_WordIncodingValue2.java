package baekjoon.step06.string;

import java.util.Scanner;

public class q05_WordIncodingValue2 {

	public static int[] count(String str) {

		// ���ĺ����� �迭 ����
		int[] abc = new int[26];
		
		// str ���鼭 �ش��ϴ� index�� +1
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				abc[str.charAt(i) - 65]++;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				abc[str.charAt(i) - 97]++;
			} else {
				System.out.println("�����ڸ� �Է����ּ���.");
			}
		}
		return abc;
	}
	
	public static void print(int[] abc) {
		
		// max �� ã��
		int max = -1;
		char res = '?';
		
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > max) {
				max = abc[i];
				res = (char) (i + 65);
			} else if (abc[i] == max) {
				res = '?';
				// break �־ Ʋ�� > break�ϸ� ���ĺ� ��� Ȯ���� �ȵ�
			}
		}
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {

		// �ƽ�Ű�ڵ� Ȱ���ϱ�
		// �빮��: 65~90
		// �ҹ���: 97~122

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		print(count(str));

		sc.close();
	}
}
