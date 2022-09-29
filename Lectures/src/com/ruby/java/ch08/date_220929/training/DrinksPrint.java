package com.ruby.java.ch08.date_220929.training;

public class DrinksPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻��
//		Juice j = new Juice("������ �꽺", 3500);
//		Coffee c = new Coffee("���̽� �Ƹ޸�ī��", 2000);
//		Beer b = new Beer("�׶�", 3500);
//		Water w = new Water("��ټ�", 2000);
//		Tea t = new Tea("������������", 2000);
//
//		System.out.println(j.toString());
//		System.out.println(c.toString());
//		System.out.println(b.toString());
//		System.out.println(w.toString());
//		System.out.println(t.toString());

		// ������
		Drinks[] d = new Drinks[5];
		d[0] = new Fruits("������","�ֽ�",5000);
		d[1] = new Coffee("���̽� �Ƹ޸�ī��",2000);
		d[2] = new Beer("Ŭ����",4000);
		d[3] = new Water("��ټ�",2000);
		d[4] = new Tea("���۹�Ʈ",4500);
		
		for(Drinks t : d) {
			System.out.println(t.toString());
		}
	}

}

abstract class Drinks extends Object {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract String toString();
	// Object�� �̹� toString�� �ֱ� ������ �̷��� ����ϴ� ���� ��������
}

class Juice extends Drinks {
	public Juice(String name, int price) {
		super(name, price);
	}


	@Override
	public String toString() {
		return getName()+"��(��) ���ʴϴ�. ������ "+getPrice()+"�� �Դϴ�.";	}
}

class Fruits extends Juice {
	private String fname;
	public Fruits(String fname, String name, int price) {
		super(name, price);
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[JUICE]\n"+fname+super.toString();
	}
}

class Coffee extends Drinks {
	public Coffee (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[COFFEE]\n"+getName()+"��(��) ���ʴϴ�. ������ "+getPrice()+"�� �Դϴ�.";	}
}

class Beer extends Drinks {
	public Beer (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[BEER]\n"+getName()+"��(��) ���ʴϴ�. ������ "+getPrice()+"�� �Դϴ�.";	}
}

class Water extends Drinks {
	public Water (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[WATER]\n"+getName()+"��(��) ���ʴϴ�. ������ "+getPrice()+"�� �Դϴ�.";	}
}

class Tea extends Drinks {
	public Tea (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[TEA]\n"+getName()+"��(��) ���ʴϴ�. ������ "+getPrice()+"�� �Դϴ�.";	}
}