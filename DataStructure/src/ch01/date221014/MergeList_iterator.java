package ch01.date221014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MergeList_iterator {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("����");
		list1.add("�ϰ�");
		list1.add("����");
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
		list2.add("����");
		list2.add("����");
		list2.add("�λ�");
		list2.add("�Ѷ��");

		// ����
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

		// ArrayList�� merge�ϱ�
		ArrayList<String> list3 = new ArrayList<String>();

		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();

		// merge ���� �κ�
		System.out.println();
		System.out.println("merge:: ");

		String str1 = iter1.next();
		String str2 = iter2.next();

		while (iter1.hasNext() && iter2.hasNext()) {

			if (str1.compareTo(str2) > 0) {
				list3.add(str2);
				str2 = iter2.next();
			} else if (str1.compareTo(str2) < 0) {
				list3.add(str1);
				str1 = iter1.next();
			} else {
				list3.add(str1);
				str1 = iter1.next();
				str2 = iter2.next();
			}
		}

		while (iter1.hasNext()) {
			list3.add(iter1.next());
		}

		while (iter2.hasNext()) {
			list3.add(iter2.next());
		}

		Collections.sort(list3);

		// �ߺ�����
		for (int i = 0; i < list3.size(); i++) {
			for (int j = i + 1; j < list3.size(); j++) {
				if (list3.get(i).equals(list3.get(j))) {
					list3.remove(j);
				}
			}
		}

		for (String city : list3)
			System.out.print(city + " ");

	}

}