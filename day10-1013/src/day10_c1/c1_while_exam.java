package day10_c1;

public class c1_while_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int treehit = 0;
		while (treehit < 10)//조건식이 탈출 지점
			{
			treehit++; 
			//동일표현 treehit = treehit+1; / treehit += 1;
			System.out.println("나무를" + treehit + "번 찍었습니다.");
			
		}
	}

}
