package com.ruby.java.ch06;

public class ArmorTest2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Armor suit = new Armor();
		suit = null;
		/*
		 * suit : Stack
		 * ����Ű�� �� : Heep
		 * ���� ������ �ݳ� : Garbage Collection
		 * ��C������ delete[] �ؾ������� Java������ JVM�� �˾Ƽ� ó����
		 * -p.229
		 */
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
		
	}

}
