class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println("'");
		System.out.println('\'');		     //  '''처럼 할 수 없다.
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
		System.out.println('\n');		     //  개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");	 //  큰따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");
		
		System.out.println("111");
		System.out.println("\n"); // 줄 띄우기
		System.out.println("111");
	}
}
/*
boolean : true / false
int : 정수
double : 실수
String : 문자열
*/