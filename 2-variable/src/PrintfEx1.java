class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;
		
		long oct = 077; // 8진수
		
		// 10진수 : 0,1,2...9
		// 16진수 : 0,1,2...9,A,B,C,D,E,F
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      //  2진수 10, 10진수로는 2
		
		System.out.println("출력 줄바꿈 있음"); //ln은 줄 바꾼다는 의미
		System.out.print("출력 줄바꿈 없음");
		System.out.println("출력 줄바꿈 있음");

		// 자료형에 따른 위치보유자 문법, 특수기호를 사용할 수 있다.
		// %d 숫자(decimal), %n 줄바꿈, %c char형
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);   
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		int x1 = 1;
		int x2 = 2;
		int x3 = 3;
		
		System.out.println("x1:"+x1+" x2:"+x2+" x3:"+x3);
		System.out.printf("x1:%d x2:%d x3:%d", x1, x2, x3);
		System.out.println();
		System.out.println("Done");
	}
}