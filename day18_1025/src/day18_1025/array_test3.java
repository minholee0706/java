package day18_1025;

import java.util.Arrays;

public class array_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = { {1,2,3}, {4,5,6}};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j <=arr.length; j++) {
				System.out.println("arr["+i+"]["+j+"]=" + arr[i][j]);
			}
			
				
		}System.out.println(Arrays.deepToString(arr));
	}

}
