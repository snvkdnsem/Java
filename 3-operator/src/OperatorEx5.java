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
		int x = c / 2;// int / int 인 경우 정수형은 소수점 부분을 그냥 버린다.
		double y = c / 2.0;// int / double
		
		System.out.println(x);
		System.out.println(y);
		
		//int result = 3 / 0; // 정수를 0으로 나눌 수 없다.(그래서 오류가 뜬다)
		double result = 3.0 / 0; // 정수를 0으로 나눌 수 없다.(그래서 오류가 뜬다)
		System.out.println(result); // 무한한 값이 나온다.(infinity)
	}
}
