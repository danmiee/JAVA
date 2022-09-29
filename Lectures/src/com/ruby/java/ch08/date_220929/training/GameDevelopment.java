package com.ruby.java.ch08.date_220929.training;
/*
 * Ŭ����, �Ӽ�, �޼��� ����
 * ���ֵ��� �ϳ��� �迭�� �����ؼ� �پ��� �޼ҵ带 ȣ���ϴ� ���� ����
 * �Ϲ�Ŭ���� > �߻�Ŭ���� > �������̽�
 */

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻��
//		Tank t = new Tank("��","���");				t.show();
//		Airplane a = new Airplane("�̻���","�߻��Ѵ�");	a.show();
//		Submarine sm = new Submarine("���","���");	sm.show();
//		Soldier sd = new Soldier("��","���");		sd.show();
		
		// ������-�迭
		Unit u [] = new Unit[4];	// �迭����
		u[0] = new Tank("��","���");	// �Ű����� �����Ͽ� �迭��� ����
		u[1] = new Airplane("�̻���","�߻��Ѵ�");
		u[2] = new Submarine("���","���");
		u[3] = new Soldier("��","���");

		for(Unit t : u) {
			t.show();
		}
		// �̰� ����........
		
	}
}

class Unit {
	// ������ ����
	public Unit(String o, String a) {
		this.object = o;
		this.action = a;
	}
	private String action;
	private String object;
	// ��¹�
	public void show() {
		System.out.println(object+"��(��) "+action);
	}
}
// ���� ���
class Tank extends Unit {
	public Tank(String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
}
// �̻����� �߻��Ѵ�
class Airplane extends Unit {
	public Airplane(String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}
// ��ڸ� ���
class Submarine extends Unit {
	public Submarine (String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}
// ���� ���
class Soldier extends Unit {
	public Soldier (String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}