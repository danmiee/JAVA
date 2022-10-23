package ch03_search.date221017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ch03_search.Fruit;

// comparable : �ڱ��ڽŰ� �Ű����� ��ü�� ��, import ���ʿ�
// comparator : �� �Ű����� ��ü�� ��, import �ʿ�

public class ObjectArraySort {
	public static void main(String[] args) {
//		String[] s = { "sort", "string", "array" };
//		Arrays.sort(s);
//		System.out.println(Arrays.toString(s));
//		Arrays.sort(s, Comparator.naturalOrder());
//		System.out.println(Arrays.toString(s));
//		Arrays.sort(s, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(s));
//		
//		/*
//		Arrays.sort(s, new Comparator<String>() {
//		    @Override
//		    public int compare(String o1, String o2) {
//		        return o2.compareTo(o1);            // ������������ ����
//		    }
//		});
//		*/
//		s = Arrays.stream(s).sorted().toArray(String[]::new);	
//		s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
//		Collections.sort(Arrays.asList(s));

		Fruit[] arr = { 
				new Fruit("���", 200), 
				new Fruit("Ű��", 500), 
				new Fruit("������", 200), 
				new Fruit("�ٳ���", 50),
				new Fruit("����", 880), 
				new Fruit("ü��", 10)
		};

//		System.out.println("arr ������::");
//		for (Fruit city : arr)
//			System.out.println(city);

		Arrays.sort(arr);
		// ���� - ����

		System.out.println("arr ������::");
	    for ( Fruit city: arr)
		System.out.println(city);

		ArrayList<Fruit> list1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> list2 = new ArrayList<Fruit>();
		
		list2.add(new Fruit("������", 200));
		list2.add(new Fruit("����", 300));
		list2.add(new Fruit("����", 100));
		list2.add(new Fruit("����", 50));
		list2.add(new Fruit("��纣��", 500));
		list2.add(new Fruit("������", 300));
		
//		System.out.println("list2 ������::");
//	    for ( Fruit city: list2)
//	    	System.out.println(city);
	    
	    Comparator<Fruit> cp = new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				// class Fruit���� Override �Ϸ�
				return o1.compareTo(o2);
			}
	    };
	    
//	    Fruit[] arr2 = new Fruit[0];
//	    arr2 = list2.toArray(arr2);
//	    Arrays.sort(arr2);
	    Collections.sort(list2, cp);

		System.out.println("list2 ������::");
	    for ( Fruit city: list2)
	    	System.out.println(city);
	    
	    ArrayList<Fruit> list3 = new ArrayList<Fruit>();
		
		Iterator<Fruit> iter1 = list1.iterator();
		Iterator<Fruit> iter2 = list2.iterator();
		
	//����- merge�� iterator ���

		Fruit obj1 = iter1.next();
		Fruit obj2 = iter2.next();
		
		while(iter1.hasNext() && iter2.hasNext()) {
			if(obj1.compareTo(obj2)<0) {
				list3.add(obj1);
				obj1 = iter1.next();
			} else if(obj1.compareTo(obj2)>0) {
				list3.add(obj2);
				obj2 = iter2.next();
			} else {
				list3.add(obj1);
				obj1 = iter1.next();
				obj2 = iter2.next();
			}
		}
		while(iter1.hasNext()) {
			list3.add(obj1);
			obj1 = iter1.next();
		}
		while(iter2.hasNext()) {
			list3.add(obj2);
			obj2 = iter2.next();
		}
		if(!iter1.hasNext()) {
			list3.add(obj1);
		}
		if(!iter2.hasNext()) {
			list3.add(obj2);
		}
		
		Collections.sort(list3);

		System.out.println("merge:: ");
	    for ( Fruit city: list3 )
	    	System.out.println(city);
	    
	    Fruit newFruit = new Fruit("����", 100);
		// binary search - Comparator�� ����� ����
	    
	    Comparator<Fruit> cc = new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				// class Fruit���� Override �Ϸ�
				return o1.compareTo(o2);
			}
		};

		System.out.println("��ȸ ��� ::");
	    if (Collections.binarySearch(list3, newFruit, cc) >= 0)
	    	/* binarySearch(a, key, comparator)
	    	 * a : �˻� ����
	    	 * key : �˻� ���
	    	 * comparator : �˻� ����
	    	 */
	    System.out.println(newFruit);
	    else System.out.println("��ȸ��� ����");

	}

}
