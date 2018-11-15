package p20;

public class VarEx1 {
	
// 들여쓰기 : 코드 가독성을 향상시키기 위해서 사용한다.
// 1. 키보드 Tab
// 2. 스페이스 키
	
	// 기동 메소드 : 자바 프로그램의 시작을 담당한다. 메소드의 정의가 미리 정해져 있다.
	public static void main(String[] args) {
		// 프로그램 코드의 처리순서
		// 위에서부터 한 줄씩 아래로 처리된다.
		// 할당연산자를 기준으로 오른쪽부터 처리하고 후에 왼쪽이 처리된다.
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);

	}

}
