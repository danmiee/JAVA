package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class FigureArea_loop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int text, w, h, rac_a, tr_a;

		System.out.print("�ﰢ��/�簢��[3/4]:");

		while ((text = in.nextInt()) != 0) {

			if (text == 0)
				break;

			w = in.nextInt();
			h = in.nextInt();
			rac_a = w * h;
			tr_a = (w * h) / 2;

			if (text == 3)
				System.out.printf("�ﰢ�� : �ʺ�-%d, ����-%d, ����-%d\n", w, h, tr_a);
			else if (text == 4)
				System.out.printf("�簢�� : �ʺ�-%d, ����-%d, ����-%d\n", w, h, rac_a);
			else
				System.out.println("Ȯ���� �� �����ϴ�.");

			System.out.print("�ﰢ��/�簢��[3/4]:");
		}

		System.out.println("Good Bye!!");

		in.close();
	}
}
