package com.ruby.java_07_inheritance;

/*
 * ���縦 �����Ͽ� Person, Employee, Professor, Student Ŭ���� ����
 * ������, toString ����
 * 0928 �������� main�� ������ ������ �ڵ��ϱ�
 */

class Person {
	public Person() {
	}

	public Person(String name) {
		this.name = name;
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
	
	public void show() {
		System.out.println("name: " + name + " age: "+age);
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
	
	public void show() {
		super.show();
		System.out.println("dept: " + dept);
	}
}

class Professor extends Person {
	private String subject;

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + " subject: " + subject;
	}
	
	public void show() {
		super.show();
		System.out.println("subject: " + subject);
	}

}

class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + " major: " + major;
	}

	public void show() {
		super.show();
		System.out.println("major: " + major);
	}
	
}

public class ProcessPersons {

	// �������ε� �Լ� ��ġ!!
	static void display(Person[] p) {
		for(int i=0; i<5; i++) {
			p[i].show();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ overloading
		 * ��ü�迭 ����
		 * upcasting
		 */
		
		Person p = new Person();
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("ȫ�浿",46);
//		System.out.println(p);
//		System.out.println(p1);
//		System.out.println(p2);
		
		Professor pf = new Professor("��ö��",38,"�������");
		System.out.println(pf.toString());
		
		Student s = new Student("�迵��",26,"����");
		System.out.println(s.toString());
		
		Person list[] = new Person[5];
		
		list[0]=p; list[1]=p1; list[2]=p2; list[3]=pf; list[4]=s;
		
		display(list);
		
		
//		p.show();
//		System.out.println();
//		p1.show();
//		System.out.println();
//		p2.show();
//		System.out.println();
//		pf.show();
//		System.out.println();
//		s.show();
		
	}

}
