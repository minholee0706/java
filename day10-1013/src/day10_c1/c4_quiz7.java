package day10_c1;
import java.util.Scanner;
public class c4_quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		System.out.print("몇 개의 *를 표시할까요?: ");
		a = sc.nextInt();
		}while(a<=0);
		
		while(a>0){
			System.out.print("*");
			a--;
		}
		System.out.println();
	}

}
