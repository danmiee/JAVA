package com.ruby.java.ch06;

class Armor2 {
	private String name;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int value) {
		height = value;
	}
}
/*
 * public class Armor {}
 * 	public ������ �����ϳ� public ����� error!
 *  1���� package ���� public class�� 1���� �־����
*/
public class ArmorTest_merge {
	public static void main(String[] args) {
		Armor2 suit1 = new Armor2();
		Armor2 suit2 = new Armor2();
		Armor2 suit3 = new Armor2();

/*		System.out.println(suit.height);
 * 		height�� private�̱� ������ �Ұ� / class Armor �������� ��밡��
 */
		
		suit1.setName("mark6");
		suit1.setHeight(180);

		suit2.setName("mark16");
		suit2.setHeight(220);

		suit3.setName("mark38");
		suit3.setHeight(200);

		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}

}
