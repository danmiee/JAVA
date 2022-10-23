/* ���� �ذ��� �ڹ� �ڵ� �ǽ��� �ʿ�
	- �Լ� ȣ��� ���� �Ʒ�
	  void SolveQueen(int [][]d) {
	     //�ڵ� �ϼ��ϱ� 
	  }
	=> 8  Queen ���� Ǯ��: ���� ����Ͽ� backtracking �ڵ� �ǽ�
	  -> 2���� �迭�� 0���� �ʱ�ȭ, Queen�� ��ġ�ϸ� 1�� ����, 8 X 8 �迭�� 8�� ���� ���� ���� �밢���� �浹�� ������ ����
	
	  -> stack�� Point ��ü�� �����Ͽ� push, pop::(x, y, move) => move�� ���� �̵� ���� candidate�� column��
	      class MyStack {
		int top;
		Point [] data
		void Push(Point p);
		Point Pop();
	       }
	       void NextMove(int[] move, int row); // current row�� ���� ���� ��ġ ������ ��� column�� �����ϰ� move[]�� 1�� ����
	       boolean CheckMove(int currentRow, int row, int col) //currentRow�� ���Ͽ� queen�� (x,y)�� ��ġ �����ϸ� true
//	      => backtracking�� stack�� �̿��Ͽ� push/pop���� �ذ��ϴ� ���� ���̴� ����
	
 */
package ch04_stack_queue.Queen;

import ch04_stack_queue.Queen.Stack2.EmptyIntStackException;

public class Backtracking {

	public static void SolveQueen(int[][] d) {

		// �ʵ� ���� �� �ʱ�ȭ
		int count = 0; // Ȯ���� �� �ε���
		int ix = 0, iy = 0; // �迭��� �ʱ�ȭ
		Stack2 st = new Stack2(10); // �� 10ĭ????
		Point p = new Point(ix, iy); // ��ǥ����

		// 0�� 0���� üũ
		d[ix][iy] = 1;

		// ���ÿ� ��ǥ ���
		try {
			st.push(p);
		} catch (EmptyIntStackException e) {

		}
		count++;

		// 8�� ���� �ݺ�
		while (count < 8) {
			int cx = p.getX(); // üũ�� ��ǥ x��
			int cy = p.getY(); // üũ�� ��ǥ y��
			Point px = new Point(cx, cy); // üũ�� ��ǥ��

			int inum = st.size(); // ���ÿ� ���� ��ϵ� ��ǥ ����

			while (cx < d.length) {
				while (cy < d[0].length) {
					if (checkRow(d, cx) && checkCol(d, cy) && checkDiagSW(d, cx, cy) && checkDiagSE(d, cx, cy)) {
						d[cx][cy] = 1;
						try {
							st.push(px);
						} catch (EmptyIntStackException e) {

						}
						break;
					}
					cy++;
				}
				if (st.size() == inum) {
					try {
						st.pop();
					} catch (EmptyIntStackException e) {

					}
					iy++;
					break;
				}
				cx++;
				count++;
			}
		}
	}

//	  -> ����, ����, �밢���� ���� �浹 üũ �Լ� �ڵ�
//	   boolean CheckMove(x,y) {
	static int ix, iy, cx, cy;
	static Point p = new Point(ix, iy);
	static Point cp = new Point(cx, cy);

//		checkRow(x);
	// d�� ���� �� �ƴϸ� true
	public static boolean checkRow(int[][] d, int cx) {
		while (ix < 8) {
			if (iy < 8)
				if (d[ix][iy] == 1)
					if (ix == cx)
						return false;
			iy++;
			ix++;
		}
		return true;
	}

//		checkCol(y);
	// d�� ���� �� �ƴϸ� true
	public static boolean checkCol(int[][] d, int cy) {
		while (ix < 8) {
			if (iy < 8)
				if (d[ix][iy] == 1)
					if (iy == cy)
						return false;
			iy++;
			ix++;
		}
		return true;
	}

//		checkDiagSE(x,y); //x++, y++ or x--, y--
	// d�� �밢��(����)���� ���� �ƴϸ� true
	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);
		while (true) {
			// x++ y++
			while (ix > 0) {
				if (iy > 0) {
					ix++;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x-- y--
			while (ix < 8) {
				if (iy < 8) {
					ix--;
					iy--;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			return true;
		}
	}

//		checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
	// d�� �밢��(����)���� ���� �ƴϸ� true
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);
		while (true) {
			// x-- y++
			while (ix > 0) {
				if (iy < 8) {
					ix--;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x++ y--
			while (ix < 8) {
				if (iy > 0) {
					ix++;
					iy--;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			return true;
		}
	}

//	- main()�� �ۼ� ��� �Ʒ� - 
	public static void main(String[] args) {
		int row = 8, col = 8;
//		int [][]data;
//		�迭 �ʱ�ȭ
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

//		SolveQueen(data);
//		�迭�� ���: 8���� queen ��ġ(�������� �ظ� ���� �����ֱ�)
		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
