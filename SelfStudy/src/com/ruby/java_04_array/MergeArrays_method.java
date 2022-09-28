package com.ruby.java_04_array;

import java.util.Arrays;
import java.util.Scanner;

class Getmerge {

	int n;

	public void merge(int n) {
		this.n = n;

		int[] A = new int[n];
		int[] B = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 10);
		}
		/*
		 * Math.random : �Ǽ��� �������� ��ȯ ���ϴ� �ڸ�����ŭ ���� �� int������ ��ȯ�����ν� �Ҽ������� �ڵ� ����
		 */
		for (int j = 0; j < B.length; j++) {
			B[j] = (int) (Math.random() * 10);
		}
		
//		0&¦�� �ε����� A��, Ȧ�� �ε����� B�� �ҷ�����
		int[] C = new int[n * 2];

		for (int k = 0; k < C.length; k += 2) {
			// �ѹ� ���� �� 2���� �� ��������
			C[k] = A[k / 2];
			C[k + 1] = B[k / 2];
			// 0 ���� ¦�� �ε����� A��, Ȧ�� �ε����� B��
		}

		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
		System.out.println("Merge: " + Arrays.toString(C));
	}

}

public class MergeArrays_method {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("�迭�� ũ�⸦ �Է��ϸ� 2���� ���� �迭�� �� �迭�� �������� ����մϴ�.");
		System.out.println("Ȯ���� ������ 0�� �����ּ���.");
		
		while((n= sc.nextInt())!=0) {

		Getmerge m = new Getmerge();
		m.merge(n);

		}

		System.out.println("�����ϼ̽��ϴ�.");
	}
}
