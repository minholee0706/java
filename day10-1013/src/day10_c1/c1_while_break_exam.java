package day10_c1;

public class c1_while_break_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coffee = 10;
		while(true) {
			System.out.println("돈을 받아서 커피를 드립니다");
			coffee --; //동일 표현 coffee = coffee - 1;, coffee -= 1;
			System.out.println("남은 커피의 양은 "+ coffee +"입니다");
			
			if(coffee == 0) {
				System.out.println("커피 품절, 판매를 중지합니다");
				break;
			}
		}
	}

}
