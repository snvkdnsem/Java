class OperatorEx21 {
	public static void main(String args[]) { 
		System.out.printf("10 == 10.0f  \t %b\n", 10==10.0f);
		System.out.printf("'0'== 0      \t %b\n", '0'== 0);
		System.out.printf("'\\0'== 0    \t %b\n", '\0'== 0);
		System.out.printf("'A'== 65     \t %b\n", 'A'== 65);
		System.out.printf("'A' > 'B'    \t %b\n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
		
		
		System.out.println('B' >= 'A'+1); // 왼쪽이 오른쪽보다 크면 true, 왼쪽이 오른쪽과 같으면 true
	}
}
