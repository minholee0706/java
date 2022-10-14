package day10_c1;

import java.util.Scanner;

public class c6_for_quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기호문자 '*'를 나열해서 n단의 정방형을 표시하는 프로그램을 작성하자
		
		System.out.println("정방향을 표시합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("단수는 : ");
		int k = sc.nextInt();
		for (int i=0; i<k; i++) {
			for (int j = 0; j <k; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}