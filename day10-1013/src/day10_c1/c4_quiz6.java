package day10_c1;
import java.util.Scanner;
public class c4_quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("카운트다운 합니다.");
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.print("양의 정숫값 : ");
			a = sc.nextInt();
		}while(a <= 0);
			
		while(a >= 0) {
			System.out.println(a);
			a--;
		}
		System.out.println("x값이 " + a + "이 됐습니다.");
	} 
} 


