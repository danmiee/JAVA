package excercise;

public class ch01_Q02 {

//	�� ���� �ּڰ��� ���ϴ� min3 �޼ҵ�
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(min>b)		min = b;
		if(min>c)		min = c;
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(3,8,6) = " + min3(3,8,6));
	}
}
