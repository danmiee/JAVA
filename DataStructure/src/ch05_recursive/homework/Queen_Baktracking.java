//package ch05_recursive.homework;
//
//public class Queen_Baktracking {
//	public static void SolveQueen(int[][] d) {
//		int count = 0;
//		int ix = 0, iy = 0;
//		Queen_Stack st = new Queen_Stack(10);
//		Point p = new Point(ix, iy);
//		d[ix][iy] = 1;
//		st.push(p);
//
//		while (count < 8) {
//			// p = st.pop();
//			// int cx = p.getX(); int cy = p.getY();
//			// count--;
////			while (cx < d.length)
////			{
////				while (cy < d[0].length) {
//////					if (checkRow(d, cx) && checkCol(d, cy) && checkDiagSW(d, cx,cy) && checkDiagSE(d, cx,cy)) {
//////						Point px = new Point(cx,cy);
//////						st.push(px); count++;
//////						break;
//////					}
////					cy++;
////				}
////				cx++;
////				System.out.println("cx = "+ cx);
////				count++;
////			}
//			// System.out.println("cx = "+cx + "cy = "+cy);
//			count++;
//
//		}
//	}
//
//	public static boolean checkRow(int[][] d, int cx) {
//		return true;
//	}
//
//	public static boolean checkCol(int[][] d, int cy) {
//		return true;
//	}
//
//	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
//		return true;
//	}
//
//	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
//		return true;
//	}
//
//	public static void main(String[] args) {
//		int row = 8, col = 8;
//		int[][] data = new int[8][8];
//		for (int i = 0; i < data.length; i++)
//			for (int j = 0; j < data[0].length; j++)
//				data[i][j] = 0;
//
//		SolveQueen(data);
//
//		for (int i = 0; i < data.length; i++) {
//			for (int j = 0; j < data[0].length; j++) {
//				System.out.print(" " + data[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}
//
////* ���� �ذ��� �ڹ� �ڵ� �ǽ��� �ʿ�
////- main()�� �ۼ� ��� �Ʒ� - 
////main() {
////	int [][]data;
////	�迭 �ʱ�ȭ
////	SolveQueen(data);
////	�迭�� ���: 8���� queen ��ġ(�������� �ظ� ���� �����ֱ�)
////}
////- �Լ� ȣ��� ���� �Ʒ�
////  void SolveQueen(int [][]d) {
////     //�ڵ� �ϼ��ϱ� 
////  }
////=> 8  Queen ���� Ǯ��: ���� ����Ͽ� backtracking �ڵ� �ǽ�
////  -> 2���� �迭�� 0���� �ʱ�ȭ, Queen�� ��ġ�ϸ� 1�� ����, 8 X 8 �迭�� 8�� ���� ���� ���� �밢���� �浹�� ������ ����
////
////  -> stack�� Point ��ü�� �����Ͽ� push, pop::(x, y, move) => move�� ���� �̵� ���� candidate�� column��
////      class MyStack {
////	int top;
////	Point [] data
////	void Push(Point p);
////	Point Pop();
////       }
////       void NextMove(int[] move, int row); // current row�� ���� ���� ��ġ ������ ��� column�� �����ϰ� move[]�� 1�� ����
////       boolean CheckMove(int currentRow, int row, int col) //currentRow�� ���Ͽ� queen�� (x,y)�� ��ġ �����ϸ� true
////
////      => backtracking�� stack�� �̿��Ͽ� push/pop���� �ذ��ϴ� ���� ���̴� ����
////
////  -> ����, ����, �밢���� ���� �浹 üũ �Լ� �ڵ�
////   boolean CheckMove(x,y) {
////	checkRow(x);
////	checkCol(y);
////	checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
////	checkDiagSE(x,y); //x++, y++ or x--, y--
////   }
