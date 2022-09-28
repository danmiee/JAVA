package lecture;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
		/*
		 *  �Լ� �̸��� �ְ� {body}�� ���� > �߻�ȭ
		 *  body�� ���? ��ӹ��� Ŭ�������� ����!
		 *  �̷��� �� ��? �޼ҵ��̸� ���Ͻ�Ű����
		 */
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}

	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}

	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

abstract class Manager extends Employee {
	/*
	 * abstract �����Ϸ��� Employee�� calcBonus ���� �ʿ�
	 */
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
//		 Employee m = new Employee();
		/* Error
		 * Cannot instantiate the type Employee
		 * Employee�� abstractŬ������
		 * > abstract �����? abstract �޼ҵ� ����(�޼ҵ尡 ���� �� ���������)
		 * > �޼ҵ��� abstract �����? �޼ҵ� {body} ����������� 
		 */
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
//		Manager m = new Manager();
		/* Error
		 * Cannot instantiate the type Manager
		 * abstract Ŭ������ �ȵ�
		 * > abstract �����? employee���� abstract�� �޼ҵ� �����������
		 */
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}

//	�߻�Ŭ���� ���ǻ���
	/*
	 * 1. �޼��� ���� �� ������ �Ϻη� �������� ���� �� abstract�� �����ؾ���
	 * 2. abstract�� ������ �޼ҵ�� �޼ҵ� ���� ���� �� ����
	 * 3. �߻� �޼ҵ带 �����ϴ� Ŭ������ ����ο� abstract ���
	 * 4. �߻� Ŭ������ �ϳ� �̻��� �߻� �޼ҵ尡 �ִٴ� �ǹ�
	 */