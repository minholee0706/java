package day11_1014;

public class c3_method_type_exam {

	
	// 입출력이 모두 있는 메서드
	int inputout(int a, int b) {
		return a*b;
	}
	// 입출력이 모두 없는 메서드
	void noinout() {
		System.out.println("환영합니다.");
		}
	
	// 입력은 없고 출력은 있는 메서드
	int noinput() {
		return 15;
	}
	
	// 입력은 있고 출력은 없는 메서드
	
	void yesinput(String name) {
		System.out.println(name + "님 환영합니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입출력이 모두 있는 메서드
		c3_method_type_exam test = new c3_method_type_exam();
		System.out.println(test.inputout(2, 5));
		
		
		//입출력이 모두 없는 메서드
		test.noinout();
		
		//입력은 없고 출력은 있는 메서드
		System.out.println(test.noinput());
		
		//입력은 있고 출력은 없는 메서드
		test.yesinput("이민호");
	}

}
