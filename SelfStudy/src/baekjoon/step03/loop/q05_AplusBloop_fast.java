package baekjoon.step03.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q05_AplusBloop_fast {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Scanner�� ������ BufferedReader (import �ʿ�)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// syso�� ������ Bufferedwriter (import �ʿ�)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		// BufferedReader ����ϴ� readLine()
			/* readLine ���ǻ���
			 * 1. ���ϰ� : String / �ٸ� Ÿ�� �Է� �ʿ�� ����ȯ �ʼ�
			 * 		- Integer.parseInt() : int������ ����ȯ
			 * 2. ����ó�� �ʿ�(mainŬ���� ���� throws IOException ���� & import)
			 */
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
		
			// Read�� �����ʹ� Line������ ������ > ������� �ʿ� �� ���� �۾� �ʿ�
				/* ��������� ������ 2���� ���
				 * 1. StringTokenizer�� nextToken() �Լ� ���
				 * 2. String.split()�Լ� Ȱ���Ͽ� �迭�� ��������� ��� ������ �ְ� ���
				 */
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
	}

}
