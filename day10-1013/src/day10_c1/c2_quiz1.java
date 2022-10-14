package day10_c1;

public class c2_quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int sum = 0;
		while(a<=1000)
		{
			a++;
			if(a %3 ==0) {
				sum = sum + a;
			}
		}
				System.out.println(sum);		
	}

}
