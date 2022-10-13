package com.ruby.java_09_api;

public class MyObject {

	// toString �������̵� - �޼ҵ� ����δ� ���� �Ұ�
//	public String toString() {
//		return "MyObject";
//	}
	
	int num;
	
	// ������ ����
	MyObject(int num) {
		this.num = num;
	}

	// toString �������̵�
	public String toString() {
		return "MyObject";
	}
	
	// equals()�޼ҵ� �������̵� - �ؽ��ڵ� �� �� �ٸ� �������� ��
	public boolean equals(Object obj) {
		
		// �ʱⰪ ����
		boolean result = false;
		MyObject arg = (MyObject) obj;
		
		// ���� �ν��Ͻ��� num ���� ������ num �� ������ ��
		if(this.num == arg.num) {
			result = true;
		}
		return result;
	}

}
