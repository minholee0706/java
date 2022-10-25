package day18_1025;

import java.util.Arrays;
import java.util.Scanner;

public class array_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("사람 수 :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		int max = 0;
		System.out.println("점수를 입력하세요.");
		
		
		for(int i = 0; i < a; i++) {
			System.out.print((i+1)+"번의 점수:");
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계는" + sum + "입니다.");
		System.out.println("평균은" + (double)(sum/a) + "입니다.");
		System.out.println("최고점은" + max + "입니다.");
		
	}

}
