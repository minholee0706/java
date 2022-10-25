package day18_1025;
import java.util.Arrays;
import java.util.Scanner;
public class array_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("몇개짜리 배열을 생성할까요? :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0;
		int[] arr = new int[a];
		
		for (i=0; i<a; i++) {
			System.out.print("arr["+i+"]= ");
			int b = sc.nextInt();
			
			arr[i] = b;

		}System.out.println(Arrays.toString(arr));
			
		
		
	}

}
