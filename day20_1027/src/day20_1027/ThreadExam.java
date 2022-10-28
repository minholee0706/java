package day20_1027;

public class ThreadExam extends Thread {

	public void run() {
		System.out.println("thread run.");
	}
	public static void main(String[] args) {

		ThreadExam sample = new ThreadExam();
		sample.start(); // start()로 쓰레드를 실행한다.
		
		

	}

}
