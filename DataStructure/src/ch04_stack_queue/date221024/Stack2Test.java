package ch04_stack_queue.date221024;

import java.util.Scanner;

public class Stack2Test {

	public class TestGenericStatck {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Stack2 s = new Stack2(8); // �ִ� 64 ���� Ǫ���� �� �ִ� ����
			int rndx = 0, rndy = 0;
		
			while (true) {
				System.out.println(); // �޴� ������ ���� �� �� �߰�
				System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
				System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��(4)������(0)����: ");

				int menu = sc.nextInt();
				if (menu == 0)
					break;

				switch (menu) {
				case 1: // Ǫ��
					System.out.print("������: ");
					
					if (s.isFull())
						System.out.println("������ ����á�ֽ��ϴ�.");
					else {
						Point p = new Point(rndx, rndy);
						rndx = (int) (Math.random()*10);
						rndy = (int) (Math.random()*10);
						if(s.indexOf(p)!=-1) {
							rndx = (int) (Math.random()*10);
							rndy = (int) (Math.random()*10);
						}
						s.push(p);
					}
					break;

				case 2: // ��
					if (s.isEmpty())
						System.out.println("������ ����ֽ��ϴ�.");
					else {
						Point p = new Point(rndx,rndy);
						p = s.pop();
						System.out.println("���� �����ʹ� " + p + "�Դϴ�.");
					}
					break;

				case 3: // ��ũ
					if (s.isEmpty())
						System.out.println("������ ����ֽ��ϴ�.");
					else {
						Point p = new Point(rndx,rndy);
						p = s.peek();
						System.out.println("��ũ�� �����ʹ� " + p + "�Դϴ�.");
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
}
