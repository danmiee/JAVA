package com.ruby.java_09_API;

public class Test09 {

	public static void main(String[] args) {
		// String�� ���� : ���� ���� �ȵ� > ���ڿ� ������ ������ �޸𸮿� ���ο� ���ڿ� ���� > ���� ���ڿ��� �޸� ����
		// StringBuffer, StringBuilder ������ : ���ۿ��� ���ڿ� ���� > ȿ�������� �޸� ����

		// StringBuilder : ������ �ν��Ͻ��� ���� ���� ��Ȳ ��ó �Ұ�
		StringBuilder sb = new StringBuilder("���� ���Ƽ� ");

		System.out.println(sb);
		// append : �Ű������� ���޹��� �� �߰�
		System.out.println(sb.append("���� �����ؼ�"));
		// insert : ù��° �Ű������� ���޹��� ��ġ ������ �ι�° �Ű����� ����
		System.out.println(sb.insert(7, "���� ���� �ʾƼ� "));
		System.out.println(sb.append(" ��� ���� ���Ҵ� "));

		int start = sb.indexOf("��� ���� ���Ҵ� ");
		int end = sb.length();
		System.out.println(sb.replace(start, end, "�ʿ� �Բ� �� �ð� ��� ���μ̴�"));

		// StringBuffer : ������ �ν��Ͻ��� ���� ���� ��Ȳ ��ó ����

	}
}
