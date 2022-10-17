package day12_1017;

public class HouseDog extends Dog{ 
	// Dog과 Dog위에 animal을 상속받는다.
	
	HouseDog(String name){
		this.setName(name);
	}
	HouseDog(){
		
	}
	
	HouseDog(int type){
		if(type == 1) {
			this.setName("yorkshire");
		}else if (type == 2)
			this.setName("bulldog");
		
	}
	
	void sleep() {
		System.out.println(this.name + " zzZ in house"); 
		// 부모의 기능이 마음에 안들면 새로이 만들어서 method overriding
		// 새로운걸 덮어씌우기
		}
	void sleep(int hour) {
		System.out.println(this.name + " zzZ in house for "
				+ hour + " hours");
	}

	// 인수에 따라서 출력이 달라짐
	// 아무인수 없이 출력하면 위에 sleep, 인수를 입력하면 아래의 sleep을 출력
}
