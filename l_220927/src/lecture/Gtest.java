package lecture;

import java.util.Scanner;

public class Gtest {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ڹٴ� �⺻������ Object Ŭ������ ��۹޴´�.
		Object o = new Object();
			// ������ ���� ���� ��. jdk�� ��ġ�Ǿ������� ������ �� �� �ִ�.
		
		// �������� �������̽��� ���� �Է¹�
		System.out.println("A: ");
		int a = sc.nextInt();
		System.out.println("B: ");
		int b = sc.nextInt();

		// Ŭ���� ������̹Ƿ� ���� �ۼ��� �ڵ� �� ���� �߿��� �κ� �ڡڡ�
		Gcdlcm gl1 = new Gcdlcm();
		gl1.setNum1(a);
		gl1.setNum2(b);

		Gcdlcm gl2 = new Gcdlcm(a, b);
		gl2.print();

	}
}
