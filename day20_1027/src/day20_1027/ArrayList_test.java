package day20_1027;

import java.util.ArrayList;

public class ArrayList_test {

	public static void main(String[] args) {
		// Generics를 String으로 설정하면 숫자는 넣을 수 없다.
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Orange");
		arr1.add("Cherry");
		arr1.add(10);
		System.out.println(arr1);
		

		// Generics를 Integer로 설정하면 문자는 넣을 수 없다.
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add("Orange");
		arr2.add("Cherry");
		arr2.add(10);
		System.out.println(arr2);
	
	}

}
