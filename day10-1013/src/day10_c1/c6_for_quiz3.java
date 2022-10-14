package day10_c1;

import java.util.Scanner;

public class c6_for_quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성하자.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다. n값 : ");
		int j = sc.nextInt();
		int sum =0 ;
		//System.out.print("1부터 n까지의 합을 구합니다. n값 : ");
		for (int i=0; i<=j; i++) {
			sum = sum + i;
		}System.out.println("1부터 n까지의 합은 " + sum +"입니다");
	}

}
