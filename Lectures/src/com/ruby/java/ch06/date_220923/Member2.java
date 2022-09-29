package com.ruby.java.ch06.date_220923;

public class Member2 {
	private String name;
	private int age;

/*
 * this.name & this.age �ݺ� �߻� > this(name, 0)���� refactoring ����
 */
	public Member2() {
//		this.name = "guest";
//		age = 0;
		this("guest");
	}

	public Member2(String name) {
//		this.name = name;
//		age = 0;
		this(name,0);
	}

	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}

	public static void main(String[] args) {
		Member2 m1 = new Member2();
		Member2 m2 = new Member2("Amy");
		Member2 m3 = new Member2("Amy",23);
		m1.show();
		m2.show();
		m3.show();
	
	}
	
	
}
