package com.ruby.java.ch08.date_221005;

public class MessengerTest {

	public static void main(String[] args) {
	
/*(��)	
 * GalaxyMessenger galaxy = new GalaxyMessenger();
 * Messenger test = new Messenger() {};
 *  - �͸�Ŭ������ �ν��Ͻ� ������ ���ÿ� ����
 */
		Messenger test = new Messenger() {
			// �������̽��� ���� Ŭ����(�̸�����)�� ����� ��ü(test)�� �Բ� ����
			
			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				System.out.println("test���� �޽����� �����մϴ� : " +msg);
			}
			
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "test";
				
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
		
	}
}
