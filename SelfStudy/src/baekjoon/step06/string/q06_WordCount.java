package baekjoon.step06.string;

import java.util.Scanner;

public class q06_WordCount {

	public static int count(String str) {
		
		String[] arr = str.split(" ");
		int cnt = arr.length;
		
		// �ƹ��͵� �Է����� ���� ���
		if(arr.length == 0) {
			System.out.println(0);
			System.exit(0);			// ���α׷� ��������
		}
			
		if(arr[0].equals(""))
			cnt--;
		else
			return cnt;
		
		// ������ �����̽��� �����Ϸ��� �迭�� ���Խ�Ű�� �����Ƿ� ���ʿ�
//		if(arr[arr.length-1].equals(""))
//			cnt--;
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(count(str));
		
		sc.close();
	}
}
