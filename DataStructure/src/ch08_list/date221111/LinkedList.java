package ch08_list.date221111;

import java.util.Comparator;

// ���� ����Ʈ Ŭ����
class Node<E> {
	private E data; // ������
	private Node<E> next; // ���� ������(���� ��忡 ���� ����)

	public Node() {
		this.data = null;
		this.next = null;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	// --- ������(constructor) ---//
	Node(E data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}

public class LinkedList<E> {

	private Node<E> head; // �Ӹ� ������(�Ӹ� ��忡 ���� ����)

	// --- ������(constructor) ---//
	public LinkedList() {
		head = null;
	}

	// --- ��� �˻� ---//
	public E search(E obj, Comparator<? super E> c) { // <? super E>�� wild card�μ� E�� subclass�� ���Ͽ� ��� ����
		Node<E> ptr = head; // ���� ��ĵ ���� ���

		while (ptr != null) {
			if (c.compare(obj, ptr.getData()) == 0) { // �˻� ����
				return ptr.getData();
			}
			ptr = ptr.getNext(); // ���� ��忡 �ָ�
		}
		return null; // �˻� ����
	}

	// --- ���� ��� ���� ---//
	public void add(E obj, Comparator<? super E> no, Comparator<? super E> name) {
		// ������ ��忡 �α�
		Node<E> ptr = head, q = head;
		Node<E> crnt = new Node<E>(obj);
		// �Ӹ��� ������� �Ӹ��� �����ϰ� ����
		if (head == null) {
			head = crnt;
			return;
		}
		// �����Ͱ� ������� ���� ���� ����
		while (ptr != null) {
			if (no.compare(obj, ptr.getData()) <= 0) {
				if (name.compare(obj, ptr.getData()) <= 0) {
					// obj�� �����ͺ��� ������ �տ� �����ϰ� ����
					q.setNext(crnt);
					crnt.setNext(ptr);
					return;
				}
			} else {
				// obj�� �����ͺ��� ũ�� ���� ��� �ָ�
				q = ptr;
				ptr = ptr.getNext();
			}
		}
		// �ݺ��� ������� ���� �������� ���� ����
		q.setNext(crnt);
	}

	// --- ��� ���� ---//
	public void delete(E obj, Comparator<? super E> no, Comparator<? super E> name) { // ���� ��ü�� ����
		// ������ ��忡 �α�
		Node<E> ptr = head, q = head;
		if(no.compare(obj, head.getData()) == 0)
			if(name.compare(obj, head.getData()) == 0) {
				// ��ȣ�� �̸��� ��� �Ӹ��� ��ġ�ϸ� �Ӹ��� ���� ��� �����ϰ� ����
				head = head.getNext();
				return;
			}

		while (ptr != null) {
			// ��ȣ�� �̸��� ��ġ�� ���� ����
			if (no.compare(obj, ptr.getData()) == 0) {
				if (name.compare(obj, ptr.getData()) == 0) {
					// ���� ��尡 null�� �ƴϸ� ���� ��ġ�� ���� ��� �����ϰ� ����
					if (ptr != null) {
						q.setNext(ptr.getNext());
						return;
					}
				}
			} else {
				// ��ġ���� ������ ���� ��� �ָ�
				q = ptr;
				ptr = ptr.getNext();
			}
		}
		// �ݺ��� ������� ���� �������� null ó��
		ptr = null;
	}

	// --- ��ü ��� ǥ�� ---//
	public void show() {
		Node<E> ptr = head;

		while (ptr != null) {
			System.out.println(ptr.getData());
			ptr = ptr.getNext();
		}
	}
}
