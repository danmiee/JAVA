package com.ruby.java.ch10.date_220930.training;

import java.util.ArrayList;
import java.util.List;

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Unit> list = new ArrayList<>();

		list.add(new Tank("��", "���"));
		list.add(new Airplane("�̻���", "�߻��Ѵ�"));
		list.add(new Submarine("���", "���"));
		list.add(new Soldier("��", "���"));

		for (Unit t : list) {
			t.show();
		}
		/*
		 * �迭 �ݺ��� �����! ������
		 * for (Ŭ����:�迭�̸�) { ���๮ };
		 */
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
		System.out.println(object + "��(��) " + action);
	}
}

// ���� ���
class Tank extends Unit {
	public Tank(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}
}

// �̻����� �߻��Ѵ�
class Airplane extends Unit {
	public Airplane(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}

// ��ڸ� ���
class Submarine extends Unit {
	public Submarine(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}

// ���� ���
class Soldier extends Unit {
	public Soldier(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}