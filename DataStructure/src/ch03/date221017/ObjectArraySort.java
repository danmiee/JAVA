package ch03.date221017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Fruit implements Comparable<Fruit>{

	private String name;
	private int price;

	public Fruit() {
	}

	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "(" + "name= " + name + ", " + "price= " + price + ")";
	}
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		if(this.price > o.price) {
			return 1;
		} else if(this.price< o.price) {
			return -1;
		} else {
			if(this.name.compareTo(o.name)>0) {
				return 1;
			} else if(this.name.compareTo(o.name)<0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}

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
				// TODO Auto-generated method stub
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				} else if(o1.getPrice()<o2.getPrice()) {
					return -1;
				} else {
					if(o1.getName().compareTo(o2.getName())>0) {
						return 1;
					} else if(o1.getName().compareTo(o2.getName())<0) {
						return -1;
					} else {
					return 0;
					}
				}
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
			if(obj1.getPrice()<obj2.getPrice()) {
				list3.add(obj1);
				obj1 = iter1.next();
			} else if(obj1.getPrice()>obj2.getPrice()) {
				list3.add(obj2);
				obj2 = iter2.next();
			} else {
				if(obj1.getName().compareTo(obj2.getName())<0) {
					list3.add(obj1);
					obj1 = iter1.next();
				} else if(obj1.getName().compareTo(obj2.getName())>0) {
					list3.add(obj2);
					obj2 = iter2.next();
				} else {
				list3.add(obj1);
				obj1 = iter1.next();
				obj2 = iter2.next();
				}
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

		if(iter1.hasNext()==false) {
			list3.add(obj1);
		}
		if(iter2.hasNext()==false) {
			list3.add(obj2);
		}

		System.out.println("merge:: ");
	    for ( Fruit city: list3)
	    	System.out.println(city);
	    
	    Fruit newFruit = new Fruit("����", 100);
		// binary search - Comparator�� ����� ����
	    
	    Comparator<Fruit> cc = new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				} else if(o1.getPrice()<o2.getPrice()) {
					return -1;
				} else {
					if(o1.getName().equals(o2.getName())) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		};

		System.out.println();
	    if (Collections.binarySearch(list3, newFruit, cc) < 0)
			System.out.println("��ȸ��� ����");
	    else System.out.println("��ȸ ��� "+ newFruit);

	}

}
