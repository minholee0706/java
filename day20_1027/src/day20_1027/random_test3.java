package day20_1027;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class random_test3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int a = sc.nextInt();
		int i;
		
		for(i = 0; i < a; i++) {
			int  j= rand.nextInt(10);
			arr.add(j);			
			System.out.println("a["+ i +"]= " + arr.get(i));
		} 
		
		

	}

}
