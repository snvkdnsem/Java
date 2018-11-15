
// 클래스는 대문자로 시작한다.(관습)
// class 클래스명
public class Bye {
	
	// 매소드는 클래스안에 정의된다.(클래스 영역 밖이면 안된다.)
	// 매소드는 소문자로 시작한다.(관습)
	// 매소드는 (괄호연산자)가 필수다.(괄호 있는걸로 구분)
	
	// 매소드 작성문법
	// void		main	(String[] args)
	// 리턴자료형 매소드명(파라미터 : 받는자료형) <== 문법 : 자바는 이렇게 쓴다.
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	// 수학은 전산의 뿌리다. function, if, while, for 등에 개념들은 수학자가 만들었다.
	int proceeed(int x) {
		int result = x + 1;
		return result;
	}
}
