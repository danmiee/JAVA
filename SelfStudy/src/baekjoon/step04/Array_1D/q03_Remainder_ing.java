package baekjoon.step04.Array_1D;

import java.util.Scanner;

public class q03_Remainder_ing {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N1[] = new int[10];
		int N2[] = new int[10];
		int count = 0;
		
		for(int i=0; i<N1.length; i++) {
			N1[i]=sc.nextInt();
			N2[i]=N1[i]%42;
		}

		// �迭��� �ߺ��� �����ϰ� ���̱��ϱ� 
		
		System.out.println(count);
		
	}
}
