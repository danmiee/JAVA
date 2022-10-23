package ch04_stack_queue.Queen;

import java.util.Arrays;
import ch04_stack_queue.date221019.Stack;

public class Queen {

	static int num = 8;
	// �� ���� �� ��ġ
	static int[] colpos = new int[num];
	// �� ���� �� ��ġ���� üũ
	static boolean[] checkRow = new boolean[num];
	// SW�밢�� �� ��ġ���� üũ
	static boolean[] checkSW = new boolean[num * 2 - 1];
	// SE�밢�� �� ��ġ���� üũ
	static boolean[] checkSE = new boolean[num * 2 - 1];
	// colpos ���� ����
	static int cnt = 0;

	// i���� �˸��� ��ġ�� �� ��ġ�ϱ�
	static void set(int i) {
		// j�࿡ ���Ͽ� �ݺ�
		Start: while (true) {
			int j = 0;
			// backtracking ���� j����
			Stack<Integer> jstk = new Stack<>();
			// üũ���� ��� false�� ��ġ
			while (j < num) {
				// SW, SE �ε����� 4*4 ���ÿ��� ���� ����
				// ��,SW,SE ��� ���� ������
				if (!checkRow[j] && !checkSW[i + j] && !checkSE[i - j + (num - 1)]) {
					// i���� �� ��ġ�� j
					colpos[i] = j;
					// ��� ���� ��ġ�� �Ϸ�Ǹ� colpos ����ϰ� �ݺ��� ����
					if (i == 7) {
						Arrays.toString(colpos);
						cnt++;
					}
					// 
					else {
						// üũ�Ϸ� �� true�� ǥ��
						checkRow[j] = checkSW[i + j] = checkSE[i - j + (num - 1)] = true;
						// ���ÿ� ����ϰ� �������� �Ѿ��
						jstk.push(j);
						i++;
						// �Ϸ� ������ j = 0���� �ٽ� �ݺ� > �ݺ��� ��ø �ʿ� & �ݺ���ġ ���� ���� �̸��ο�
						continue Start;
					}
				}
				// üũ���� �� true ������ �Ѿ��
				j++;
			}
			// 0������ Ȯ�� �� ����
			if (--i == -1)
				return;
			// 
			j++;
		}
	}

	public static void main(String[] args) {
		set(0);
		System.out.println(cnt);
	}
}
