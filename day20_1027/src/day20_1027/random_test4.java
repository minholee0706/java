package day20_1027;
import java.util.*;
public class random_test4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++) {
			arr.add(rand.nextInt(45));
		}
		System.out.println(arr);

	}

}
