package day10_c1;
import java.util.Scanner;
public class c7_for_quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 :");
		
		
		int m1= sc.nextInt();
		for (int i = 0; i < m1; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		
	}

}
