package com.ruby.java.ch07.date_220927;

public class Student extends Person {

//������ ����
	/* ����	
	public Studetn() {
			// �����Ϸ��� super();�� �ڵ����� �߰��Ͽ� �θ�Ŭ������ �����ڵ� �Բ� ��µ�
			System.out.println("Studetn ������ ����!");
		}
	*/
	/*
	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
		System.out.println("Student(name,age,major) ������ ����!");
	}
	*/
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
		
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//overriding ����
	// �θ�Ŭ���� �޼ҵ� ȣ��
	/*
	public String toString () {
		return this.getName() + ":" + this.getAge() + ":" + major;
	}
	*/
	// toString ȣ��
	public String toString() {
		return super.toString() + ":" + major;
	}
}
