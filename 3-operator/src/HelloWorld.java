
public class HelloWorld {
	// Ŭ������ ���� ���� �ִ� ��������� �޸� �ε� ������
	// Ŭ������ �ν��Ͻ�ȭ �Ǿ� ��ü�� �ɶ� ���� �޸𸮿� �ε�ȴ�.
	static String title = "Hello World!";

	// �޼ҵ尡 ����Ǳ� ���ؼ��� �޼ҵ尡 ����Ʈ���� �ڵ�� �۵��ϱ� ���ؼ� �̸� �޸𸮿� �ε�Ǿ�� �Ѵ�.
	// static : 
	// static Ű���尡 �پ� �ִ� ����, �޼ҵ带 ���α׷� ���� �� (�⵿�޼ҵ� ��) �ڵ����� �޸𸮿� �ε� �Ͽ�
	// ����� �� �ֵ��� �غ��Ѵ�.
	// ���� Ŭ������ �ټ��� ������ �ټ��� �޼ҵ尡 ������ static Ű���尡 �پ� �ִ� ����, �޼ҵ常 �ܵ����� �޸𸮿� �ε�ȴ�.
	public static void main(String[] args) {
		// Cannot make a static reference to the non-static field(�������) title
		// main �޼ҵ�� static Ű���带 �ٿ��� �޸𸮿� �Ҵ�ǰ� ����� �� ������
		// main �޼ҵ� ������ ����Ϸ��� title ������ static Ű���尡 �پ� ���� �����Ƿ�
		// �޸𸮿� �Ҵ�Ǿ� ���� �ʰ� ���� ����� �� ����.
		// static Ű���尡 �پ� �ִ� �޼ҵ忡�� static Ű���尡 �پ� ���� �ʴ� ������ ���� �� �� ����.
		System.out.println(title);
		
		// public final static PrintStream out = null;
		
		new HelloWorld();
	}

}