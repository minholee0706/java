package Interface2;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		
		cal.plus(3,6);
		cal.multiple(3,9);
		int x = cal.exec(8, 5);
		System.out.println(x);
		
		Calculator.exec2(4, 5);
	}

}
