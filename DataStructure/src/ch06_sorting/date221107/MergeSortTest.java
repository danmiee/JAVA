package ch06_sorting.date221107;

public class MergeSortTest {
	// --- �迭 ��� a[idx1]�� a[idx2]�� ���� ��ȯ ---//
	static void merge(int[] a, int lefta, int righta, int leftb, int rightb ) {

	}

	// --- �� ����(����� ����)---//
	static void MergeSort(int[] a, int left, int right) {
	
	}

	public static void main(String[] args) {
		int nx = 20;
		int[] x = new int[20];
		for (int ix = 0; ix < 20; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 50);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		MergeSort(x, 0, nx - 1); // �迭 x�� ������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
