package ch04_stack_queue.date221104;

public class Queen_BuiltInMethod {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack st = new Stack(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1; // �� ��ġ
		count++; // �� ��ġ�� point ��
		st.push(p);

		// count�� 8�� �ɶ����� �ݺ�
		while (count < 8) {
			ix++; // �ຯ��
			int cy = 0; // �ຯ�� �� �׻� 0��° ������ üũ �ʿ�

			// �� �ݺ��ϸ� �� ��ġ���ɿ��� �Ǵ�
			while (ix < d.length) {
				cy = NextMove(d, ix, cy); // ��ġ����: �� �ε���, ��ġ�Ұ�: d[0].length ��ȯ
				// �� ��ġ������ ���� �ݺ�?
				while (cy < d[0].length) { // else���� cy++ ������ �ʿ�
					Point px = new Point(ix, cy);
					st.push(px);
					count++;
					d[ix][cy] = 1;
					break;
				}
				if (cy != d[0].length) {
					break;
				} else {
					p = st.pop();
					ix = p.getX();
					cy = p.getY();
					count--;
					d[ix][cy] = 0;
					cy++;
				}
			}
		}
	}

	public static boolean checkRow(int[][] d, int cx, int cy) {
		for (int i = 0; i < cy; i++)
			if (d[cx][i] == 1)
				return false;
		return true;
	}

	public static boolean checkCol(int[][] d, int cx, int cy) {
		for (int i = 0; i < cx; i++) {
			if (d[i][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int x = cx, y = cy;
		while (x < d.length - 1 && y > 0) {
			x++;
			y--;
			if (d[x][y] == 1)
				return false;
		}
		x = cx;
		y = cy;
		while (x > 0 && y < d[0].length - 1) {
			x--;
			y++;
			if (d[x][y] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		int x = cx, y = cy;
		while (x < d.length - 1 && y < d[0].length - 1) {
			x++;
			y++;
			if (d[x][y] == 1)
				return false;
		}
		x = cx;
		y = cy;
		while (x > 0 && y > 0) {
			x--;
			y--;
			if (d[x][y] == 1)
				return false;
		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)�� �̵� ���������� check
		if (checkRow(d, x, y) && checkCol(d, x, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y)) {
			return true;
		}
		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// ���� row�� ���Ͽ� �̵��� col�� ����
		int nextCol = col; // ���� col�� �Ѿ�� ���� ����
		while (nextCol < d[0].length) // �ε��� ����ŭ �ݺ�
			if (CheckMove(d, row, nextCol)) // ���� �� üũ���ɿ��� �Ǵ�
				return nextCol; // üũ�� �� ������ col ��ȯ
			else
				nextCol++;
		return d[0].length; // üũ�� �� �ִ� �� ������ -1 ��ȯ
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
