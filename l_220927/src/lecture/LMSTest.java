package lecture;

public class LMSTest {

	public static void main(String[] args) {
		// �ڽ�Ŭ������ ����ִ� �ν��Ͻ� ����
		Employee e = new Employee("������",47,"����ó");	// ������ ����� �Ű������� �����ߴٸ� �ҷ��� �� �Ű����� �����ؾ���
		Professor p = new Professor("��Ǫ��",52,"������");
		Student s = new Student("������",20,"��ǻ�Ͱ���");
		
		// �ڽ�Ŭ���� ���� �ҷ�����
		/* ������ �� �Ű����� ���� ��
		 
		e.setName("������");
		e.setAge(47);
		e.setDept("����ó");
		
		p.setName("��Ǫ��");
		p.setAge(52);
		p.setSubject("������");
		
		s.setName("������");
		s.setAge(20);
		s.setMajor("��ǻ�Ͱ���");
		
		*/
		// �ڽ�Ŭ������ ���� �θ�Ŭ���� �޼ҵ� ����ϱ�
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());

	}

}
