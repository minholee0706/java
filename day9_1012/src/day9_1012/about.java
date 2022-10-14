package day9_1012;

public class about {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// QUIZ1
		int a = 80; // 변수 a에 점수 80을 할당
		int b = 75; // 변수 b에 점수 75를 할당
		int c = 55; // 변수 c에 점수 55을 할당
		int sum = a + b + c; // 변수 sum에 abc의 합 
		String name = "홍길동";
		System.out.println(name + "님의 평균점수는 " + sum/3 +"점 입니다.");
		
		
		System.out.println("--------------------------------------------------");
		
		
		//QUIZ2
		// 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 알아보자
		// % -  홀수, 짝수, 배수
		int i = 13;
		if(i %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
			
		System.out.println("--------------------------------------------------");
		
		
		//QUIZ3
		//1234567890을 두번 출력하는 프로그램을 작성
		// 출력문을 두 개 사용하고 각각 출력문은 문자열과 정수를 출력한다.
		
		String num = "1234567890";
		int num1 = 1234567890;
		
		System.out.println(num);
		System.out.println(num1);
		
		// 윈도우에서 한줄을 그래도 밑으로 복사하는 키 win+alt+방향키 
		
		
		//QUIZ4
		// 내 정답
		System.out.println("파이썬도 배우고\n자바도 배우면 \n난 천재인가!");
		
		// 선생님 정답
		System.out.println("파이썬도 배우고\n"
							+"자바도 배우면 \n"
							+"난 천재인가!");
		//
		String str = "자바도 배우고";
		System.out.printf("홍길동님은 %s%n",str);
		// 다른 정답
		System.out.printf("%s%n%s%n%s","자바도 배우고","파이썬도 배우면","난 천재인가!");
	
	}
	

}
