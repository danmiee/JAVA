package com.ruby.java_04_array;

public class CloudStudying {
/*
 * Ŭ���� ���͵� ����Ʈ ������ �� �迭�� ����ϱ�
 * ����:599�� / �λ�:51�� / ��õ:46�� / ����:43�� / �뱸:27��
 */
	public static void main(String[] args) {

		String [] location = {"����","�λ�","��õ","����","�뱸"};
		int [] num = {599,51,46,43,27};
		
		for(int i=0; i<location.length; i++) {
			System.out.println(location[i] + " : " + num[i]);
		}
			
		
		
//		����� ������ �迭�� ����ϴ� �ǵ��� ���� ����
		
//		String [][] accessor = {
//				{"����","599��"},
//				{"�λ�","51��"},
//				{"��õ","46��"},
//				{"����","43��"},
//				{"�뱸","27��"}
//		};
//		
//		for(int i=0; i<accessor.length; i++) {
//			System.out.println(Arrays.deepToString(accessor[i]));
//		}
		
	}

}
