package Exception_exam;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c;
		
		try {
		 c = 4 / 0;
		}catch(ArithmeticException e) {
			c= -1;
			System.out.println(c);
		}
		
	}

}
