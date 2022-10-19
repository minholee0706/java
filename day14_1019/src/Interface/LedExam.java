package Interface;

public class LedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new LedTV();
		
		tv.turnOn();
		
		tv.changeVolume(35);
		tv.changeChannel(53);
		tv.turnOff();
	}

}
