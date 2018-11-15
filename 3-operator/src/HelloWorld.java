
public class HelloWorld {
	// 클래스가 직접 갖고 있는 멤버변수의 메모리 로드 시점은
	// 클래스가 인스턴스화 되어 객체가 될때 같이 메모리에 로드된다.
	static String title = "Hello World!";

	// 메소드가 실행되기 위해서는 메소드가 소프트웨어 코드로 작동하기 위해서 미리 메모리에 로드되어야 한다.
	// static : 
	// static 키워드가 붙어 있는 변수, 메소드를 프로그램 시작 전 (기동메소드 전) 자동으로 메모리에 로드 하여
	// 실행될 수 있도록 준비한다.
	// 같은 클래스의 다수의 변수와 다수의 메소드가 있을때 static 키워드가 붙어 있는 변수, 메소드만 단독으로 메모리에 로드된다.
	public static void main(String[] args) {
		// Cannot make a static reference to the non-static field(멤버변수) title
		// main 메소드는 static 키워드를 붙여서 메모리에 할당되고 사용할 수 있으나
		// main 메소드 내에서 사용하려는 title 변수는 static 키워드가 붙어 있지 않으므로
		// 메모리에 할당되어 있지 않고 따라서 사용할 수 없다.
		// static 키워드가 붙어 있는 메소드에서 static 키워드가 붙어 있지 않는 변수를 참조 할 수 없다.
		System.out.println(title);
		
		// public final static PrintStream out = null;
		
		new HelloWorld();
	}

}
