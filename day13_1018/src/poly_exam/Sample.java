package poly_exam;

public class Sample {

	public static void main(String[] args) {
		// 동물원..
		
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Bouncer bouncer = new Bouncer();
		
	
		bouncer.bark(lion);
	}

}
