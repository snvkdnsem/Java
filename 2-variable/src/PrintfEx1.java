class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;
		
		long oct = 077; // 8����
		
		// 10���� : 0,1,2...9
		// 16���� : 0,1,2...9,A,B,C,D,E,F
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8���� 10, 10�����δ� 8
		int hexNum = 0x10;      // 16���� 10, 10�����δ� 16
		int binNum = 0b10;      //  2���� 10, 10�����δ� 2
		
		System.out.println("��� �ٹٲ� ����"); //ln�� �� �ٲ۴ٴ� �ǹ�
		System.out.print("��� �ٹٲ� ����");
		System.out.println("��� �ٹٲ� ����");

		// �ڷ����� ���� ��ġ������ ����, Ư����ȣ�� ����� �� �ִ�.
		// %d ����(decimal), %n �ٹٲ�, %c char��
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'�� ���λ�(16���� 0x, 8���� 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);   
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		int x1 = 1;
		int x2 = 2;
		int x3 = 3;
		
		System.out.println("x1:"+x1+" x2:"+x2+" x3:"+x3);
		System.out.printf("x1:%d x2:%d x3:%d", x1, x2, x3);
		System.out.println();
		System.out.println("Done");
	}
}