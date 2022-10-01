package com.ruby.java.ch08.date_220929.training;
/*
 * Ŭ����, �Ӽ�, �޼��� ����
 * ���ֵ��� �ϳ��� �迭�� �����ؼ� �پ��� �޼ҵ带 ȣ���ϴ� ���� ����
 * �Ϲ�Ŭ���� > �߻�Ŭ���� > �������̽�
 */

public class GameDevelopment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unit2 u2list[] = new Unit2[4]; 
		u2list[0] = new Tank2("��",3,"���");
		u2list[1] = new Airplane2(18,"�̻���","�߻��Ѵ�");
		u2list[2] = new Submarine2("���","�Ϻ�","���");
		u2list[3] = new Soldier2(5,"��","���");
		
		for(Unit2 u : u2list) {
			u.show();
		}
	}
}

abstract class Unit2 {
	private String str;
	private String action;

	public String getStr() {
		return str;
	}
	public String getAction() {
		return action;
	}
	public Unit2 (String str, String action) {
		this.str = str;
		this.action = action;
	}
	public abstract void show();
}

// str��(��) num�� action
class Tank2 extends Unit2 {
	private int num;
	
	public Tank2(String str, int num, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.num = num;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %d�� %s\n",super.getStr(),num,super.getAction());
	}
	
}

//time�ÿ� str��(��) action
class Airplane2 extends Unit2 {
	private int time;
	
	public Airplane2(int time, String str, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.time = time;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%d�ÿ� %s��(��) %s\n",time,super.getStr(),super.getAction());
	}
	
}

//str��(��) num�� action
class Submarine2 extends Unit2 {
	private String space;
	
	public Submarine2(String str, String space, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.space = space;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %s�� %s\n",super.getStr(),space,super.getAction());
	}
	
}

//person���� str��(��) action
class Soldier2 extends Unit2 {
	private int person;
	
	public Soldier2(int person, String str, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.person = person;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%d���� %s��(��) %s\n",person,super.getStr(),super.getAction());
	}
	
}