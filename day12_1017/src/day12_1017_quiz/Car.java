package day12_1017_quiz;

public class Car {
	
	private String name; // private 변수들의 접근제어자
	private int width;	 // private은 가장 강력해서 
	private int height;  // 이 클래스 안에서만 접근할 수 있도록 함
	private int length;	 // 외부에서 변경할 수 없도록 (보안) 
	private double x;
	private double y;
	private double fuel;
	
	
	
	public Car(String name, int width, int height, int length, double x, double y, double fuel) {
		// car라는 메서드의 public이라는 접근제어자
		// public : 어느 누구나 호출할 수 있다.
		// 이곳을 통해서 위 private을 가져다 씀. 생성할때만.
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = x;
		this.y = y;
		this.fuel = fuel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// 변수에 값을 넣어주는게 setter , 넣어준 값을 가져오는게 getter
	
	// 자동차 사양 표시 메서드
	public void putSpec() {
		System.out.println("이름 : "+ name);
		System.out.println("전폭 : "+ width);
		System.out.println("전고 : "+ height);
		System.out.println("전장 : "+ length);
		
	}

}

// /* ... */
/*/* ... //*/
/* ..... //*/
/*//... */


