package com.ruby.java.ch08.date_220928;

public class GalaxyMessenger implements Messenger {

	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� �����մϴ� : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("Ű��������� ��ġ�� Ű���带 �����մϴ�.");
	}
}
