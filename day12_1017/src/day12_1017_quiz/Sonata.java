package day12_1017_quiz;

public class Sonata extends Car{
	
	
		
	private double totalMileage;

	public Sonata(String name, int width, int height, int length, double x, double y, double fuel,
			double totalMileage) {
		super(name, width, height, length, x, y, fuel);
		this.totalMileage = 0.0;
	}
	// 기록된 마일리지를 확인
	public double getTotalMileage() {
		return totalMileage;
	}
	
	// 마일리지를 기록
	public void setTotalMileage(double totalMileage) {
		this.totalMileage = totalMileage;
	}
	
	// 생성자
	
	
	
}
