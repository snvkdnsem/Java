package p23;

public class EntryBot {
	// 변수 : 특정 시각에 보관하고 있는 값
	static int postionBot = 0;
	static int positionfBag = 3;
	// 시작하기
	public static void main(String[] args) {
		moveRight();
		moveRight();
		moveRight();
		
		int result = multiflyBy2(3);
		
		System.out.println("result = " + result);
	}
	
	// 리턴자료형 메소드명()
	// 메소드 : 여러 코드를 수행할 수 있다. 변수의 값을 변경할 수 있다.(수학의 함수라 보면된다)
	static void moveRight() {
		System.out.println("오른쪽으로 1칸 움직인다.");
		postionBot = postionBot + 1;
		if(postionBot == positionfBag) {
			System.out.println("성공");;
		}
	}
	static int multiflyBy2(int x) {
		int y = x * 2;
		return y;
	}
}
