package com.easyspub.datastructure_05_recursive;

import java.util.Scanner;

public class FactorialEx {

	static int factorial(int n) {
		int fac = 1;
		while (n > 0)
			fac *= n--;
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���: ");
		int x = sc.nextInt();

		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");

		sc.close();
	}
}
