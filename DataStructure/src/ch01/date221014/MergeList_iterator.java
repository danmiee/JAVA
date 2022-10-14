package ch01.date221014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MergeList_iterator {

	// �ߺ��ڵ�� �˾�! �޼ҵ�� �����
 	private static String[] removeDuplicate(String[] lst) {
		// �ߺ�����
		int count = lst.length;
		for (int i = 0; i < count; i++) {
//		for (int j = i + 1; j < count; j++)   > �����߻� > while�� ����
			int j = i + 1;
			while (j < count) {
				if (lst[i].compareTo(lst[j]) == 0) {
					lst = removeElement1(lst, lst[j]);
					// �ߺ����ŷ� ���� �迭ũ�� ���
					count--;
				} else
					j++;
			}
		}
		return lst;
	}

	// �迭������ �ߺ��� ������ �� ��� ������� �޼ҵ�
	private static String[] removeElement1(String[] arr, String item) {
		// ArrayList ����
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		// remove�޼ҵ�� �������
		list.remove(item);
		return list.toArray(String[]::new);
	}

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

		// list > array
		String[] lst1 = new String[0];
		lst1 = list1.toArray(lst1);
		String[] lst2 = new String[0];
		lst2 = list2.toArray(lst1);

		// �ߺ�����
		lst1 = removeDuplicate(lst1);
		lst2 = removeDuplicate(lst2);

		System.out.println();
		System.out.println("lst1::");
		for (String city : lst1)
			System.out.print(city + " ");

		System.out.println();
		System.out.println("lst2::");
		for (String city : lst2)
			System.out.print(city + " ");

		// merge ���� �κ�
		System.out.println();
		System.out.println("merge:: ");

		// ArrayList�� merge�ϱ�
		ArrayList<String> list3 = new ArrayList<String>();

		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();

		while (iter1.hasNext() && iter2.hasNext()) {
			list3.add(iter1.next());
			list3.add(iter2.next());
		}
		while (iter1.hasNext()) {
			list3.add(iter1.next());
		}
		while (iter2.hasNext()) {
			list3.add(iter2.next());
		}
		
		Collections.sort(list3);
		
		String[] lst3 = new String[0];
		lst3 = list3.toArray(lst3);
		lst3 = removeDuplicate(lst3);
		
		for (String city : lst3)
			System.out.print(city + " ");

	}

}