package com.ruby.java_04_array;

import java.util.Scanner;

/*
 * ����: A,E,I,O,U
 * ���ڿ��� ������ ���� ���� ���
 * toCharArray : ���ڿ��� ���� �迭�� ����� String�� �޼ҵ� 
 */

public class LettersPrint {

	// ���� ���� �迭
//	vowel(c) ���ϰ� : ����		
/*
 * 	���ϰ�
 * 0 : ����
 * 1 : ����
 * 2 : ����
 * 3 : �� ��
 */
	private static int vowel(char c) {
		// ���ڸ�
		if(c>=48 && c<=57) {
			return 2;
			// ���ڸ�
		} else if((c>=65 && c<=90) || (c>=97 && c<=122)) {
			// �����̸�
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				return 1;
			} 
			// �׷��� ������
			return 0;
		} 
		// �׿�(���ڵ� ���ڵ� �ƴ�)�̸�
		return 3;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");

		// ���ڿ� �Է¹ޱ�
		String str = sc.next();

		// ����� �迭
		int [] res = new int[4];
		
		// �Է¹��� ���ڿ��� ���� �迭�� �����
		char[] arr = str.toCharArray();
		// ���ڹ迭 ��� �ϳ��� �ݺ���
		for(char c : arr) {
			// �������� Ȯ���ϱ�
			int ret = vowel(c);	// �ڡڡ� �Լ�ȣ�� ������
			res[ret]++;
		}

		System.out.printf("����: %d��\n",res[0]);
		System.out.printf("����: %d��\n",res[1]);
		System.out.printf("����: %d��\n",res[2]);
		System.out.printf("�� ��: %d��\n",res[3]);
		
	}

}
