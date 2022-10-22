package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntStack {

	private int[] stk;		// �迭����
	private int capacity;	// �迭ũ��
	private int ptr;		// ������ġ
	
	public class EmptyIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// serialize : ��ũ�� ���, ����ȭ <-> deserialize
		// ������� Ŭ������ �������� - ���ʿ�� ������̼� ó���ص� ��
		// Ŭ������ �ִ� ������ ��ũ�� ��� > �ʵ尡 ����Ǹ� ���� ����

		public EmptyIntStackException() {
		}
		
		public void print() {
			System.out.println("������ ����ֽ��ϴ�.");			
		}
	}
	
	@SuppressWarnings("serial")
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException () {	
		}
		
		public void print() {
			System.out.println("������ �������ֽ��ϴ�.");			
		}
	}
	
	public IntStack() {
		
	}
	
	// ������ : �� �ʱ�ȭ, �迭 ũ�⸦ �Ű������� ����
	public IntStack(int maxlen) {
		ptr = 0;
		// capacity�� �Է°� ��������
		capacity = maxlen;
		// ���� �迭 ����
		try {
		stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			// OutOfMemoryError : heap ���� ���� �������� ����� ����
			// �޸𸮸� �ʰ��ϴ� ���� �ָ� �޸� �Ҵ��� ���� ����
			capacity = 0;
		}
	}
	
	public int[] getStk() {
		return stk;
	}

	public void setStk(int[] stk) {
		this.stk = stk;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPtr() {
		return ptr;
	}

	public void setPtr(int ptr) {
		this.ptr = ptr;
	}

	@Override
	public String toString() {
		return "IntStack [stk=" + Arrays.toString(stk) + ", capacity=" + capacity + ", ptr=" + ptr + "]";
	}
	
	/* push
	 * - �迭��ҷ� x �־��ֱ�
	 * - ���� push���� ptr = ptr+1
	 * - push�� �� ���� ���? �迭�� full : ptr�� �ε��� �� �ʰ� : ptr>=capacity
	 */
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	/* pop
	 * - ������ push�� �� ��������
	 * - ���� pop���� ptr = ptr-1
	 * - pop�� �� ���� ���? push�� ���� ���� ��� : ptr=0 > empty ����ó�� 
	 */
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	/* peek
	 * - ������ push�� �� ��������
	 * - peek�� �� ���� ���? push�� ���� ���� ��� : ptr=0 > empty ����ó�� 
	 */
	public int peek() throws EmptyIntStackException {
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	/* clear
	 * �迭��Ҹ� �����ϴ� ��� ������ ptr�� �������� ����ǹǷ�
	 * ptr=0�� �Ǹ� ù �ε������� ���Ӱ� push ����
	 */
	public void clear() {
		ptr = 0;
	}
	
	/* indexOf : x�� ã�� �ε���(������ -1) ��ȯ
	 * - stk[] �迭 ���鼭 x ã��
	 * - ��ġ�ϴ� i ��ȯ ������ -1 ��ȯ
	 */
	public int indexOf(int x) {
		for(int i = 0; i < stk.length; i++)
			if(stk[i] == x)
				return i;
		return -1;
	}
	
	// size : ���ÿ� �׿��ִ� ������ ����
	public int size() {
		return ptr;
	}
	
	// isEmpty : ���� ����ִ��� �Ǵ�
	public boolean isEmpty() {
		// boolean �ʱⰪ : true
		return ptr <= 0;
	}
	
	// isFull : ���� �������ִ��� �Ǵ�
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	/* dump : ���� ���� ���� �����͸� �ٴ�->����� ������ ���
	 * - for������ �� ��������
	 * - dump �� �� ���� ���? ������ ������� : ptr<=0 : empty ����ó��
	 */
	public void dump() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		// stk�� �� ���� ptr�� ������� ��ü�� ����ϱ� ������ �ȵ�
		// Ȯ�� for���� �ƴ� �Ϲ� for�� ��� �ʿ�
		for(int i=0; i<ptr; i++) {
			System.out.print(" " + stk[i]);
		}
	}
	
}

