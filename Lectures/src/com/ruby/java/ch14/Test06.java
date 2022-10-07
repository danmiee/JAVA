package com.ruby.java.ch14;
/*
 * Generalization : int, float, String �� ������Ÿ���� T�� ǥ��
 * <-> Specialization(instantiation)
 */

// Generic Interface
interface MyFunc<T> {
	T modify(T t);
	// TŸ���� t�� ��ҷ� ����
}

public class Test06 {

	public static void main(String[] args) {
		
		// Specialize Interface
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		// Specialize Interface
		MyFunc<Integer> mf2 = (n) -> n * 2;
			/*
			 *  IntegerŸ���� n�� ��ҷ� ���� ��ü mf2
			 *  modify �Լ��� �ٵ�� n*2
			 *  �� mf2.modify ����� n*2
			 */
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}
}