// C언어의 구조체(Structure) : 여러 값을 모아서 하나로 사용하는 방법
// 자바 클래스에서 속성만 정의해서 사용하는 것과 같다.
public class TV {
	
	//속성(값, 상태)
	String 크기 = "10x5m";
	String 길이 = "10m";
	String 높이 = "5m";
	String 색상 = "하얀색";
	
	//기능(동작, 행위)
	public void 켜기() {
		System.out.println("TV가 켜진다.");
	}
	
	public void 끄기() {
		System.out.println("TV가 꺼진다.");
	}
	
	public void 채널변경하기() {
		System.out.println("TV 채널이 바뀐다.");
	}
}
