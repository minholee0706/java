package day9_1012;

public class IF_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 7000;
		boolean card = true;
		
		if(money >= 5000) {
			System.out.println("택시 타자");
		}else if(money >= 1000) {
			System.out.println("버스 타자");
		}else {
			System.out.println("걸어가렴");
		}
			
		
	}
	

}
//1000원 은 넘으면