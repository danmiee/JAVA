package baekjoon.step07.math;

import java.util.Scanner;

public class q01_BreakEvenPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b>=c)
			System.out.println(-1);
		else
			System.out.println(a/(c-b)+1);
		
		sc.close();
	}
}
		
		
//		if(b==c) {
//			System.out.println(-1);
//			System.exit(0);
//		}
//		
//		// b==c�� ��� ���������ϵ��� �ߴµ� �� ArithmeticException�� �ߴ��� �𸣰���..
//		int x = (int) a/(c-b);
//		
//		if(x>=1)
//			System.out.println(x+1);
//		else
//			System.out.println(-1);
