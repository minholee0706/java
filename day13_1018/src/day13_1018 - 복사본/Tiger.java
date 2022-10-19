package day13_1018;

public class Tiger extends Animal implements Predator, Show{
//extends 상속, implements 구현
	
	public String getFood() {
		return "apple";
	}
	
	public String getShow() {
		return "abc";
	}
	
}
