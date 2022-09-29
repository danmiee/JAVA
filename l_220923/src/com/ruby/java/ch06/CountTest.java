package com.ruby.java.ch06;
/*
 * code�� ���� static�� ������ �ǹ��ϴ��� �˾ƾ���
 */
class Count {
	public static int totalCount;
	int count;
	/*
	 * count, totalcount�� ������
	 * count : default ������(0)
	 *  �� �ش� ��Ű�� ������ �׳� ������ �� �� ����
	 * totalcount
	 *  �� static(code���� �����Ҵ�) <-> dynamic(new-JVM Garbage Collection)
	 */
}

public class CountTest {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int count = 0;
		Count.totalCount = 10;
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		/*
		 * class��(c1,c2,c3) ���� ��
		 * ���� ���� ������ �����Ƿ� error!!
		 * > main ������ count ������ �� ��밡��
		 * > �ش� ��Ȳ�� ��� count++; �� c2.count++;�� count�� ���� �ٸ� �ǹ��� 
		 */

		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}

}
/*
 * [����]
 * c1 : stack
 * c1.count : heep
 * totalCount : code
 * count�� ��ü������ ���� ���� ������ ����
 * totalCount�� 1���� ���� ����Ŵ
 */