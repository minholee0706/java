package day10_c1;

public class c6_foreach_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] score = {90, 80, 90, 100, 70};
		
		for (int i = 0; i <score.length; i++) {
				System.out.print(score[i]+" ");
			}
		System.out.println();
		
		for (int j : score) {
			System.out.print(j+" ");
			// 인덱스에서 바로 뽑아 내기때문에 언제나 쓰이진 않음
			
		}
	}

}
