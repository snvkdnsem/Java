package p28;

public class TestMain2 {

	public static void main(String[] args) {
		/*
		 * 숫자 리터럴의 자료형
		 * 정수로 선언하면 자동적으로 int 자료형으로 취급한다.
		 * 실수로 선언하면 자동적으로 double 자료형으로 취급한다.
		 */
		
		short x = 1; // 2byte
		
		int y = x; // 4byte, 자동형변환, 묵시적 형변환
		
		x = y; // 큰 박스의 값을 작은 박스에 옮길 때 값의 손실이 있다면 자바는 자동적으로 수행해 주지 않는다.  4byte(y)에서 2byte(x)로 변할려고 해서 오류
		
		x = (short) y; // (자료형) : 형변환연산자, 지정된 자료형으로 변환한 후 사용한다. 명시적 형변환
		
		int z = 2200000000; // 21억까지 가능
		
		double a = 0; 
		// 위 코드는 다음 코드와 의미적으로 같다. double a = (double) (int) 0;
		
		float b = 1;
		// 위 코드는 다음 코드와 의미적으로 같다. float b = (float) (int) 1;
		
		double c = 0.12;
		// 위 코드는 다음 코드와 의미적으로 같다. double c = (double) 0.12;
		
		float d = 1.0F;
		// 위 코드는 다음 코드와 의미적으로 같다. float d = (double) 1.0;
		
		float f1 = (float) 1.0;
		
		float f2 = 1.0F;
		
		long big = 100_000_000; //숫자를 읽을때 편하게 하기 위해 언더바를 넣어도된다.
	}

}