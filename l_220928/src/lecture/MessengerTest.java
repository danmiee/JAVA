package lecture;

public class MessengerTest {

	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
//		Messenger m = new Messenger();
		// �������̽��� Ŭ�������� ���·� ȣ���� �� ����.
		Messenger.getConnection();
		/*
		 * ��ü�� ���µ� ������?
		 * getConnection�� Messenger���� public static���� ���ǵǾ���
		 * > static : ��ü���� ȣ�� ����
		 */
//		iphone.
		System.out.println(iphone.getMessage());
		/*
		 * ����� �� �ִ� �޼ҵ尡 ���� ���� �� �ܿ��� ������ �ִ�.
		 * �� ������µ� ��?
		 * �ڹٿ����� �⺻������ Object Ŭ������ �θ�Ŭ������ ����
		 */
	}
}
