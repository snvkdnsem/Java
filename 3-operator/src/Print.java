
public class Print {
	static int x = 2;
	int y = 3;
	
	// static Ű����
	// ���α׷� ���� �� �޸𸮿� �ε� �ȴ�.
	public static void main(String[] args) {
		System.out.println(add(x,3));
		
		Print p = new Print(); // static �������� �ʰ� �� ������� �����Ѵ�.
		// multiply �޼ҵ� static Ű���尡 �����Ƿ� �޸𸮿� �ε��� �� ����ؾ� �Ѵ�.		
		System.out.println(p.multiply(x,3));
	}
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}

}
