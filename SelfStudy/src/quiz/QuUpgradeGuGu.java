package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		/*
		 * n�� �ŵ�����
		 * �ݺ��Ǵ� �� : Xn
		 * ����� : n�� 1�� ���� �� ~ n�� 9�� ���� ��
		 */
		
		for(int i=2; i<10; i++) {
			for(int j=0; j<9; j++) {
				if(j==0) {
					System.out.printf("%d X 1 = %d\n",i,i);
				} else {
					// n�� i�� ���ϴ� �İ� ��� ���
					String data = " X " + i;
					String repeat = data.repeat(j);
					int result = (int) Math.pow(i, j+1);
					System.out.printf("%d%s = %s\n",i,repeat,result);				
				}
			}
		}
	}
}
