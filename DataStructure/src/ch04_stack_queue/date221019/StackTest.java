package ch04_stack_queue.date221019;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>(3);

		int menu = -1;

		System.out.println();
		System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
		System.out.println("���ϴ� �۾� ��ȣ�� �Է��ϼ���");
		System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)����  (0)����");
		
		while ((menu = sc.nextInt()) != 0) {

				Integer x;
				
				switch (menu) {
				
				case 1: // Ǫ��
					System.out.print("������ : ");
					x = (Integer) sc.nextInt();
					if (s.size() == s.getCapacity())
						System.out.println("������ �������ֽ��ϴ�.");
					else {
						s.push(x);
						System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
					}
					break;
					
				case 2: // ��
					if (s.getCapacity() == 0)
						System.out.println("������ ����ֽ��ϴ�.");
					else {
						x = s.pop();
						System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
					}
					break;
					
				case 3: // ��ũ
					if (s.getCapacity() == 0)
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
