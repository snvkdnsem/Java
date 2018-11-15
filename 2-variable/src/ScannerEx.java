// java.util 패키지 밑에 존재하는 *(모든) 클래스들을 이 클래스(ScannerEx)에서 사용할때
// 패키지명은 생략하고 클래스명만으로 짧게 사용할 수 있게 만든다.
import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerEx {
	public static void main(String[] args) { // 메소드영역 =파라미터+범위연산자 시작~끝
		Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
	} 
}