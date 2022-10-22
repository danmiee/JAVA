// p.145 �迭�� ť �����
/*
 * 1. ��ť : rear �� �ֱ�
 * 2. ��ť : front �� ����
 * 3. ��� ��Ҹ� �������� �� ĭ�� �ű��
 */
package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntArrayQueue {

	private int[] que;
	private int capacity;
	private int num;

	public IntArrayQueue() {

	}

	public IntArrayQueue(int maxlen) {
		capacity = maxlen;
		num = 0;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public int[] getQue() {
		return que;
	}

	public void setQue(int[] que) {
		this.que = que;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "IntArrayQueue [que=" + Arrays.toString(que) + ", capacity=" + capacity + ", num=" + num + "]";
	}

	@SuppressWarnings("serial")
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() {
		}

		public void print() {
			System.out.println("ť�� ����ֽ��ϴ�.");
		}
	}

	@SuppressWarnings("serial")
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() {
		}

		public void print() {
			System.out.println("ť�� �������ֽ��ϴ�.");
		}
	}

	int x;

	/*
	 * enque
	 * enque �Ұ���Ȳ? full : num >= capacity : overflow
	 */
	public int enque(int x) throws OverflowIntArrayQueueException {
		if (num >= capacity)
			throw new OverflowIntArrayQueueException();
		// num(������ ����) = index
		// num = num+1 : ���� enque ��ġ����
		que[num++] = x;
		return x;
	}

	/*
	 * deque
	 * �� ����
	 * ��� ��� ��ĭ�� ������ ��ܿ���
	 * deque �Ұ���Ȳ? num <= 0 : empty
	 */
	public int deque() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		x = que[0];
		for (int i = 0; i < num; i++) {
			if(i+1 >= num)
				break;
			que[i] = que[i + 1];
		}
		num--;
		return x;
	}

	/*
	 * peek : �������� ���� ������ �� Ȯ���ϱ�
	 * peek �Ұ���Ȳ? num <= 0 : empty
	 */
	public int peek() {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		return que[num - 1];
	}

	// clear
	public void clear() {
		num = 0;
	}

	// indexOf : ť���� x�� �˻��Ͽ� �ε���(ã�����ϸ� -1) ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i] == x)
				return i;
		return -1;
	}

	// size : ť�� �׿��ִ� ������ ���� num ���
	public int size() {
		return num;
	}

	// isEmpty
	public boolean isEmpty() {
		return num <= 0;
	}

	// isFull
	public boolean isFull() {
		return num >= capacity;
	}

	/* dump
	 * ť ���� ��� ������ ���
	 * dump �Ұ���Ȳ? num <= 0 : empty
	 */
	public void dump() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		for (int i = 0; i < num; i++) {
			System.out.print(" " + que[i]);
		}
	}
}
