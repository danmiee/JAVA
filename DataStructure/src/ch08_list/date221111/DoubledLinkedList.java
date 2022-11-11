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
		this.llink = null;
		this.rlink = null;
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
		return "Node [data=" + data + ", llink=" + llink + ", rlink=" + rlink + "]";
	}
}

public class DoubledLinkedList<E> {
	//���� ���� ���� ����Ʈ Ŭ���� - first node�� ����

		private dNode<E> first; // �Ӹ� ������(�����ϴ� ���� ���̳��)
		
		// --- ������(constructor) ---//
		public DoubledLinkedList() {
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
		

		}

		// --- list�� ������ �����Ͱ� ������ �ش� ��带 ���� ---//
		public void delete(E obj, Comparator<? super E> c) {
		
	}
}
