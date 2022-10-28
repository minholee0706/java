package day20_1027;

import java.util.ArrayList;

public class ThreadrunExam extends Thread {
	
	int seq;
	
	public ThreadrunExam(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		
		// 쓰레드 시작
		System.out.println(this.seq + "thread start.");
		try {
			Thread.sleep(2000); // 1초
		}catch (Exception e) {
			
		}
		System.out.println(this.seq + "thread end.");
		// 쓰레드 끝
	}


	public static void main(String[] args) {
		
		ArrayList<Thread> threads = new ArrayList<>();
		for(int i = 0; i < 10; i++) { // 총 10개의 쓰레드를 생성
			
			Thread t = new ThreadrunExam(i);
			t.start();
			threads.add(t);
		}
		for(int i = 0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("최종 종료");
		
		
	}

}
