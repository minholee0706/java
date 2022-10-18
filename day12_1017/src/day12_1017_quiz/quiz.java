package day12_1017_quiz;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sonata sonata = new Sonata("sonata nf", 3000, 5000, 7000, 1.0, 2.0, 15.0, 10.0);
		
		sonata.setTotalMileage(10.0);
		
		System.out.println("소나타 모델명 : " + sonata.getName());
		System.out.println("소나타 사양 : " + sonata.getWidth() + " " + sonata.getHeight());
		System.out.println("소나타 마일리지 : " + sonata.getTotalMileage());
		
		Sonata gran = new Sonata("grand", 4000, 500, 6000, 1.3, 2.2, 16.0, 10.0);
		
		sonata.setTotalMileage(10.0);
		
		System.out.println("그렌져 모델명 : " + gran.getName());
		System.out.println("그랜져 사양 : " + gran.getWidth() + " " + gran.getHeight());
		System.out.println("그랜져 마일리지 : " + gran.getTotalMileage());
		
	}

}
