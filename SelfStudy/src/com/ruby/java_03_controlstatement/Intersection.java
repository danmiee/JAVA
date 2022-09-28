package com.ruby.java_03_controlstatement;

public class Intersection {

	public static void main(String[] args) {

		/*
		 * �ΰ��� ������ǥ�� �־����� �� �� ������ �������� ���϶�
		 * ������ǥ : (x1,y1)-(x2,y2) / (x3,y3)-(x4,y4)
		 * ������ǥ : (x,y)
		 * [case]
		 * 1. ���Ⱑ ����
		 * 	- y������ ���� : ��ġ > same line
		 * 	- y������ �ٸ��� : ����ġ > parallel lines
		 * 2. ���Ⱑ �ٸ���
		 *  - 1������ ������ > (x,y) ���ϱ�
		 */

		float x1,y1,x2,y2,x3,y3,x4,y4;
		x1 = 0; y1 = 0; x2 = 1; y2 = 1;
		x3 = 0; y3 = 1; x4 = 1; y4 = 3;
		
		if ( ((y2-y1)/(x2-x1)) == ((y4-y3)/(x4-x3)) ) {
			if((y1-(((y2-y1)/(x2-x1))*x1)) == (y3-((y4-y3)/(x4-x3))*x3)) {
				System.out.println("same line");
			} else {
				System.out.println("parallel lines");
			}
		} else {
			float x,y;
			x = (((x3-x4)*((x1*y2)-(y1*x2)))-((x1-x2)*((x3*y4)-(y3*x4))))
					/(((x1-x2)*(y3-y4))-((y1-y2)*(x3-x4)));
			y = (((y3-y4)*((x1*y2)-(y1*x2)))-((y1-y2)*((x3*y4)-(y3*x4))))
					/(((x1-x2)*(y3-y4))-((y1-y2)*(x3-x4)));
			System.out.printf("������ǥ : (%.0f,%.0f)",x,y);
		}
		
	}

}


