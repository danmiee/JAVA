package lecture;

//import java.util.Scanner;

public class Gcdlcm {

	// ��������
	private int num1;
	private int num2;

	/*
	 *  ���������� private���� �ΰ� �Ǹ� Gtest(�ٸ� Ŭ����)���� ���� �Ұ�
	 *  > Setter ���� gl1
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// ������ �����Ͽ� ȣ���ϴ� ��� gl2
	public Gcdlcm() {
	}
	public Gcdlcm(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// ��Ŭ����ȣ���� - �ּҰ������ �ִ������� ���Ѵ�.
	// num1=a, num2=b
	public void print() {
		int max, min;

		// max, min�� ����
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}

		int rem = max % min;

		// ��Ŭ���� ȣ���� ���� �� ���μ� ����
		while (rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
			if (min == 1) {
				System.out.println("�ִ����� : ���μ�");
			} else {
				System.out.println("�ִ����� :" + min);
			}
			System.out.println("�ּҰ����: " + (num1 * num2) / min);
		}
	}
}
