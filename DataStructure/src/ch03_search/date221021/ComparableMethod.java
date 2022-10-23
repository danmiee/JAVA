package ch03_search.date221021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ch03_search.Fruit;

public class ComparableMethod {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("======��Ʈ��::");
		String[] s = { "����", "���", "��", "����", "������" };

		// �������� ����
//		Arrays.sort(s);
		// comparator �޼ҵ� Ȱ�� �������� ����
//		Arrays.sort(s, Comparator.reverseOrder()); 

		// comparator generic Ȱ��
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
//				return o2.compareTo(o1); // ������������ ����
				return o1.compareTo(o2); // ������������ ����
			}
		});

		Collections.sort(Arrays.asList(s));// s[]�� �ּҸ� lst���� ����ϹǷ� �����
		System.out.println("��������");
		for (String fx : s)
			System.out.println(fx);

		System.out.println("array > list");
		List<String> lst = Arrays.asList(s);
		for (String fx : lst)
			System.out.println(fx);

//		s = Arrays.stream(s).sorted().toArray(String[]::new);
//		s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);

		System.out.println("======��ü::");
		Fruit[] arr = { new Fruit("���", 200), new Fruit("Ű��", 500), new Fruit("������", 200), new Fruit("�ٳ���", 50),
				new Fruit("����", 880), new Fruit("ü��", 10) };

		// ��ü�迭(arr) ����
		System.out.println("��������");
		Arrays.sort(arr);
		for (Fruit fx : arr)
			// toString �������� �ʾƵ� �����Ϸ��� �ڵ����� ȣ��
			System.out.println(fx);

		// comparator generic Ȱ��

		System.out.println("��������");
		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o2.compareTo(o1);
			}
		});
		for (Fruit fx : arr)
			System.out.println(fx);

		System.out.println("=====���ٽ�::");

		// Fruit�� compareTo()�� �־ ���ٽ� �켱 ����
		System.out.println("��������");
		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice());
		// comparator generic Ȱ�� �κ��� ����� ��
		for (Fruit fx : arr)
			System.out.println(fx);

//		System.out.println("��������");
//		Arrays.sort(arr, (a, b) -> b.getPrice() - a.getPrice());
//		for (Fruit fx : arr)
//			System.out.println(fx);

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();

		lst2.add(new Fruit("������", 200));
		lst2.add(new Fruit("����", 300));
		lst2.add(new Fruit("����", 100));
		lst2.add(new Fruit("����", 50));
		lst2.add(new Fruit("��纣��", 500));
		lst2.add(new Fruit("������", 300));

		System.out.println("lst2 ������::");
		for (Fruit fx : lst2)
			System.out.println(fx);

		// list������ Arrays.sort ���Ұ�
//		Arrays.sort(lst2);

		// Collections.sort ���
		Collections.sort(lst2);

		System.out.println("lst2 ������::");
		System.out.println("��������");
		for (Fruit fx : lst2)
			System.out.println(fx);

//		System.out.println("��������");
//		Collections.sort(lst2, (a, b) -> b.getPrice() - a.getPrice());
//		for (Fruit fx : lst2)
//			System.out.println(fx);

		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();

		Iterator<Fruit> iter1 = lst1.iterator();
		Iterator<Fruit> iter2 = lst2.iterator();
		Fruit data1 = iter1.next();
		Fruit data2 = iter2.next();

		System.out.println("=====merge:: ");

		while (iter1.hasNext() && iter2.hasNext()) {
			if (data1.compareTo(data2) < 0) {
				lst3.add(data1);
				data1 = iter1.next();
			} else if (data1.compareTo(data2) > 0) {
				lst3.add(data2);
				data2 = iter2.next();
			} else {
				lst3.add(data1);
				data1 = iter1.next();
				data2 = iter2.next();
			}
		}
		while (iter1.hasNext()) {
			lst3.add(data1);
			data1 = iter1.next();
		}
		while (iter2.hasNext()) {
			lst3.add(data2);
			data2 = iter2.next();
		}
		if (!iter1.hasNext()) {
			lst3.add(data2);
		}
		if (!iter2.hasNext()) {
			lst3.add(data1);
		}

		Collections.sort(lst3);
		
		for (Fruit fx : lst3)
			System.out.println(fx);

		Fruit newFruit = new Fruit("����", 100);
		// binary search
		Comparator<Fruit> cc = new Comparator<Fruit>() {
			public int compare(Fruit u1, Fruit u2) {
				return u1.compareTo(u2);
			}
		};

		int result = Collections.binarySearch(lst3, newFruit, cc);
		System.out.println("��ȸ��� exist  " + result);

	}
}
