package ch03_search.date221012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Merge {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("����");
		list1.add("�ϰ�");
		list1.add("����");
		list1.add("����");
		list1.add("����");
		list1.add("����");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("����");
		list2.add("�θ�");
		list2.add("����");
		list2.add("�ϰ�");
		list2.add("����");
		list2.add("����");
		list2.add(1, "LA");

		// ���� sorting �ǽ�
		System.out.println("collection.sort()::");
		
		System.out.println("list1::");
		Collections.sort(list1);
		for (String city : list1)
			System.out.print(city + " ");
		System.out.println();
		
		System.out.println("list2::");
		Collections.sort(list2);
		for (String city : list2)
			System.out.print(city + " ");

		// list1�� list2�� ���ļ� ������ list3 �����
		ArrayList<String> list3 = new ArrayList<String>();

		// iter1.next : ���� ��� ��������
		// iter1.hasNext() : ���� ��� ������ 1, ������ 0
		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();
		
		// Iterator �ǽ�
		while(iter1.hasNext()) {
            String obj = (String)iter1.next();
            list3.add(obj);
        }
		while(iter2.hasNext()) {
            String obj = (String)iter2.next();
            list3.add(obj);
        }
		Collections.sort(list3);
		// ���ĵǾ��ִ� ���� �����ͼ� �ٽ� ���� > �������� > �ߺ����� �� �ѹ��� ó�� �ʿ�
		
		System.out.println();
		System.out.println("merge:: ");
		for (String city : list3)
			System.out.print(city + " ");

	}
}