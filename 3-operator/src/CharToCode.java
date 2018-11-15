class CharToCode { 
	public static void main(String[] args) {
		// 출력할 때는 문자로 취급하지만 내부적인 연산을 수행할때는 숫자로 취급한다.
		char a = 65;
		System.out.println(a);
		char b = 'A';
		System.out.println(b);
		char c = 'A'+1;
		System.out.println(c);
		
		char ch = 'A';	     // char ch = 65;         
		int code = (int)ch;  // ch에 저장된 값을 int타입으로 변환하여 저장한다.

		System.out.printf("%c=%d(%#X)%n", ch, code, code); 

		char hch = '가';     // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	} 
} 
