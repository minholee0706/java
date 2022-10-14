package day10_c1;

public class c5_exam_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {90, 80, 90, 100, 70};
		
		for (int i = 0; i <score.length; i++) {
			if (score[i] >= 90 ) {
				System.out.println((i+1) + "번 학생은 합격입니다.");
			}
		}
	}

}
