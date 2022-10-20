package Exception_exam;

public class Sample {

	public void shouldBeRun() {
		System.out.println("Thanks..");
	}
		
	public static void main(String [] args) {
		Sample sample = new Sample();
		
		int c;
		
		try {
			c = 4 / 2;
		}catch(ArithmeticException e) {
			c = -1;
		} finally {
		sample.shouldBeRun();
		}
		
		System.out.println(c);
		
	}

}
