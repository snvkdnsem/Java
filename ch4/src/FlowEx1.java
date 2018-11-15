class FlowEx1 {
	public static void main(String[] args) { 
		int x= 0;

		System.out.printf("x=%d 일때, 참인 것은%n", x);
		
		if (x == 0) {
			System.out.println("x==0");			
		}
		
		//조건문의 범위연산자를 생략하면 다음; 세미콜론을 만날 때까지를 범위로 삼는다.
		if(x==0) System.out.println("x==0");
		
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		System.out.println();

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
	}
}
