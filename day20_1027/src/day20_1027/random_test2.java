package day20_1027;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;

public class random_test2 {

		public static void main(String[] args) {
			HashSet<Integer> set = new HashSet<>();
			
			while(set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
			}
			
			System.out.println(set);
		}
}
