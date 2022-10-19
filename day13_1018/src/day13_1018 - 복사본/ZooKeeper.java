package day13_1018;

public class ZooKeeper {
	
	// 사육사 클래스
	
//	void feed(Tiger tiger) {
//		System.out.println("feed apple");
//		
//	}
//	
//	void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
	void feed(Predator predator) {
		System.out.println("FEED " + predator.getFood());
	}
	
	void show(Predator p) {
		System.out.println(p.getShow());
	}
	
}
