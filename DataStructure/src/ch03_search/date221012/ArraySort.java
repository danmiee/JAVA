package ch03_search.date221012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//string ����, binary search ����
//1�ܰ�: string, 2�ܰ�: string ��ü,  Person ��ü���� list\
public class ArraySort {
	public static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // List
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");

		list.add("����");
		list.add("�θ�");
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");

		list.add(1, "LA");

		// sort - ������������ ����, ������������ ����, �ߺ� �����ϴ� �ڵ�
		System.out.println("collection.sort()::");
//		Collections.sort(list);
		/*
		 * �迭�� city�� �����Ϸ��� �ݺ�for���� if���� ��ø�Ͽ� ����Ͽ��� �� String�� �Ұ� ���� ����� ���� List�� Ȱ���Ͽ�
		 * �����ϰ� �ڵ�
		 */
		for (String city : list)
			System.out.println(city);

		String cities[] = new String[0]; // Array

		// List > Array
		cities = list.toArray(cities);

		// �迭�� �����ϱ�
		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++) {
				int cpt = cities[i].compareTo(cities[j]);
				String temp = null;
				if (cpt > 0) {
					temp = cities[j];
					cities[j] = cities[i];
					cities[i] = temp;
				}
			}
		}

		System.out.println("������::");
		for (String city : cities)
			System.out.println(city);

		// �ߺ�����
		System.out.println("�ߺ�����::");
		
		// ������ �������� ������ ������ �ڵ�. ArrayList���� �ߺ������� ��
//		for (int i = 0; i < cities.length; i++) {
//			for (int j = i + 1; j < cities.length; j++) {
//				if (cities[i] != "" && cities[i].equals(cities[j])) {
//					cities[j] = "";
//				}
//			}
//		}

		// Array > List
		ArrayList<String> lst = new ArrayList<>();

		for(String item : cities) {
			if(!lst.contains(item))
				lst.add(item);
		}
		
		// ����!  ������ �ε��� �ߺ����� Ȯ�κҰ�
//		int cnt = lst.size();
//		for(int i=0; i<cnt; i++) {
//			for(int j=i+1; j<cnt; j++) {
//				if(lst.get(i).equals(lst.get(j))) {
//					cnt--;
//					lst.remove(j);
//				}
//			}
//		}
		
		for (String city : lst) {
			System.out.println(city);
		}
	}
}