package modi;

public class sample {
	private String secret;
	private String getSecret() {
		return this.secret;
		
		//secret 변수와 getSecret메서드는
		// 오직 sample 안에서만 접근하여 사용할 수 있다.
	}
}
