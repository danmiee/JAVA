package excercise;

public class ch01_Q03 {

//	�� ���� �ּڰ��� ���ϴ� min4 �޼ҵ�
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min>b)		min = b;
		if(min>c)		min = c;
		if(min>d)		min = d;
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min4(3,8,6,13) = " + min4(3,8,6,13));
	}
}
