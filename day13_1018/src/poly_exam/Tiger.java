package poly_exam;

public class Tiger extends Animal implements Barkable, Predator{
//extends 상속, implements 구현
	
	public String getFood() {
		return "apple";
	}
	
	public void bark()	{
		System.out.println("어흥");}
	
}
