package lecture;

public interface Messenger {
// �� abstract class �ƴϰ� interface?
	/*
	 * ���߻��(�ڽ�Ŭ������ �������� �θ�Ŭ������ ���� ��)
	 * 	- abstract class : ���߻�� �Ұ�
	 * 	- interface : ���߻�� ����
	 * 
	 * �� �ʿ��Ѱ�?	�ʿ��� ��찡 ����
	 */
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	// final : �����

	public abstract String getMessage();

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("�α��� ó���մϴ�.");
		} else {
			System.out.println("�α׾ƿ� ó���մϴ�");
		}
	}

	public static void getConnection() {
		System.out.println("network�� �����մϴ�.");
	}

	private void log() {
		System.out.println("start job!");
	}
}
