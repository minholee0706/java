package day18_1025;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,20,30,40,50};
		int[] tmp = new int[arr.length*2];
		
//		for(int i = 0; i < arr.length; i++) {
//			tmp[i] = arr[i]; 
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(tmp));
//		
//		arr = tmp;
//		
//		System.out.println(Arrays.toString(arr));	
		System.arraycopy(arr,0 ,tmp,0 ,5);
		System.out.println(Arrays.toString(tmp));
	}

}
