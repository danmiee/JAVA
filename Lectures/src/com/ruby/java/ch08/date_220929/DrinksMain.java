package com.ruby.java.ch08.date_220929;

import java.util.ArrayList;
import java.util.List;

public class DrinksMain {

	public static void main(String[] args) {

		// �⺻��
		{
			Juice j = new Juice("������ �꽺", 3500);			j.drink();
			Coffee c = new Coffee("���̽� �Ƹ޸�ī��", 2000);	c.drink();
			Beer b = new Beer("�׶�", 3500);					b.drink();
			Water w = new Water("��ټ�", 2000);				w.drink();
			Tea t = new Tea("������������", 2000);				t.drink();
		}
		// �� {}�� �������� ����, �ҽ����� �������� ������������ ���
		System.out.println("=================================================");

		// ������
		{
			// �θ�Ŭ������ �迭 ����
			Drinks[] d = new Drinks[5];
			
			// up casting : �θ�Ŭ���� �迭 ���� �ڽ�Ŭ���� ����ֱ�
				/*
				 * �θ�Ŭ������ ����(�Ϲ�, �߻�, �������̽�)�� �������.
				 * ��, Spring������ �������̽��� ���� ���� ���
				 */
			d[0] = new Juice("������ �꽺", 3500);
			d[1] = new Coffee("���̽� �Ƹ޸�ī��", 2000);
			d[2] = new Beer("�׶�", 3500);
			d[3] = new Water("��ټ�", 2000);
			d[4] = new Tea("������������", 2000);

			// for ( �ް����ϴ� ������ Ÿ�� ���� : �迭 )
			for (Drinks t : d) {
				t.drink();
			}
		}

		System.out.println("=================================================");

		// Collection (ArrayList)

		{
			List<Drinks> list = new ArrayList<>();
			
			list.add(new Juice("������ �꽺", 3500));
			list.add(new Coffee("���̽� �Ƹ޸�ī��", 2000));
			list.add(new Beer("�׶�", 3500));
			list.add(new Water("��ټ�", 2000));
			list.add(new Tea("������������", 2000));

			for (Drinks t : list) {
				t.drink();
			}
		}
	}
}

class Drinks {

	private String name;
	private int price;
	public Drinks() {
		name = "";
		price = 0;
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void drink() {
		System.out.printf("%s�� ���ʴϴ�. ������ %d�� �Դϴ�.", name, price);
	}
}

class Juice extends Drinks {

	public Juice(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[JUICE]");
		super.drink();
		System.out.println();
	}

}

class Coffee extends Drinks {

	public Coffee(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[COFFEE]");
		super.drink();
		System.out.println();
	}
}

class Beer extends Drinks {

	public Beer(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[BEER]");
		super.drink();
		System.out.println();
	}
}

class Water extends Drinks {

	public Water(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[WATER]");
		super.drink();
		System.out.println();
	}
}

class Tea extends Drinks {

	public Tea(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[TEA]");
		super.drink();
		System.out.println();
	}
}
