package day11_1014;

public class c3_other_ruturn {

	void sayNick(String nick) {
		if("fool".equals(nick)) { //nick 이랑 fool이랑 같니
			return; // nick과 "fool" 이 같으면 빠져나온다.
			// void가 있지만 return의 값이 없으므로 사용
		}
		System.out.println("나의 별명은" + nick + "입니다." );
	}
		
	public static void main(String[] args) {
		c3_other_ruturn sample = new c3_other_ruturn();
		sample.sayNick("홍길동"); // nick에 홍길동을 넣는다.
		
		sample.sayNick("fool"); // nick에 fool을 넣는다.
		// "fool"이 동일하므로 그냥 빠져나가서 아무일도 일어나지 않음
		
		sample.sayNick("이민호"); // nick에 이민호을 넣는다.
		
	}

}
