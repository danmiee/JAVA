package com.ruby.java.ch08.date_221005;

public class GalaxyMessenger implements Messenger {
	// �������̽��� �Լ��̸��� �����Ƿ� �Լ��ٵ� ������ Ŭ������ ����

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy���� �޽����� �����մϴ� : " + msg);
	}

	public void changeKeyboard() {
		System.out.println("Ű��������� ��ġ�� Ű���带 �����մϴ�.");
	}
	
}
