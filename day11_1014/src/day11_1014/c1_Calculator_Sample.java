package day11_1014;

class c1_Calculator1 {

	 int result = 0;
	 int add(int num) {
		
		result += num;
		return result;
	}
	 int sub(int num) {
		 result -= num;
		 return result;
	 }
}

public class c1_Calculator_Sample {

	public static void main(String[] args) {
		
		c1_Calculator1 cal1 = new c1_Calculator1();
		c1_Calculator1 cal2 = new c1_Calculator1();
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		System.out.println();
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(2));
	}

}
