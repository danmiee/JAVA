package edu;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		90���̻�=A / 80���̻�=B / 70���̻�=C / 60���̻�=D / �׿�=F

		int score = 90;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}
