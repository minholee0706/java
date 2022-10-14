package day10_c1;
import java.util.Scanner;
public class c4_quiz8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개를 표시할까요 : ");
		int no = sc.nextInt();
		while(no>0) {
			if(no%2==0) {
					System.out.print("+");
				no--;
			}
			if(no%2==1) {
				System.out.print("*");
				no--;
			}
			

		}
				
	}
}


