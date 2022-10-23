package ch04_stack_queue.date221019;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>(3);

		while (true) {

			System.out.println();
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)����  (0)����: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;

			switch (menu) {

			case 1: // Ǫ��
				System.out.print("������ : ");
				x = (Integer) sc.nextInt();
				if (s.isFull())
					System.out.println("������ �������ֽ��ϴ�.");
				else
					s.push(x);
				break;

			case 2: // ��
				if (s.isEmpty())
					System.out.println("������ ����ֽ��ϴ�.");
				else {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				}
				break;

			case 3: // ��ũ
				if (s.isEmpty())
					System.out.println("������ ����ֽ��ϴ�.");
				else {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
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
