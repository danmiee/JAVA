package com.ruby.java.ch08.date_220929.training_interfaces;
/*
 * Ŭ����, �Ӽ�, �޼��� ����
 * ���ֵ��� �ϳ��� �迭�� �����ؼ� �پ��� �޼ҵ带 ȣ���ϴ� ���� ����
 * �Ϲ�Ŭ���� > �߻�Ŭ���� > �������̽�
 */

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank2 t = new Tank2();
		Airplane2 a = new Airplane2();
		Submarine2 sm = new Submarine2();
		Soldier2 sd = new Soldier2();
		
		System.out.println(t.getGame());
		t.setGame("��","���");
		t.setnum(6);
		System.out.println(a.getGame());
		a.setGame("�̻���","�߻��Ѵ�");
		a.settime(18);
		System.out.println(sm.getGame());
		sm.setGame("���","�߻��Ѵ�");
		sm.setspace("�Ϻ�");
		System.out.println(sd.getGame());
		sd.setGame("��","���");
		sd.setperson(50);

	}
}

// str��(��) num�� action
class Tank2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[��ũ]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %s\n", str, action);
	}
	
	public void setnum(int num) {
		System.out.println("Ƚ��: " + num);
	}
}

//time�ÿ� str��(��) action
class Airplane2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[������]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %s\n", str, action);
	}
	
	public void settime(int time) {
		System.out.println("�ð�: " + time + "��");
	}
}

//str��(��) space�� action
class Submarine2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[������]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %s\n", str, action);
	}
	
	public void setspace(String space) {
		System.out.println("�������: " + space);
	}
}

//person���� str��(��) action
class Soldier2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[����]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s��(��) %s\n", str, action);
	}
	
	public void setperson(int person) {
		System.out.println("�����ο�: " + person);
	}

}