package training;

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
	 * ������ ������ ����ص� �ڽ�Ŭ������ ������ ���� �θ�Ŭ�������� ������ �ͺ��� �켱������ ����
	 * super.�޼ҵ�();
	 * �Է� �� �θ�Ŭ�������� ���ǵ� �޼ҵ� ���
	 * super���� ����ϸ� �ڱ��ڽ��� ��� �ݺ��ϱ� ������ �����߻�
	 */
	public void show() {
		super.show();
		System.out.println("sname: "+schoolName+" syear: "+schoolYear);
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
	public void show() {
		super.show();
		System.out.println("job: "+job+" salary: " +salary);
	}
	
}

public class ProcessPersons {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		p3.show();
		System.out.println();
		s1.show();
		System.out.println();
		ws.show();
	}

}
