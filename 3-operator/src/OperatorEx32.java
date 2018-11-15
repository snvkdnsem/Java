class OperatorEx32 {
	public static void main(String args[]) {
		int ssn = 1;
		boolean condition =  true;
		
		if (ssn==1) {
			// 조건이 true면 이 영역안에 코드를 수행한다.
			System.out.println("남성");
		} else {
			// 조건이 false 면 이 영역안에 코드를 수행한다.
			System.out.println("여성");
		}
		
		//if~else 구문을 삼항연산자로 치환해서 표현할 수 있다.
		System.out.println(ssn == 1 ? "남성" : "여성");// 위 if~else와 같은 문구이다. true이면 2항, false이면 3항
		
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		// 삼항연산자
		// 1항 ? 2항 : 3항
		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("y=%c%d\n", signY, absY);
		System.out.printf("z=%c%d\n", signZ, absZ);
	}
}
