package day10_c1;
import java.util.Scanner;
public class c3_quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,d; 
		
		System.out.print("정수A : ");
		a = sc.nextInt();
		System.out.print("정수B : ");
		b = sc.nextInt();
		c = Math.min(a, b);
		d = Math.max(a, b);
		while(c<=d){
			System.out.print(c+" ");
			c++;
		}
		
	}

}
