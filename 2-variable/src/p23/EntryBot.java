package p23;

public class EntryBot {
	// ���� : Ư�� �ð��� �����ϰ� �ִ� ��
	static int postionBot = 0;
	static int positionfBag = 3;
	// �����ϱ�
	public static void main(String[] args) {
		moveRight();
		moveRight();
		moveRight();
		
		int result = multiflyBy2(3);
		
		System.out.println("result = " + result);
	}
	
	// �����ڷ��� �޼ҵ��()
	// �޼ҵ� : ���� �ڵ带 ������ �� �ִ�. ������ ���� ������ �� �ִ�.(������ �Լ��� ����ȴ�)
	static void moveRight() {
		System.out.println("���������� 1ĭ �����δ�.");
		postionBot = postionBot + 1;
		if(postionBot == positionfBag) {
			System.out.println("����");;
		}
	}
	static int multiflyBy2(int x) {
		int y = x * 2;
		return y;
	}
}
