package ch06_sorting.date221104;

public class MergeSortStack {

	// recursive�� ����: stack�� �̿��� backtracking ������ �ʹ� ����� > recursive �˰��� ���� �ǽ�
	static Stack<Point> st = new Stack<Point>();

	// --- ���� Ȱ���Ͽ� ��������� ���� ���� ---//
	static void merge(int[] x, int lefta, int righta, int leftb, int rightb) {

		// ������ Ȱ���� ���� ����Ʈ ����
		Point pa = new Point(lefta, righta);
		Point pb = new Point(leftb, rightb);
		System.out.println("pa: " + pa + "  pb: " + pb);

		// �迭��Ұ� 1���� ��(left==right) �������
		if (lefta < righta) {
			System.out.println("pa: " + pa + "  pb: " + pb);

			// ������ ���ÿ� ���
			st.push(pb);
			System.out.print("push st: ");
			st.dump();

			// pa�� ��� ����
			int ac = (lefta + righta) / 2;
			System.out.println("ac: " + ac);

			merge(x, lefta, ac, ac + 1, righta);

			// ����
			for (int i = lefta; i < righta; i++) {
				System.out.println("[������] x[lefta]: " + x[lefta] + "  x[righta]: " + x[righta]);
				if (x[lefta] > x[righta]) {
					int temp = x[lefta];
					x[lefta] = x[righta];
					x[righta] = temp;
				}
				System.out.println("[������] x[lefta]: " + x[lefta] + "  x[righta]: " + x[righta]);
			}
		}

		// �迭��Ұ� 1���̰ų� ������ �Ϸ�Ǹ� pop
		pa = st.pop();
		System.out.println("pa(st.pop): " + pa);
	}

	// --- ��Ʈ�� �޼ҵ� ---//
	static void mergeSort(int[] x, int left, int right) {
		// �迭 �и� ������
		int center = (left + right) / 2;

		// �и��� �迭 ��������
		merge(x, left, center, center + 1, right);
	}

	public static void main(String[] args) {
//		int nx = 20;
//		int[] x = new int[20];
//
//		for (int ix = 0; ix < 20; ix++) {
//			double d = Math.random();
//			x[ix] = (int) (d * 50);
//		}
		int nx = 10;
		int[] x = { 4, 2, 8, 6, 0, 5, 1, 7, 3, 9 };

		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		mergeSort(x, 0, nx - 1); // �迭 x�� ��������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
