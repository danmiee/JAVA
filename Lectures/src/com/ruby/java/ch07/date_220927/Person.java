package com.ruby.java.ch07.date_220927;

public class Person {

	/*
	 * ������ ���� - ��� Ŭ������ �����ڰ� �ݵ�� �����ϸ� �����ڰ� ������� ������ �����Ϸ��� ������ ����ִ� �����ڸ� �ڵ� ����
	 */

	// ������ ������ ����
	/*
	 * public Person() { System.out.println("Person ������ ����!"); }
	 */

	// �ڽ�Ŭ������ ������ ������ �ڵ� �ߺ� ����
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;

	// private���� �����Ͽ��� ������ �ٸ� Ŭ�������� ���������� getter, setter �ʿ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ����� ���� toString �޼ҵ� ����
	public String toString() {
		return name + ":" + age;
	}
}
