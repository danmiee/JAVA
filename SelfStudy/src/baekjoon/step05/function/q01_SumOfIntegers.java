package baekjoon.step05.function;

//		Java: long sum(int[] a); (Ŭ���� �̸�: Test)
//		a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
//		���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��

public class q01_SumOfIntegers {
	
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

/* ����! �޼ҵ� ���� �Լ��� �����ؾ��� */
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		long sum = 0;
//		
//		for(int i=0; i<n; i++) {
//			a[i] = (int) Math.floor(Math.random()*1000000);
//			sum = sum + a[i];
//		}
//		System.out.println(sum);
//	}