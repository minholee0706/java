package day10_c1;

public class c1_while_continue_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		while(true) {
			a++;
			if(a %2 ==0) {
				continue; // 짝수인 경우 다시 while로 돌아간다.
			}
			System.out.println(a); // 홀수만 무한 출력하게 된다.
		}
	}

}
