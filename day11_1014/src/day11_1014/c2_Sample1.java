package day11_1014;

class Animal {

	String name; // 객체 변수, 인스턴스 변수, 멤버 변수
	
	public void setName(String name) {
		this.name = name; 
		
		// this 이 매서드를 호출한 그 이름이 this에 오게됌
		// 예로 this 자리에 cat이 오게됌
	}
}







public class c2_Sample1 {

	public static void main(String[] args) {
		Animal cat = new Animal(); 
		// Animal은 자료형,Animal()은 생성자
		// new는 새로운 객체를 생성 할때 사용하는 키워드
		// cat 인스턴스는 Animal 클래스로 만들었다.
		// 붕어빵 틀 = 클래스 , 붕어빵 = 객체
		
		System.out.println(cat.name);
		cat.setName("bob");
		System.out.println(cat.name);
		
		System.out.println();
		
		Animal dog = new Animal();
		System.out.println(dog.name);
		dog.setName("hong");
		System.out.println(dog);
		System.out.println(dog.name);
		
	}

}
