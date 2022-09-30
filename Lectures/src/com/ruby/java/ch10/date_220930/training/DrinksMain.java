package com.ruby.java.ch10.date_220930.training;

import java.util.ArrayList;
import java.util.List;

public class DrinksMain {

	public static void main(String[] args) {

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
