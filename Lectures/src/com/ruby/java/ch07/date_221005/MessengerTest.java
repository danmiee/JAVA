package com.ruby.java.ch07.date_221005;

public class MessengerTest {

	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println(("�޽��� �ּ� ���� ũ��" + Messenger.MIN_SIZE));
		System.out.println(("�޽��� �ִ� ���� ũ��" + Messenger.MAX_SIZE));
		
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("Hello IPhone");
		iphone.clearMessage();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("Hello Galaxy");
		galaxy.changeKeyboard();
		
		galaxy.fileDownload();
		galaxy.fileUpload();
		
		iphone.draw_textBox();
		iphone.draw_submitButton();
		
	}
}
