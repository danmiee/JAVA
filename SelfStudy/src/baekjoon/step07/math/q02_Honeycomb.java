package baekjoon.step07.math;

import java.util.Scanner;

public class q02_Honeycomb {

	static int min(int num) {
		int cnt = 1;
		int rangeM = 2;
		if(num == 1)
			return 1;
		else {
			while(rangeM<=num) {
				rangeM += 6*cnt;
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϸ� ������ ���� �ּ� ������ ���մϴ�.(����: 0)");
		int N;
		while((N=sc.nextInt())!=0) {
		System.out.println(min(N));
		}
		sc.close();
	}
}
