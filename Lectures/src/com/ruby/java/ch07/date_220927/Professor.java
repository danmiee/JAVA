package com.ruby.java.ch07.date_220927;

public class Professor extends Person {

//������ ����
	/* ����	
	public Professor() {
			// �����Ϸ��� super();�� �ڵ����� �߰��Ͽ� �θ�Ŭ������ �����ڵ� �Բ� ��µ�
			System.out.println("Professor ������ ����!");
		}
	*/

	// �θ�Ŭ������ ���ڰ��� �޴� �Ű������� ����� ������ ����
	/*
	public Professor(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) ������ ����!");
	}
	*/
	
	// �θ�Ŭ�������� �ߺ������Կ� ���� ������ ����
	public Professor(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// overriding ����
	// �θ�Ŭ���� �޼ҵ� ȣ��
	/* getter setter ȣ�� 
	public String toString() {
		return this.getName() + ":" + this.getAge() + ":" + subject;
	}
	*/
	// toString ȣ��
	public String toString() {
		return super.toString() + ":" + subject;
	}
 	
}
