package com.ruby.java_04_array;

import java.util.Arrays;
import java.util.Random;

public class SortNumbers {

	public static void main(String[] args) {

		int[] sort = new int[7];
		// �迭 ����
		for (int i = 0; i < sort.length; i++) {
			Random rd = new Random();
			sort[i] = rd.nextInt(46);
			// �迭��ҷ� ���� �� �Է�
			for (int j = 0; j < i; j++) {
				if (sort[i] == sort[j]) {
				// �迭��� �ߺ� ��
					i--;
					// �ش� ȸ�� �迭��� ���Է�
				}
			}
		}
		System.out.println("�Է�: "+ Arrays.toString(sort));
		
		for (int a = 0; a < sort.length; a++) {
			for (int b = a + 1; b < sort.length; b++) {
			// sort[a]�� sort[b]�� �ߺ��� ������ϹǷ� b=a+1
				if (sort[a] > sort[b]) {
				// �յ� ��� �� ũ�� ��
					int temp = sort[a];	// a��° ��� �ӽú���
					sort[a] = sort[b];	// a��° ��ҿ� �� ���� �� �־��ֱ�
					sort[b] = temp;		// b��° ��ҿ� �� ū �� �־��ֱ�
					// temp : �ӽ������
				}
			}
		}
		System.out.println("���: "+ Arrays.toString(sort));
	}
}
