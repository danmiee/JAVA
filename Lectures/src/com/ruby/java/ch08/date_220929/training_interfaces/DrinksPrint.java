package com.ruby.java.ch08.date_220929.training_interfaces;

class Juice implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[JUICE]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���ʴϴ�. ������ "+price+"�� �Դϴ�.");
	}

}

class Coffee implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[COFFEE]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���ʴϴ�. ������ "+price+"�� �Դϴ�.");
	}

}

class Beer implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[BEER]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���ʴϴ�. ������ "+price+"�� �Դϴ�.");
	}

}

class Water implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[WATER]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���ʴϴ�. ������ "+price+"�� �Դϴ�.");
	}

}

class Tea implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[TEA]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ���ʴϴ�. ������ "+price+"�� �Դϴ�.");
	}

}

public class DrinksPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		System.out.println(j.getMenu());
		j.setMenu("�������꽺", 5000);
		System.out.println(c.getMenu());
		c.setMenu("���̽� �Ƹ޸�ī��", 2000);
		System.out.println(b.getMenu());
		c.setMenu("���ڶ�", 5000);
		System.out.println(w.getMenu());
		c.setMenu("�����", 2000);
		System.out.println(t.getMenu());
		c.setMenu("ĳ����", 4800);
		
	}

}
