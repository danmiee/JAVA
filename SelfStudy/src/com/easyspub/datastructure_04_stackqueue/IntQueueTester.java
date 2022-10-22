package com.easyspub.datastructure_04_stackqueue;

import java.util.Scanner;

import com.easyspub.datastructure_04_stackqueue.IntQueue.EmptyIntQueueException;
import com.easyspub.datastructure_04_stackqueue.IntQueue.OverflowIntQueueException;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue(4);

		while (true) {
			System.out.println();
			System.out.printf("���� ������ ����: %d / %d\n", q.size(), q.getCapacity());
			System.out.println("(1) ��ť (2) ��ť (3) ��ũ (4) ���� (0) ����: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;

			switch (menu) {

			case 1:
				System.out.println("������: ");
				x = sc.nextInt();
				// enque ����
				// ���ܻ�Ȳ : overflow
				try {
					q.enque(x);
				} catch (OverflowIntQueueException e) {
					e.print();
				}
				break;

			case 2:
				// deque ����
				// ���ܻ�Ȳ : empty
				try {
					x = q.deque();
					System.out.println("��ť�� �����ʹ� " + x + " �Դϴ�.");
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			case 3:
				// peek ����
				// ���ܻ�Ȳ : empty
				try {
					x = q.peek();
					System.out.println("���� �����ʹ� " + x + " �Դϴ�.");
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			case 4:
				// dump ����
				// ���ܻ�Ȳ : empty
				try {
					q.dump();
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			}
		}
		sc.close();
	}
}
