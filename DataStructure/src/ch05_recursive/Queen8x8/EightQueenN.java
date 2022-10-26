package ch05_recursive.Queen8x8;

//����5-10
//���� ������ ����������� Ǯ��(��ġ ��Ȳ�� ��� ������ ���)

class EightQueenN {

	static int[] pos = new int[8];					// ������ ���� ��ġ
	static boolean[] flag_a = new boolean[8];		// ���࿡ ���� ��ġ�ߴ��� üũ
	static boolean[] flag_b = new boolean[15];		// /�밢���� ���� ��ġ�ߴ��� üũ
	static boolean[] flag_c = new boolean[15];		// ���밢���� ���� ��ġ�ߴ��� üũ
	static int cnt = 0;

	//--- ��ġ ��Ȳ(������ ���� ��ġ)�� ��� ---//
//	static void print() {
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++)
//				System.out.printf("%s", j == pos[i] ? "��" : "��");
//			System.out.println();
//		}
//		System.out.println();
//	}
	
    //�� ���� ���� ��ġ�� ���
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

	//--- i���� �˸��� ��ġ�� ���� ��ġ ---//
	static void set(int i) {
		int j;
		int[] jstk = new int[8];

		// while �ݺ����� Start��� �̸��� ����
		Start : while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						// ��� ���� ��ġ����
						if (i == 7) {
							print();
							cnt++;
						}
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							// i���� ���� Push
							jstk[i++] = j;
							// Start �ݺ����� ��� ����
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				// i���� ���� Pop
				j = jstk[i];
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		set(0);
		System.out.println(cnt);
	}
}

