package com.ruby.java.ch07.date_221005;

public class GalaxyMessenger implements WorkFile, Messenger {

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
	
	@Override
	public void fileUpload() {
		// TODO Auto-generated method stub
		System.out.println("file�� ���ε��մϴ�.");
	}

	@Override
	public void fileDownload() {
		// TODO Auto-generated method stub
		System.out.println("file�� �ٿ�ε��մϴ�.");
	}
	
}
