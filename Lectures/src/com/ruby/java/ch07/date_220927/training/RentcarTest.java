package com.ruby.java.ch07.date_220927.training;
/*
 *  ��Ʈī ȸ�� ���� ����
 *  ���� : ������ȣ, ����
 *  ���� : ����-�뵵 / SUV-ž�°����ο� / Truck-�뷮
 */

class Vehicle {
	//������ ����
	public Vehicle(String cn, int price) {
		this.cn = cn;
		this.price = price;
	}
	
	// ���� ����
	private String cn;
	private int price;
	
	// private�̴ϱ� getter, setter ����
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// ��¿� �޼ҵ� ����, ���ϰ� ������ֱ�
	public String toString() {
		return "������ȣ: " + cn + " / ����: " + price + "��";
	}
	
}

class Sedan extends Vehicle {
	public Sedan(String cn, int price, String purpose) {
		super(cn,price);
		this.purpose = purpose;
	}
	private String purpose;

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String toString() {
		return super.toString() + " / �뵵: " + purpose;
	}
}

class SUV extends Vehicle {
	public SUV(String cn, int price, int volume) {
		super(cn,price);
		this.volume = volume;
	}
	private int volume;
	
	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String toString() {
		return super.toString() + " / ž�°����ο�: " + volume + "��";
	}
}

class Truck extends Vehicle {
	public Truck(String cn, int price, int capacity) {
		super(cn,price);
		this.capacity = capacity;
	}
	private int capacity;
	
	public String toString() {
		return super.toString() + " / ����뷮: " + capacity + "t";
	}
}

public class RentcarTest {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("��1234",1000000000,"��ǥ����");
		SUV suv = new SUV("��1111",50000000,6);
		Truck truck = new Truck("��5678",70000000,2);
		
		System.out.println(sedan.toString());
		System.out.println(suv.toString());
		System.out.println(truck.toString());
		
	}
}
