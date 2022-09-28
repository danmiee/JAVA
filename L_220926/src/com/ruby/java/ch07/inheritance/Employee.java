package com.ruby.java.ch07.inheritance;

class Person {
// default class : ���� ��Ű�� ���� ��� Ŭ�������� ���ٰ���
	private String name;
	private int age;
	private String dept;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// return ���� �����Ƿ� void
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
//public class Person
/*	�ϳ��� Ŭ���� ���Ͽ��� public class�� �ϳ��� ���Ǿ�� �Ѵ�.
*	������ ���� : The public type Person must be defined in its own file
*  			> public Ÿ���� Person�� ���� ���Ϸ� ���ǵǾ���Ѵ�. 
*/

public class Employee extends Person {
		
//	Ŭ���� ������ ��ü ����� Ȱ���ϱ�
	
	private String name;
	private int age;
	private String dept;
	// private �ǹ� test > line.70
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// return ���� �����Ƿ� void
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p2 = new Person();
//		p.age=13;
		/*
		 *  not visible
		 *  ���� main�� Employee Ŭ���� �ȿ� �ְ� Person�� ���� Ŭ����
		 *  Person�� age�� private�̱� ������ Employee���� ���� �Ұ�
		 */
		int num =0;
		
		Employee e = new Employee();
		/*
		 *  ��ü����
		 *  Employee e : Stack�� �������� e ����
		 *  new Employee() : Heep�� Employee�� �ν��Ͻ� ����
		 *  Person Ŭ���� ��ӹ����Ƿ� Person Ŭ���� ���뵵 �Բ� ����
		 */
		
		e.age = 23;
//		age = 24;
		num = 15;
		System.out.println(e.age);
//		System.out.println(age);
		//	��ü�� �־�� ��밡��
		
		e.setAge(10);
		// age �� ��������
/*
 * 		setName("Hello");
 * 		��ü�� �� ����� �ϸ� non static method ���� �߻�
 * 		: setName�� ��ü�� �־�� �ҷ��� �� �ִٴ� �ǹ�
 */
		Employee s = new Employee();
		s.setName("Hello");
		
		Student s2 = new Student();
		
		Person p = new Person();
		
		p.setAge(55);
		p.getAge();
		 
		
		s2.setAge(33);
		s2.getAge();
		System.out.println("student:: age = " + s2.getAge());
		//  ���� ��Ű�� ���� �ٸ� public Ŭ�������� public���� ���ǵ� �޼ҵ带 �ҷ��� �� �ִ�.
		
		System.out.println("age = " + e.getAge());
		// �۵����� Ȯ��
	}

}
