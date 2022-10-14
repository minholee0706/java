package day11_1014;
public class C4_Method_V {
	
	int a;
	
	void varTest(C4_Method_V sample) {
		sample.a++;
	}	
	public static void main(String[] args) {
		//int a = 1;
		C4_Method_V sample = new C4_Method_V();
		
		sample.a = 1 ;
		sample.varTest(sample);
		System.out.println(sample.a);
		
	}
}
