package ch03_search.date221014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeList_array {

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

		/*
		 * 1. lst3 = merge lst1 & lst2 2. lst3 �ߺ�����
		 */
		String[] lst3 = new String[lst1.length + lst2.length];

		int i = 0, j = 0, k = 0;
		while (i < lst1.length && j < lst2.length) {
			int compare = lst1[i].compareTo(lst2[j]);
			if (compare < 0) {
				lst3[k] = lst1[i];
				i++;
				k++;
			} else if (compare > 0) {
				lst3[k] = lst2[j];
				j++;
				k++;
			} else {
				lst3[k] = lst1[i];
				i++;
				k++;
				j++;
//				lst3[k] = lst2[j];
//				j++; k++;
			}
		}
//		lst3 = removeDuplicate(lst3);

		while (i < lst1.length) {
			lst3[k] = lst1[i];
			i++;
			k++;
		}

		while (j < lst2.length) {
			lst3[k] = lst2[j];
			j++;
			k++;
		}

		for (String city : lst3)
			System.out.print(city + " ");

	}

}