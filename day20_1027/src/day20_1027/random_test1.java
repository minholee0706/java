package day20_1027;

import java.util.Random;

public class random_test1 {

		public static void main(String[] args) {
			Random rand = new Random();
			
			System.out.println(rand.nextInt());
			System.out.println(rand.nextInt(10));
			System.out.println(rand.nextInt(100));
			
			System.out.println(rand.nextBoolean());
			System.out.println(rand.nextFloat());
			System.out.println(rand.nextDouble());
		}
}
