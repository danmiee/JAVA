package excercise;

public class ch01_Q01 {

/*
 * 	�� ���� �ִ��� ���ϴ� max4 �޼��� �ۼ�
 * 	�ۼ��� �޼��带 �׽�Ʈ�ϱ� ���� main �޼��� ������ ���α׷�
 */
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(max<b)		max=b;
		if(max<c)		max=c;
		if(max<d)		max=d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max4(3,5,1,6) = " + max4(3,5,1,6));
		
	}
}
