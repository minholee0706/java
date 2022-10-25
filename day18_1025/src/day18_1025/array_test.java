package day18_1025;

import java.util.Arrays;

public class array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		
//		arr[0] = 50;
//		arr[1] = 60;
//		arr[2] = 70;
//		arr[3] = 80;
//		arr[4] = 90;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i +"] = " + arr[i]);
//			
//		}
//		
		int[] score = new int[] {50,60,70,80,90};
		// []안에 갯수를 넣으면 안된다.
		
		//더 간단한 방법
		int[] arr= {10,20,30,40,50};
		
		System.out.println(Arrays.toString(score));
		System.out.println(score);
	}

}
