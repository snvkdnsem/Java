package p23;

public class TestMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 0;
		
		/*
		 * x�� y�� ���� ���� ��ȯ�ϰ� �;��. �ӽ÷� ���� �����ϴ� �ٸ� ������ �ϳ� �� �ʿ��ϴ�.
		 */
		
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
		
		// ������ ����Ͽ� ������ �����ϸ� ������ ����Ű�� �ڽ��� ���� ����Ͽ� ������ ó���Ѵ�.
		z = x;
		
		// ��ȯ�۾� : x�� y�� ���� ���� ��ȯ�ϰ� �;��.
		// x �ڽ��� ���� ������ؼ� �ҽ��ϱ� ���� �ٸ� ������ �����ؾ� �Ѵ�.
		z = x;
		
		x = y;
		
		y = z;
		
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
	}

}
