package com.ruby.java.ch07.date_221005;

public class IPhoneMessenger extends GraphicIOS implements Messenger {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iPhone���� �޽����� �����մϴ� : "+msg);
	}
	
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� ����ϴ�.");
	}

}
