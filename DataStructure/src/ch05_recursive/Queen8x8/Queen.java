package ch05_recursive.Queen8x8;

public class Queen {
    //���� ��� pos �迭�� [7,7,7,7,7,7,7,7]�̸� ��� ���� ���� 7�࿡ ��ġ�Ǿ� �ִ� ��.
    static boolean[] flag_a = new boolean[8]; //�� �࿡ ���� ��ġ�ߴ��� üũ
    static boolean[] flag_b = new boolean[15]; // / �밢�� �������� ���� ��ġ�ߴ��� üũ
    static boolean[] flag_c = new boolean[15]; // \ �밢�� �������� ���� ��ġ�ߴ��� üũ
    static int[] pos = new int[8]; //�� ���� ���� ��ġ
    static int cnt = 0;

    //�� ���� ���� ��ġ�� ���
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

    //i���� ���� ��ġ
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            // / ���� �밢���� üũ�ϴ� �迭�� �ε����� i + j
            // \ ���� �밢���� üũ�ϴ� �迭�� �ε����� i - j + 7
            if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) { //j �࿡ ��ġ�� ���� ���ٸ�,
            	//���� j�࿡ ��ġ
            	pos[i] = j;
            	//��� ���� ��ġ �Ϸ�
                if (i == 7) {
                	cnt++;
                    print();
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7]= true;
                    //���� ���� ���� ��ġ
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7]= false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
        System.out.println(cnt);
    }
}
