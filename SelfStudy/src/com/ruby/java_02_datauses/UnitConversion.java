package com.ruby.java_02_datauses;

import java.util.Scanner;

public class UnitConversion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt()*60;
		int y = x*60;
		int z = y*1224;
		
		System.out.printf("�м� : %dkm/m\n"
				+"�ü� : %dkm/h\n"
				+"���� : %dmach",x,y,z);
		
		in.close();
	}
}
