package com.ruby.java.ch07.inheritance2;

class Person {
 
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private String dept;
	/*
	 *  ��� ������ ������ private���� �����Ѵ�.
	 *  why? �ٸ� ������ ���� �������� ���ϰ� �Ϸ���
	 *  private�̸� �ٸ� class���� ���ٺҰ�
	 */
	public Person() {}
	public Person(String s, int a, String d) {
		name = s; age = a; dept = d;
	}
	
}

public class Employee_cons extends Person {
		@SuppressWarnings("unused")
		private int salary;
		public Employee_cons(String s, int a, String d, int pay) {
			
			super(s,a,d);
			// �����ڴ� ó���� ȣ���ؾ���
//			Person(s,a,d);
			// �ڵ����� ��ӵ��� ����
			System.out.println("Employee()::");
			salary = pay;
//			name = s;
//			age = a;
//			dept = d;
		}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Employee_cons e = new Employee_cons("hong",10,"ce",1000);
		
	}

}
