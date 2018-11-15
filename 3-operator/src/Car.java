
public class Car {
	// static 키워드로 프로그램 시작 전 메모리에 로드된 자원은 프로그램 종료 전까지 메모리를 차지한다.
	// 즉, 메모리 낭비의 원인이 되므로 남용해서든 안 된다.
	// static으로 메모리에 로드하는 대상은 모든 클래스의 메소드에서 사용하는 전역자원이 그 대상이 된다.
	static String name = "Sonata"; // static이 있으면 메모리에 등록이 된다.
	String color = "Red";

}
