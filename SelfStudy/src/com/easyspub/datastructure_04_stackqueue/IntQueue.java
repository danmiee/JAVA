// p.145 �迭�� ť �����
/*
 * 1. ��ť : rear �� �ֱ�
 * 2. ��ť : front �� ����
 * 3. ��� ��Ҹ� �������� �� ĭ�� �ű��
 */
package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntQueue {

	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;

	public IntQueue() {

	}

	public IntQueue(int maxlen) {
		capacity = maxlen;
		num = front = rear = 0;
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

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "IntQueue [que=" + Arrays.toString(que) + ", capacity=" + capacity + ", num=" + num + ", front=" + front
				+ ", rear=" + rear + ", x=" + x + "]";
	}

	@SuppressWarnings("serial")
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}

		public void print() {
			System.out.println("ť�� ����ֽ��ϴ�.");
		}
	}

	@SuppressWarnings("serial")
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}

		public void print() {
			System.out.println("ť�� �������ֽ��ϴ�.");
		}
	}

	int x;

	/* enque : rear�� �� �ֱ�
	 * enque �Ұ���Ȳ?
	 * 		full : num >= capacity : overflow
	 * ������
	 * 		rear == capacity : rear = 0���� ���ư��� 
	 */
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException();
		// rear�� �� �־��ֱ�
		// rear�� +1 : ���� enque ��ġ����
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}

	/* deque
	 * front �� ����ϰ� �����ϱ�
	 * deque �Ұ���Ȳ?
	 * 		num <= 0 : empty
	 * ������
	 * 		front == capacity : front = 0���� ���ư���
	 */
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	/*
	 * peek
	 * front �� ����ϱ�
	 * peek �Ұ���Ȳ?
	 * 		num <= 0 : empty
	 */
	public int peek() {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// clear
	public void clear() {
		num = front = rear = 0;
	}

	// indexOf : ť(front~rear)���� x�� �˻��Ͽ� �ε���(ã�����ϸ� -1) ��ȯ
	public int indexOf(int x) {
		int idx = 0;
		for (int i = 0; i < num; i++)
			idx = (i+front) % capacity;
			if (que[idx] == x)
				return idx;
		return -1;
	}

	/*
	 * size : ť�� �׿��ִ� ������ ���� num ���
	 */
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

	/* dump : ť ���� ��� ������ front>rear ������ ���
	 * dump �Ұ���Ȳ? empty : num <= 0
	 */
	public void dump() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		for (int i = 0; i < num; i++) {
			int idx = (i+front) % capacity;
			System.out.print(" " + que[idx]);
		}
	}
}
