package day10_c1;

import java.util.Scanner;

public class c2_quiz4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		do {
		System.out.print("세 자리의 정숫값 : ");
		 a = sc.nextInt();
		}while(a < 100 || a >999);{		
			System.out.println("입력한 값은" + a + "입니다");
		}
	}
}
