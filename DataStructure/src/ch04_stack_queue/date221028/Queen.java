package ch04_stack_queue.date221028;

public class Queen {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {

		int count = 0, mode = 0;
		int ix = 0, iy = 0;

		Stack st = new Stack(10);
		Point p = new Point(ix, iy);

		// ����
		d[ix][iy] = 1; // p(0,0)�� üũ
		count++; // üũ ����
		st.push(p); // üũ��ǥ ���

		int cx = 0;
		cx++; // �ຯ��

		// �� ����ŭ �ݺ�
		while (cx < d.length) {
			// 0��° ������ ����
			int cy = 0;
			// �� ����ŭ �ݺ�
			while (cy < d[0].length) {

				// üũ�� �� ������ Ǫ��, ��ǥ���, üũ���� �߰�, �ݺ��� ������
				if (CheckMove(d, cx, cy)) {
					// ���� üũ�ϴ� ��ǥ
					// push�� ���� ��ġ���� �����ؾ� ����ݿ�
					Point px = new Point(cx, cy);
					st.push(px);
					d[cx][cy] = 1;
					count++;
					cx++;
					break;
					// üũ ���߰� �������� �ƴϸ� cy++
				} else if (NextMove(d, cx, cy)) {
					cy++;
					// ������ ���̸� pop�ϰ� üũ ���� ����
				} else {
					while (true) {
						p = st.pop();
						count--;
						cx = p.getX();
						cy = p.getY();
						d[cx][cy] = 0;
						if (cy != d[0].length - 1) {
							cy++;
							break;
						}
					}
				}
			}
		}
	}

	// üũ�Լ� �����ϱ�
	public static boolean checkRow(int[][] d, int x, int y) {
		for (int i = 0; i < y; i++)
			if (d[x][i] == 1)
				return true;
		return false;
	}

	public static boolean checkCol(int[][] d, int x, int y) {
		for (int i = 0; i < x; i++)
			if (d[i][y] == 1)
				return true;
		return false;
	}

	// x++, y-- or x--, y++ where 0<= x,y <= 7
	public static boolean checkDiagSW(int[][] d, int x, int y) {
		while (x < d.length - 1 && y > 0) {
			x++;
			y--;
			if (d[x][y] == 1)
				return true;
		}
		while (x > 0 && y < d[0].length - 1) {
			x--;
			y++;
			if (d[x][y] == 1)
				return true;
		}
		return false;
	}

	// x++, y++ or x--, y--
	public static boolean checkDiagSE(int[][] d, int x, int y) {
		while (x < d.length - 1 && y < d[0].length - 1) {
			x++;
			y++;
			if (d[x][y] == 1)
				return true;
		}
		while (x > 0 && y > 0) {
			x--;
			y--;
			if (d[x][y] == 1)
				return true;
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
		if (col != d[0].length - 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[row][col];
		
		System.out.println("[�ʱ����]");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				data[i][j] = 0;
				System.out.print(" " + data[i][j]);
			}
		System.out.println();
		}

		SolveQueen(data);

		System.out.println("[SolveQueen ���]");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
