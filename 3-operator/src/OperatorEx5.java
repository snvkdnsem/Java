class OperatorEx5 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n",  a, b, a + b);
		System.out.printf("%d - %d = %d\n",  a, b, a - b);
		System.out.printf("%d * %d = %d\n",  a, b, a * b);
		System.out.printf("%d / %d = %d\n",  a, b, a / b);
		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);
		
		int c = 3;
		int x = c / 2;// int / int �� ��� �������� �Ҽ��� �κ��� �׳� ������.
		double y = c / 2.0;// int / double
		
		System.out.println(x);
		System.out.println(y);
		
		//int result = 3 / 0; // ������ 0���� ���� �� ����.(�׷��� ������ ���)
		double result = 3.0 / 0; // ������ 0���� ���� �� ����.(�׷��� ������ ���)
		System.out.println(result); // ������ ���� ���´�.(infinity)
	}
}