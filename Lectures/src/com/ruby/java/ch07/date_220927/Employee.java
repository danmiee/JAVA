package com.ruby.java.ch07.date_220927;

// �θ�Ŭ������ Person ��������
public class Employee extends Person {

	// ������ ����
	/* ����
	public Employee() {
		// �����Ϸ��� super();�� �ڵ����� �߰��Ͽ� �θ�Ŭ������ �����ڵ� �Բ� ��µ�
		System.out.println("Employee ������ ����!");
	}
	*/	

	// �θ�Ŭ������ ���ڰ��� �޴� �Ű������� ����� ������ ����
	/*
	public Employee(String name, int age, String dept) {
		// () �ȿ��� �Ű����� ����
		super.setName(name); // �θ�Ŭ������ setName�� �޴� name
		super.setAge(age); // �θ�Ŭ������ setAge�� �޴� age
		this.dept = dept;
		System.out.println("Employee(name, age, dept) ������ ����!"); // ������ ȣ��� ��±��� �ǵ��� ����
	}
	*/
	
	// �θ�Ŭ�������� �ߺ������Կ� ���� ������ ����
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
	}

	private String dept;

	// private���� �����Ͽ����Ƿ� �ٸ� Ŭ�������� Ȱ���� �� �ְ� getter, setter ����
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// overriding ����
	/*
	 *** �����߻���Ȳ ***
	 public String to String() {
	 	return name + ":" + age + ":" + dept;
	 }
	  - name, age�� �θ�Ŭ�������� private���� ���ǵǾ����Ƿ� ���ٺҰ�
	  - �θ�Ŭ�������� �����ص� getter, setter Ȱ�� �ʿ�
	 */
	
// �θ�Ŭ���� �޼ҵ� ȣ��

	/* getter setter ȣ��
	public String toString() {
		return this.getName() + ":" + this.getAge() + ":" + dept;
	}
	*/
	
	// toString ȣ��
	public String toString() {
		return super.toString() + ":" + dept;
	}
}
