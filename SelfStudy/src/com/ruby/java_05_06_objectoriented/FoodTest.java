package com.ruby.java_05_06_objectoriented;

class food {
	
	public void toString(String name, int price) {
		System.out.println(
				"Food { " + "name: " + name + ", "
				+ "price: " + price + "�� }");
	}
}

public class FoodTest {
	
	public static void main(String[] args) {
		food f = new food();
		f.toString("ġŲ",18000);
		f.toString("����",28000);
	}

}
