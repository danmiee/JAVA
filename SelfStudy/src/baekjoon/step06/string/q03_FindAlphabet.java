package baekjoon.step06.string;

import java.util.Scanner;

public class q03_FindAlphabet {

	// ���ĺ��� �ܾ� �� ��ġ Ȯ��(������ -1)
	public static void show(String str) {
		char[] abc = {'a','b','c','d','e','f','g','h',
				'i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z'};
		for(char c : abc) {
			System.out.print(str.indexOf(c)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		// �ҹ��ڷ� �̷���� �ܾ� �Է¹ޱ�(str)
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		show(str);
	}
}
