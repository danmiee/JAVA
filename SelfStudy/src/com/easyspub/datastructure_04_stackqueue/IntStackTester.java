package com.easyspub.datastructure_04_stackqueue;
// int�� ���� ���� ���� ���(push, pop, peek, dump)

// ��� �޼ҵ� �߰�(clear, indexOf, getCapacity, size, isEmpty, isFull)

import java.util.Scanner;

import com.easyspub.datastructure_04_stackqueue.IntStack.EmptyIntStackException;
import com.easyspub.datastructure_04_stackqueue.IntStack.OverflowIntStackException;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println();
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.println("(1) Ǫ�� (2) �� (3) ��ũ (4) ���� "
					+ "(5) �ʱ�ȭ (6) �˻� (7) �뷮 (8) �Էµ����� ���� (9) empty���� (10) full���� " + "(0) ����: ");

			// ���ϴ� ���� ��ȣ �Է�
			int menu = sc.nextInt();
			// �Է°��� 0�̸� �ݺ��� ����
			if (menu == 0)
				break;

			// menu���� ���� switch-case Ȱ��

			int x; // �迭��ҷ� ����� �ʵ� ����

			switch (menu) {

			case 1:
				// push�� �Է¹ޱ�
				System.out.println("������: ");
				x = sc.nextInt();
				// push ����
				// ���ܻ�Ȳ : overflow
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					e.print();
				}
				break;

			case 2:
				// pop ����
				// ���ܻ�Ȳ : empty
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + " �Դϴ�.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 3:
				// peek ����
				// ���ܻ�Ȳ : empty
				try {
					x = s.peek();
					System.out.println("���� �����ʹ� " + x + " �Դϴ�.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 4:
				// dump ����
				// ���ܻ�Ȳ : empty
				try {
					s.dump();
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 5:
				// clear ����
				s.clear();
				break;

			case 6:
				// x�� �Է¹޾� indexOf ����
				// ���ܻ�Ȳ : empty
				try {
					System.out.println("������: ");
					x = sc.nextInt();
					if(s.indexOf(x)==-1)
						System.out.println(x + "�� �������� �ʽ��ϴ�.");
					else
						System.out.println(x + "�� index�� " + s.indexOf(x) + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;
				
			case 7:
				// getCapacity ����
				System.out.println("������ capacity�� " + s.getCapacity() + "�Դϴ�.");
				break;

			case 8:
				// size ����
				System.out.println("���� ������ ������ " + s.size() + "�� �Դϴ�.");
				break;
			
			case 9:
				// isEmpty ����
				if(s.isEmpty())
					System.out.println("������ ����ֽ��ϴ�.");
				else
					System.out.println("������ ������� �ʽ��ϴ�.");
				break;
				
			case 10:
				// isFull ����
				if(s.isFull())
					System.out.println("������ �������ֽ��ϴ�.");
				else
					System.out.println("������ ���������� �ʽ��ϴ�.");
				break;
				
			}
		}
		sc.close();
	}
}
