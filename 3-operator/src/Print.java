
public class Print {
	static int x = 2;
	int y = 3;
	
	// static 키워드
	// 프로그램 시작 전 메모리에 로드 된다.
	public static void main(String[] args) {
		System.out.println(add(x,3));
		
		Print p = new Print(); // static 남발하지 않고 이 방식으로 건장한다.
		// multiply 메소드 static 키워드가 없으므로 메모리에 로드한 후 사용해야 한다.		
		System.out.println(p.multiply(x,3));
	}
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}

}
