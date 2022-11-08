package baekjoon.step07.math;

import java.util.Scanner;

class Min {

	int min(int num) {
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
}

public class q02_Honeycomb2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϸ� ������ ���� �ּ� ������ ���մϴ�.(����: 0)");
		int N;
		while((N=sc.nextInt())!=0) {
		
			Min m = new Min();
			System.out.println(m.min(N));
		}
		sc.close();
	}
}
