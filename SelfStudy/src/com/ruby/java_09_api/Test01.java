package com.ruby.java_09_api;

public class Test01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		// hashCode : �ν��Ͻ��� �ο��� �ؽ��ڵ尪 ���
			// ������ ������ ���Ǵ� ���� �޶� ������ �ٸ� �� ����
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		// getClass : �ν��Ͻ��� ������ ������ Class ��ü�� �����Ͽ� ��ȯ
		Class c = obj1.getClass();
		
		// getName : ��ü�� �̸� ��ȯ
		System.out.println(c.getName());
		
		// toString �����ص� ������ ��� - �����Ϸ��� �ڵ�ȣ��
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		// MyObject �ν��Ͻ� ���� �� obj4 ���� ��� ���
		MyObject obj4 = new MyObject(123);
		System.out.println(obj4);

		// .equals : �ؽ��ڵ� ������ ��
		MyObject obj5 = new MyObject(123);
		if(obj4.equals(obj5)) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		// == : ���������� ��
		if(obj4 == obj5) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		/*
		 * ������ ���� �� �Ѵ� �ٸ� ��ü��� �Ͽ�����
		 * ������ ���� �� equals �������̵� �� ���ϰ�ü / �ٸ���ü�� ����
		 * == �� equals �������̵��� �����ϰ� ������������ ���ϰ� obj4�� obj5�� ���� �ٸ� �ν��Ͻ� �ּҰ��� ����Ǿ����Ƿ� false
		 */
		
	}
	
}
