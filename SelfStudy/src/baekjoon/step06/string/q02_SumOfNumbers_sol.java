package baekjoon.step06.string;

import java.util.Scanner;

public class q02_SumOfNumbers_sol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		
        // num2�� num1��ŭ�� ���ڷ� �Է��Ѵٰ� �������� �־����� ������ String���� �Է¹޾Ƶ� ������ ������ ����
		String num2 = sc.next();
		int sum = 0;
        
		for(int i=0; i<num1; i++) {
			sum += num2.charAt(i)-'0';
			// ���ڿ� �� �ε����� ĳ���Ͱ� �������� > �ƽ�Ű�ڵ�� ����
			// ���ڷ� �ԷµǹǷ� 0�� ���� �Էµ� ���ڰ��� ���� ���� ���� �� ����
		}
		
		System.out.println(sum);
        sc.close();
        // memory leak ����
	}
}
