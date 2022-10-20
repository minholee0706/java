package Exception_exam;

public class ThrowExam {
	
	public void sayNick(String nick) {
	if("fool".equals(nick)) {
		
		throw new FoolException(); // 에러를 강제로 발생 시킴
	}
	System.out.println("당신의 별명은" + nick + "입니다.");
	}
	public static void main(String[] args) {
		ThrowExam sample = new ThrowExam();
		sample.sayNick("fool");
		sample.sayNick("genious");
	}

}

