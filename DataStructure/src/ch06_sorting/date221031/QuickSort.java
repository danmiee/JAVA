package ch06_sorting.date221031;

import java.util.Arrays;

class Point {
	private int ix;
	private int iy;

	public Point(int x, int y) {
		ix = x;
		iy = y;
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}

	@Override
	public String toString() {
		return "P(" + ix + ", " + iy + ")";
	}
}

public class QuickSort {

	// --- �迭 ��� a[idx1]�� a[idx2]�� ���� ��ȯ ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- �� ����(����� ����)---//
	static void quickSort(int[] a, int left, int right) {

		Stack<Point> st = new Stack<Point>(50);
		Point pt = new Point(left, right);

		/*
		 * a[x]=1�̰� �����ʿ� �ִ� 4,2�� ��� 1���� ũ�� ������ �ڸ� ������ ���� ��� �ذ��ؾ��ұ�?
		 * >> �ѹ���!  flag�� push �ݺ��� �߰�
		 * 
		 * st: P(0, 4) p: P(0, 4) x: 2 a(before): [5, 3, 1, 4, 2, 6, 7, 8, 9, 10]
		 * a(after): [1, 3, 5, 4, 2, 6, 7, 8, 9, 10]
		 */
		
		boolean flag = true;
		
		while (flag) {

			for (int i = 0; i < a.length; i++) {
				for (int j = a.length - 1; j > 0; j--) {
					if (a[j - 1] > a[j]) {
						flag = true;
						break;
					} else
						flag = false;
				}
			}
			
			st.push(pt);
//			System.out.print("st: ");
//			st.dump();

			while (st.isEmpty() != true) {
				Point p = st.pop();
//				System.out.println("p: " + p);

				int px = p.getX();
				int py = p.getY();
				int x = (px + py) / 2;
//				System.out.println("x: " + x);

//				System.out.println("a(before): " + Arrays.toString(a));
				if (px < x) {
					Point pl = new Point(px, x);
					st.push(pl);
				}
				if (x + 1 < py) {
					Point pr = new Point(x + 1, py);
					st.push(pr);
				}

				do {
					while (a[px] < a[x])
						px++;
					while (a[x] < a[py])
						py--;
					if (px <= py)
						swap(a, px++, py--);
				} while (px <= py);

//				System.out.println("a(after): " + Arrays.toString(a));

//				System.out.print("st: ");
//				st.dump();
			}
		}

	}

	public static void main(String[] args) {
		int nx = 10;
		int[] x = new int[10];
		for (int ix = 0; ix < 10; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 20);
		}
//		int[] x = { 5, 7, 1, 4, 6, 2, 3, 9, 8, 10 };
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		quickSort(x, 0, nx - 1); // �迭 x�� ������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
