package programmers.lv0;

import java.util.Arrays;
import java.util.Scanner;

/* 

���ڿ� before�� after�� �Ű������� �־��� ��,
before�� ������ �ٲپ� after�� ���� �� ������ 1��,
���� �� ������ 0�� return �ϵ��� solution �Լ��� �ϼ��غ�����.

���ѻ���
0 < before�� ���� == after�� ���� < 1,000
before�� after�� ��� �ҹ��ڷ� �̷���� �ֽ��ϴ�.

 */

public class q01_makeBfromA {
	
	public static String sort(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String str_sort = new String(charArr);
		return str_sort;
	}
	
	public static int solution(String before, String after) {

		// before, after�� �����Ͽ� ������ 1, �ٸ��� 0 ����
		if (sort(before).equals(sort(after)))
			return 1;
		return 0;
		
		// �Ʒ� �ڵ�� before�� ������ ������ �� after�� ������ ���
		// ���������� before�� after�� ��� ��Ұ� ������ 1�� ��ȯ�ϱ� ����
//		String before_r = "";
//		
//		for (int i = before.length()-1; i>-1; i--) {
//			before_r += before.charAt(i);
//		}
//		
//		System.out.println("before_r: " + before_r);
//		System.out.println("after: " + after);
//		
//		if (before_r.equals(after))
//			return 1;
//		return 0;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Ȯ���� ������ ���� �Է��ϼ���. (����:0)");
		while((n = sc.nextInt())!=0) {
			System.out.println("ù��° ���ڿ��� �Է��ϼ���.");
			String before = sc.next();
			System.out.println("�ι�° ���ڿ��� �Է��ϼ���.");
			String after = sc.next();
			System.out.println(solution(before, after));
		}
		sc.close();
	}
	
}
