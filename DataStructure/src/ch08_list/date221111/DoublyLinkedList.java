package ch08_list.date221111;

import java.util.Comparator;

// --- ��� ---//
class dNode<E> {
	private E data; // ������
	private dNode<E> llink; // ����������(���� ��忡 ���� ����)
	private dNode<E> rlink; // ����������(���� ��忡 ���� ����)

	// --- ������(constructor) ---//
	public dNode() {
		this.data = null;
		llink = rlink = this;
	}

	public dNode(E data, dNode<E> llink, dNode<E> rlink) {
		this.data = data;
		this.llink = llink;
		this.rlink = rlink;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public dNode<E> getLlink() {
		return llink;
	}

	public void setLlink(dNode<E> llink) {
		this.llink = llink;
	}

	public dNode<E> getRlink() {
		return rlink;
	}

	public void setRlink(dNode<E> rlink) {
		this.rlink = rlink;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", llink=" + llink.data + ", rlink=" + rlink.data + "]";
	}
}

public class DoublyLinkedList<E> {
	// ���� ���� ���� ����Ʈ Ŭ���� - first node�� ����

	private dNode<E> first; // �Ӹ� ������(�����ϴ� ���� ���̳��)

	// --- ������(constructor) ---//
	public DoublyLinkedList() {
		first = new dNode<E>(); // dummy(first) ��带 ����
	}

	// --- ����Ʈ�� ����ִ°�? ---//
	public boolean isEmpty() {
		return first.getRlink() == first;
	}

	// --- ��带 �˻� ---//
	public E search(E obj, Comparator<? super E> c) {
		dNode<E> ptr = first.getRlink(); // ���� ��ĵ ���� ���

		while (ptr != first) {
			if (c.compare(obj, ptr.getData()) == 0) {
				return ptr.getData(); // �˻� ����
			}
			ptr = ptr.getRlink(); // ���� ��忡 �ָ�
		}
		return null; // �˻� ����
	}

	// --- ��ü ��� ǥ�� ---//
	public void show() {
		dNode<E> ptr = first.getRlink(); // ���� ����� ���� ���

		while (ptr != first) {
			System.out.println(ptr.getData());
			ptr = ptr.getRlink();
		}
	}

	// --- �ø��������� ������ �ǵ��� insert ---//
	public void add(E obj, Comparator<? super E> c) {
		// �Ӹ� ��尡 ���� ���� ������ ���� ��� obj�� ����
		if (first == first.getRlink()) {
			// �Ű����� ���� ���� ������ ����
			dNode<E> ptr = new dNode<>(obj, first, first);
			// �Ӹ� ���� ��忡 ������ ����
			first.setRlink(ptr);
			// �޼ҵ� ����
			return;
		}

		// �Ӹ� ����� ���� ��带 �ӽ� ���� ����
		dNode<E> tempL = first.getLlink();
		dNode<E> tempR = first.getRlink();
		while (true) {
			// �Է°��� �ӽ� ��庸�� �۰ų� ���� ��
			if (c.compare(obj, tempR.getData()) <= 0) {
				// �Ű������� ������ �ϴ� ������ ����
				dNode<E> ptr = new dNode<>(obj, tempR.getLlink(), tempR);
				// �ӽ� ��� ���� ��忡 ������ ���� - ���� ����� Rlink�� ���� ����� Llink ��ġ�ؾ� ���� ��µ�
				tempL.setRlink(ptr);
				tempR.setLlink(ptr);
				System.out.println(ptr);
				System.out.println(tempR);
				// �޼ҵ� ����
				return;
			}
			// �ӽ� ����� ���� ��尡 �Ӹ� ���� ������ �ݺ� ����
			if (tempR.getRlink() == first)
				break;
			// ���� ��忡 �ָ�
			tempL = tempR;
			tempR = tempR.getRlink();
		}
		// �������� ���� ������ ����
		dNode<E> ptr = new dNode<>(obj, tempR, first);
		// �ӽ� ��� ���� ��忡 ������ ����
		tempR.setRlink(ptr);
	}

	// --- list�� ������ �����Ͱ� ������ �ش� ��带 ���� ---//
	public void delete(E obj, Comparator<? super E> c) {
		
	}
}
