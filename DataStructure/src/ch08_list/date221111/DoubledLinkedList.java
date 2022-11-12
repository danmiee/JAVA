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
//			dNode<E> prev = first.getLlink(); // ���� ����� ���� ���
//			dNode<E> next = first.getRlink(); // ���� ����� ���� ���
////			// �Ӹ��� ������� �Ӹ��� �����ϰ� ����
////			if(ptr == null) {
////				next.setData(obj);
////				return;
////			}
//			// ��尡 ������� ���� ���� ����
//			while(next != null) {
//				// obj�� �����ͺ��� ������ �տ� �����ϰ� ����
//				if(c.compare(obj, next.getData()) <= 0) {
//					dNode<E> temp = new dNode<E>(obj, prev, first);
//					prev = temp;
//					return;
//				} else {
//					// obj�� �����ͺ��� ũ�� ���� ��� �ָ�
//					first = next;
//				}
//			}
//			// �ݺ��� ������� ���� �������� ���� ����
//			next.setData(obj);
			
			// �Ӹ� ��尡 ���� ���� ������ �Ӹ�, ��, �� ��� ��� obj�� ����
			if(first == first.getRlink()) {
				// data, ���� ���, ���� ��带 ��� obj�� ���� �ӽ� ��� ����
				dNode<E> temp = new dNode<>(obj, first, first);
//				 �Ӹ��� obj �־��ֱ�
//				first.setData(obj);
//				// �Ӹ� ���� ��忡 �ӽ� ��� �־��ֱ�
//				first.setLlink(temp);
				// �Ӹ� ���� ��忡 �ӽ� ��� �־��ֱ�
				first.setRlink(temp);
				// �޼ҵ� ����
				return;
			}
			
			// ���� ����� ���� ��带 �ӽ� ���� ����
			dNode<E> temp = first.getRlink();
			// �ӽ� ����� ���� ��尡 �Ӹ� ���� ������ �ݺ� ����
			while(true) {
				// �Է°��� �ӽ� ��庸�� �۰ų� ���� ��
				if(c.compare(obj, temp.getData()) <= 0) {
					// �־��� �� ��� ����
					dNode<E> temp2 = new dNode<>(obj, temp.getLlink(), temp);
					// �ӽ� ��� �տ� �� ��� ����
					temp.setLlink(temp2);
					// �޼ҵ� ����
					return;
				}
				if(temp.getRlink() == first)
					break;
				// ���� ��忡 �ָ�
				temp = temp.getRlink();
			}
			dNode<E> temp2 = new dNode<>(obj, temp, first);
			temp.setRlink(temp2);
		}

		// --- list�� ������ �����Ͱ� ������ �ش� ��带 ���� ---//
		public void delete(E obj, Comparator<? super E> c) {
			
	}
}
