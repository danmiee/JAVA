package com.ruby.java.ch08.date_220929.training;
/*
 * Ŭ����, �Ӽ�, �޼��� ����
 * ���ֵ��� �ϳ��� �迭�� �����ؼ� �پ��� �޼ҵ带 ȣ���ϴ� ���� ����
 * �Ϲ�Ŭ���� > �߻�Ŭ���� > �������̽�
 */

public class GameDevelopment2_ing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
}

abstract class Unit2 {

	public Unit2 (String str, String action) {
		this.str = str;
		this.action = action;
	}
	
	private String str;
	private String action;
	
	
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public abstract void show();
}

// ���� ���
class Tank2 extends Unit2 {

	public Tank2(String str, String action) {
		super(str, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("��ũ��" + getStr()+"��(��)"+getAction());
	}
	
}