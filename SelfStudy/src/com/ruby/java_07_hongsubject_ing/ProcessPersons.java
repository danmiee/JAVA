package com.ruby.java_07_hongsubject_ing;

/*
 * ���縦 �����Ͽ� Person, Employee, Professor, Student Ŭ���� ����
 * ������, toString ����
 * 0928 �������� main�� ������ ������ �ڵ��ϱ�
 */

class Person {
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String toString() {
		return "name: " + name + " age: " + age;
	}
}

class Employee extends Person {
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + "dept: " + dept;
	}
}

class Professor extends Person {
	private String subject;

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + "subject: " + subject;
	}

}

class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + "major: " + major;
	}
}

public class ProcessPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �����ε�, ��ü�迭(up casting ����)
	}

}
