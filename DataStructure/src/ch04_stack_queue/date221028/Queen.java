package ch04_stack_queue.date221028;

import java.util.Arrays;

public class Queen {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {

		int count = 0, mode = 0;
		int ix = 0, iy = 0;

		Stack2 st = new Stack2(10);
		Point p = new Point(ix, iy);
		
		// ����
		d[ix][iy] = 1; // p(0,0)�� üũ
		count++; // üũ ����
		st.push(p); // üũ��ǥ ���

		// ��� �� ��ǥ�� üũ�� ������ �ݺ�
		while (count < d.length) {

			ix++; // �ຯ��
			int cy = 0; // 0��° ������ ����

			// ���� üũ�ϴ� ��ǥ
			Point px = new Point(ix, cy);

			// �� ����ŭ �ݺ�
			while (ix < d.length) {

				// �� ����ŭ �ݺ�
				while (cy < d[0].length) {
					// üũ�� �� ������ Ǫ��, ��ǥ���, üũ���� �߰�, �ݺ��� ������
					if (CheckMove(d,ix,cy)) {
						st.push(px);
						count++;
						break;
					} else {
						cy++;
					}
				}
//				// ������ ���� �ƴϸ� ���� ���� �̵�
				if (NextMove(d, ix, cy)) {
					cy++;
					// ������ ���̸� pop�ϰ� üũ ���� ����
				} else {
					p = st.pop();
					count--;
				}
			}

		}
	}

	// üũ�Լ� �����ϱ�
	public static boolean checkRow(int[][] d, int cx, int cy) {
		for (int i = 0; i < cy; i++) {
			if (d[cx][i] == 1) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkCol(int[][] d, int cx, int cy) {
		for (int i = 0; i < cx; i++) {
			if (d[i][cy] == 1) {
				return true;
			}
		}
		return false;
	}

	// x++, y-- or x--, y++ where 0<= x,y <= 7
	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		if (cx != 0 && cy != d[0].length - 1) {
			while (!(cx == 0 || cy == 0)) {
				cx++;
				cy--;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		if (cx != d.length - 1 && cy != 0) {
			while (!(cx == 0 || cy == d[0].length - 1)) {
				cx--;
				cy++;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		return false;
	}

	// x++, y++ or x--, y--
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		if (cx != 0 && cy != 0) {
			while (!(cx == d.length - 1 || cy == d[0].length - 1)) {
				cx++;
				cy++;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		if (cx != d.length - 1 && cy != d[0].length - 1) {
			while (!(cx == 0 || cy == 0)) {
				cx--;
				cy--;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		return false;
	}

	// (x,y)�� �̵� ���������� check
	public static boolean CheckMove(int[][] d, int x, int y) {
		if (checkRow(d, x, y) || checkCol(d, x, y) || checkDiagSW(d, x, y) || checkDiagSE(d, x, y)) {
			return false;
		}
		return true;
	}

	// ���� row�� �̵����� �Ǵ�
	public static boolean NextMove(int[][] d, int row, int col) {
		// ������ ���� �ƴϸ� ���� ���� �̵�
		if (col == d[0].length-1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int row = 4, col = 4;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;
		System.out.println(Arrays.deepToString(data));
		
		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}