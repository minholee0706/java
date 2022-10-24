package test;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i = 0;
		int[] arr = {13,15,16,17,8};
		
		for(i=0; i<=arr.length; i++) {		
		if(arr[i] == 13) {
			System.out.println("찾는 값은"+ (i+1) + "번째에 있습니다.");
			
			}else if(arr[i] !=13) {
				System.out.println("찾으시는 값이 존재하지 않습니다.");
				break;
			}
			
		}
	}
}
