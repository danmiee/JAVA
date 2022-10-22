package ch04_stack_queue.date221021;

import java.util.Scanner;

public class QueueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue s = new Queue(3);
		
		while (true) {
					
			System.out.println(" "); // �޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)��ť��(2)��ť��(3)��ũ��(4)������(0)����: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // ��ť
				System.out.print("������: ");
				x = sc.nextInt();
				try {
					s.enque(x);
				} catch (Queue.OverflowQueueException e) {
					e.print();
				}
				break;

			case 2: // ��ť
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Queue.EmptyQueueException e) {
					e.print();
				}
				break;

			case 3: // ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Queue.EmptyQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;
			}
		}
		sc.close();
	}
}
