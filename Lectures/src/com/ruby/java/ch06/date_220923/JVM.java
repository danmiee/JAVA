package com.ruby.java.ch06.date_220923;

public class JVM {

	public static void main(String[] args) {
		
//		int n = 10;
		
		Armor a = new Armor(); 
		/* new Armor : ��ü
		 * n, a : local variant
		 * [JVM]
		 * code / heep(�޸� �����ߴ�-new) / stack(��������-n,a)
		 */
		a.getName();
	}
}
