package com.ruby.java.ch10;
// p.468~472
import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("����");		list.add("�ϰ�");		list.add("����");
		list.add("����");		list.add("����");		list.add("����");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.add("����");		list.add("�θ�");		list.add("����");
		list.add("�ϰ�");		list.add("����");		list.add("����");
		System.out.println("1 : "+list.toString());
		
		
		list.add(1,"LA"); print(2,list);
		
		System.out.println("3 : " + list.indexOf("����"));
		// ArrayList.indexOf : ��Ͽ� ������ ��Ұ� ó�� ��Ÿ���� �ε��� ��ȯ (��Ұ� ������ -1)
		
		System.out.println("4 : " + list.lastIndexOf("����"));
		// ArrayList.lastIndexOf : ��Ͽ��� ������ ��Ұ� ���������� �߻��� �ε��� ��ȯ (��Ұ� ������ -1)
		
		list.remove("LA"); print(5, list);
		// ArrayList.remove : ��Ͽ��� ������ ����� ù��°(�ε����� ���� ����) �׸� ���� (��� ������ ���� X)
		
		list.remove(2); print(6, list);
		// ArrayList.remove : ��Ͽ� ������ ��ġ�� �ִ� ��� ����
		
		System.out.println("7 : " + list.contains("LA"));
		// ArrayList.contains : ��Ͽ� ������ ��Ұ� �ϳ� �̻� ���ԵǾ� ������ ��ȯ
		
		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));
		
	}
	
	private static void print(int i, ArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.println(i+" : "+list);
	}
	
	

}
