package test;

public class sumarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		int[] arr = {12,13,11,14,15};
		
		for (i=0; i<=arr.length; i++) {
		if(i<=4) {
			sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
