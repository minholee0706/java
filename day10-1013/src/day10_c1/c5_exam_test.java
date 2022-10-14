package day10_c1;

public class c5_exam_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		for (int i = 0; i <= 10; i++) {
//			
//			System.out.println("hi"+ i);
//			
//			
//		}
		
//		String[] numbers = {"one","two","three"};
//		
//		for (int i = 0; i<=2; i++)
//		System.out.println(numbers[i]);
		
		int[] score = {90,80,90,100,70};
		
		int sum=0, avg=0;
		
		for (int i = 0; i<= score.length ; i++) {
			sum = sum + score[i];
		}
		System.out.println("총점수는 "+ sum+"점 입니다.");
		avg= sum/score.length ;
		System.out.println("평균점수는 "+ avg +"점 입니다");
	}

}
