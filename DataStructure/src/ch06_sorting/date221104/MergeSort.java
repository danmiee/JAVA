package ch06_sorting.date221104;

public class MergeSort {

	// recursive�� ����: stack�� �̿��� backtracking ������ �ʹ� ����� > recursive �˰��� ���� �ǽ�
	static Stack<Point> st = new Stack<Point>();
	// --- ���� Ȱ���Ͽ� ��������� ���� ���� ---//
	static void merge(int[] a, int left, int right) {

		if (left < right) {
			int center = (left + right) / 2;
			Point pl = new Point(left, center);
			Point pr = new Point(center+1, right);

			// pl, pr�� ���Ͽ� ��� ����
			merge(a, pl.getX(), pl.getY());
			merge(a, pr.getX(), pr.getY());
			
			// �迭��� 2�� �̻��̸� pr ���ÿ� ���
			if(a.length>1)
				st.push(pr);
			else {
				
			}

		}
	}

	// --- ���� ���� ---//
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
