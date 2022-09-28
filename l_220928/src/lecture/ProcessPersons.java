package lecture;

class Person {
	private String pno;
	private String pname;
	private int age;
	
	// ������ overloading : ������ �Լ��� ���� ȣ��Ǵ� ������ �ٸ�
	public Person() { 
//		System.out.println("default ������");
		pno = null; pname = null; age = 0;
	};
	public Person(String pn) {
		this(); // �⺻������ �ҷ�����
		pno = pn;
	}
	public Person(String pn, String name) {
		this(pn); // �⺻�����ڿ� �Ű����� �־ �ҷ�����
		pname = name;
	}
	public Person(String pn, String name, int a) {
		this(pn,name);
		age = a;
//		pno = pn; pname = name; age = a;
	}
	
	public void show() {
		System.out.println("pno: " + pno + " pname: " + pname + " age: " + age);
	}

	// ���� ����ϴ� �ڵ���� ( void show �� �Ⱦ� )
	public String toString() {
		return "pno: " + pno + " pname: " + pname + " age: " + age;
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolYear;
	public Student() { schoolName = null; schoolYear = 0; };
	public Student(String pn, String name, int a, String sname, int syear) {
		super(pn, name, a);
		schoolName = sname; schoolYear = syear;
	}
	
	// ������ overriding
	/*
	 * ��ӹ��� �޼ҵ��� ������ �������ϴ� ��
	 * �ڽ�Ŭ������ ������ �޼ҵ尡 �θ�Ŭ�������� ������ �޼ҵ庸�� �켱������ ����
	 * super.�޼ҵ�();	�Է� �� �θ�Ŭ�������� ���ǵ� �޼ҵ� ���
	 * super���� ����ϸ� �ڱ��ڽ��� ��� �ݺ��ϱ� ������ �����߻�
	 */

//	public void show() {
//		super.show();
//		System.out.println("schoolName: "+schoolName+" schoolYear: "+schoolYear);
//	}
	
	public String toString() {
		return super.toString()+" schoolName: "+schoolName+" schoolYear: "+schoolYear;
	}
	
	public void show() {
		super.show();
		System.out.println(toString());
	}
}

class WorkStudent extends Student {
	private String job;
	private int salary;
	public WorkStudent() { job = null; salary = 0; };
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job = j; salary = pay;
	}

	public String toString() {
		return super.toString()+" job: "+job+" salary: " +salary;
	}
	
	public void show() {
		super.show();
		System.out.println(toString());
	}
}

public class ProcessPersons {
	
	// �������ε� ���� �ڡڡ�
	static void display(Person[] p) {
		for (int i = 0; i < 6; i++ ) {
			p[i].show();
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person list[] = new Person[10];
		
		// ������ overloading
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002","Hong");
		Person p3 = new Person("p003","Kim",20);
//		System.out.println(p);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		Student s1 = new Student("p004","Lee",40,"�Ŷ��",5);
		
		WorkStudent ws = new WorkStudent("p001","Hong",30,"�λ��",3,"code",1000);
		
		list[0] = p; list[1] = p1; list[2] = p2; list[3] = p3; list[4] = s1; list[5] = ws;
		// list[4] = s1;	: upcasting(Sub���� Super�� �ö�)
		// ProcessPersons.display(list);	: ���� Ŭ���� ������ ������ �޼ҵ�� ��밡��
		display(list);
		// show();							: ���� Ŭ���� ������ ������ �޼ҵ尡 �ƴϱ� ������ ���Ұ�
		// WorkStudent.show();				: non-static�̱� ������ ��ü�� �־�� ��밡��(��ü����Լ�)
		
//		p3.show();
//		System.out.println();
//		s1.show();
//		System.out.println();
//		ws.show();
//		System.out.println();
//		System.out.println(ws.toString());
	}
}

//	final ����
	/*	
	1. final int a = 10;
	 	final ���� : 10�� ����� ����Ұ�
	2. public final void show();
		final �޼ҵ� : no overriding(��������� �Ұ�)
	3. final class {} : ��ӺҰ�
	*/