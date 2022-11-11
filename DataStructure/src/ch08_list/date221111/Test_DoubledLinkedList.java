package ch08_list.date221111;

import java.util.Comparator;
import java.util.Scanner;

public class Test_DoubledLinkedList {
	//���� ���� ���� ����Ʈ Ŭ���� DoubleLinkedList<E>�� ��� ��

	 static Scanner stdIn = new Scanner(System.in);

	 //--- ������(ȸ����ȣ���̸�) ---//
	 static class Data {
	     static final int NO   = 1;        // ��ȣ�� �о� ���ϱ��?
	     static final int NAME = 2;        // �̸��� �о� ���ϱ��?

	     private Integer no;              // ȸ����ȣ
	     private String  name;            // �̸�

	     //--- ���ڿ� ǥ���� ��ȯ ---//
	     public String toString() {
	         return "(" + no + ") " + name;
	     }
	     public Data() {
	    	 no = -1; name = null;
	     }
	     //--- �����͸� �о� ���� ---//0
	     
	     void scanData(String guide, int sw) {
	         System.out.println(guide + "�� �����͸� �Է��ϼ���.");

	         if ((sw & NO) == NO) {
	             System.out.print("��ȣ: ");
	             no = stdIn.nextInt();
	         }
	         if ((sw & NAME) == NAME) {
	             System.out.print("�̸�: ");
	             name = stdIn.next();
	         }
	     }

	     //--- ȸ�� ��ȣ�� ������ �ű�� comparator  ---//
	     public static final Comparator<Data> NO_ORDER =
	                           new NoOrderComparator();

	     private static class NoOrderComparator implements Comparator<Data> {
	         public int compare(Data d1, Data d2) {
	             return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
	         }
	     }

	     //--- �̸����� ������ �ű�� comparator  ---//
	     public static final Comparator<Data> NAME_ORDER =
	                           new NameOrderComparator();

	     private static class NameOrderComparator implements Comparator<Data> {
	         public int compare(Data d1, Data d2) {
	             return d1.name.compareTo(d2.name);
	         }
	     }
	 }

	 //--- �޴� ������ ---//
	 enum Menu {
		 ADD("����"), DELETE("����"), SEARCH_NO("��ȣ �˻�"), SEARCH_NAME("�̸� �˻�"), SHOW("��ü ��� ���"), TERMINATE("����");

	          private final String message;        // ǥ���� ���ڿ�

	     static Menu MenuAt(int idx) {        // ������ idx��°�� ���Ÿ� ��ȯ
	         for (Menu m : Menu.values())
	             if (m.ordinal() == idx)
	                 return m;
	         return null;
	     }

	     Menu(String string) {                        // ������(constructor)
	         message = string;
	     }

	     String getMessage() {                        // ǥ���� ���ڿ��� ��ȯ
	         return message;
	     }
	 }

	 //--- �޴� ���� ---//
	 static Menu SelectMenu() {
	     int key;
	     do {
	         for (Menu m : Menu.values()) {
	             System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
	             if ((m.ordinal() % 3) == 2 &&
	                   m.ordinal() != Menu.TERMINATE.ordinal())
	                 System.out.println();
	         }
	         System.out.print(" : ");
	         key = stdIn.nextInt();
	     } while (key < Menu.ADD.ordinal() || 
	                                         key > Menu.TERMINATE.ordinal());
	     return Menu.MenuAt(key);
	 }

	 public static void main(String[] args) {
	     Menu menu;                                // �޴� 
	     Data data;                                // �߰��� ������ ����
	     Data ptr;                                 // �˻��� ������ ����
	     Data temp = new Data();                   // �о� ���� ������

	     DoubledLinkedList<Data> list = new DoubledLinkedList<Data>(); // ����Ʈ�� ����
	     do {
				switch (menu = SelectMenu()) {

				case ADD: // ����
					data = new Data();
					data.scanData("����", Data.NO | Data.NAME);
					list.add(data, Data.NO_ORDER);
					break;

				case DELETE: // ����
					data = new Data();
					data.scanData("����", Data.NO | Data.NAME);
					list.delete(data, Data.NO_ORDER);
					break;

				case SEARCH_NO: // ȸ�� ��ȣ �˻�
					temp.scanData("�˻�", Data.NO);
					ptr = list.search(temp, Data.NO_ORDER);
					if (ptr == null)
						System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
					else
						System.out.println("�˻� ����: " + ptr);
					break;

				case SEARCH_NAME: // �̸� �˻�
					temp.scanData("�˻�", Data.NAME);
					ptr = list.search(temp, Data.NAME_ORDER);
					if (ptr == null)
						System.out.println("�� �̸��� �����Ͱ� �����ϴ�.");
					else
						System.out.println("�˻� ����: " + ptr);
					break;

				case SHOW: // ��ü ��带 ����Ʈ ������� ǥ��
					list.show();
					break;
					
				default:
					break;

				}
			} while (menu != Menu.TERMINATE);
	     stdIn.close();
	 }
}
