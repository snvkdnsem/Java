import java.util.*; // Scanner클래스를 사용하기 위해 추가

class FlowEx2 {
	public static void main(String[] args) {  
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		}

		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다."); // if의 중괄호 대신 세미콜론 찍힌곳까지 활동 영역		
			System.out.println("입력하신 숫자는 "+ input +"입니다."); // 위에 조건과 상관없이 그냥 나오는것이다.
	
			some();
			
	} // main의 끝
	
	static void some() {
		if(true) { // 항상 true 이니깐 굳이 if를 안써도 된다.
			System.out.println("Hello");
		}
		
		if(true) {
			System.out.println("World!");
		}
	}
}
