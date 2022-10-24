package test;

public class test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] arr = {1,2,3,4,5,6,7};
		int head = 0;
		int tail = arr.length;
		int center;
		int f = 9;
		
		for(i=0;i<=10;i++) {
			
		if(head <= tail) {
			
			center = (int)(head + tail) / 2;
			
			if(arr[center] == f ) {
				System.out.println((center+1) + "번째 요소가 일치합니다.");
				break;
				
			}else (head >= tail) {
				System.out.println("값을 찾을 수 없습니다.");
				break;
			}
			else {
				if(arr[center] > f) {
					tail = center - 1;
				}else { 
					head = center + 1;
					
				}
			}	
		}
	}
}
}
