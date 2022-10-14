package day10_c1;
import java.util.Scanner;
public class c7_for_quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는 : ");
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for(int i = 1; i <= k; i++) {
			
			
			for(int j = 1 ; j<= k-i; j++) {
				System.out.print("-");
			
			}
			for (int m = 1 ; m <= 2*i-1 ; m++) {
			System.out.print("*");
			}
			System.out.println();
//			for(;k >i ;)
//			System.out.println("*");		}
//	}
		}
	}
}