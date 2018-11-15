package p28;

public class TestMain {

	public static void main(String[] args) {
		// 박스의 크기, 박스에 담을 수 있는 데이터의 종류를 한정한다.
		
		boolean isGood = true; // boolean에는 true or false 둘중 하나만, 1byte(8bit)
		isGood = false;
		
		char letter = 'a'; // char은 1글자만 저장이 가능하다. 싱글쿼테이션으로 선언해야 한다.
		
		// 아래 4개는 정수만 취급한다.
		byte veryInt = 1; // 1byte
		short smallInt = 2; // 2byte
		int integer = 3; // 4byte,  -21억~21억까지 담을 수 있다.
		long bifInt = 4; // 8byte
		
		// 아래 2개는 실수를 취급한다.
		float f = 3.14F; // 4byte, 8바이드 크기의 long 자료형보다 4바이트 크기의 float 자료형의 박스가 더 큰 숫자를 담는다.
		double d = 3.14; // 8byte
		
		//literal : 원래 약속된 대로 사용하는 값
	}

}