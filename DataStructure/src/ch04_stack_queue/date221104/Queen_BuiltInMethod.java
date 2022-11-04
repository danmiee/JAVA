package ch04_stack_queue.date221104;

public class Queen_BuiltInMethod {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack st = new Stack(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);
		while (count < 8) {
			ix++;
			int cy = 0;

			while (cy < d[0].length) {
				Point px = new Point(ix, cy);
				st.push(px);
				count++;
				break;
			}

			if (cy != d[0].length) {
				break;
			} else {
				p = st.pop();
				count--;
			}
		}
	}

	public static boolean checkRow(int[][] d, int crow) {
		for (int i = 0; i < d[0].length; i++)
			if (d[crow][i] == 1)
				return false;
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for (int i = 0; i < d.length; i++)
			if (d[i][ccol] == 1)
				return false;
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		while (cx < d.length - 1 && cy > 0) {
			cx++;
			cy--;
			if (d[cx][cy] == 1)
				return false;
		}
		while (cx > 0 && cy < d[0].length - 1) {
			cx--;
			cy++;
			if (d[cx][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		while (cx < d.length - 1 && cy < d[0].length - 1) {
			cx++;
			cy++;
			if (d[cx][cy] == 1)
				return false;
		}
		while (cx > 0 && cy > 0) {
			cx--;
			cy--;
			if (d[cx][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)�� �̵� ���������� check
		if (checkRow(d, x) || checkCol(d, y) || checkDiagSW(d, x, y) || checkDiagSE(d, x, y)) {
			return false;
		}
		return true;
	}

	public static int NextMove(int[][] d, int row, int col) {// ���� row�� ���Ͽ� �̵��� col�� ����
		int nextCol = col + 1; // ���� col�� �Ѿ�� ���� ����
		while (nextCol <= d[0].length) 		// �ε��� ����ŭ �ݺ�
			if (CheckMove(d, row, col))		// ���� �� üũ���ɿ��� �Ǵ�
				return col;					// üũ�� �� ������ col ��ȯ
		return -1;							// üũ�� �� �ִ� �� ������ -1 ��ȯ
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
