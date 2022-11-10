package ch06_sorting.date221109;

public class Test_HeapSort {

	// --- �迭 ��� a[idx1]�� a[idx2]�� ���� ��ȯ ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void makeHeap(int[] bx, int position, int value) {

		bx[position] = value;
		
		// ����
		for (int i = position; i > 0; i /= 2) {
			// ��Ʈ���� ���� �ݺ��� �ߴ�
			if (i == 1)
				break;
			// value�� �θ𺸴� ������ �ݺ��� �ߴ�
			else if (bx[i] < bx[i / 2]) {
				break;
			}
			// �ݺ��� �ߴܵ��� �ʾ����� �ڸ� �ٲٱ�
			swap(bx, i, i / 2);
		}
	}

	 static void useHeap(int []bx, int cnt) {
		 for(int i=0; i<cnt-1; i++) {
			 bx[i] = bx[i+1];
		 }
	 }

	// --- �� ���� ---//
	static void heapSort(int[] a, int n) {
		int[] b = new int[n+1];
		for (int ix = 0; ix < a.length; ix++) {
			makeHeap(b, ix + 1, a[ix]);
		}
		useHeap(b, n+1);
		for (int i=0; i<n; i++)
			a[i]=b[i];
	}

	public static void main(String[] args) {

		// �迭 x ũ�� ����
		final int count = 10;
		int[] x = new int[count];

		// x ��Ұ� �����ο�
		for (int i = 0; i < count; i++) {
			x[i] = (int) (Math.random() * 30);
		}

		// ������ x ���
		System.out.println("������:");
		for (int i = 0; i < count; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		// �迭 x�� ������
		heapSort(x, count);

		// ������ x ���
		System.out.println("������: ");
		for (int i = 0; i < count; i++)
			System.out.print(" " + x[i]);
		System.out.println();
	}
}
