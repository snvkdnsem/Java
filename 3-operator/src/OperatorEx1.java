class OperatorEx1 {
	
	public static void main(String args[]) {
		
		int i=5; // 4byte를 담는 박스에 i라는 이름을 지어서 5를 집어 넣어라.
		System.out.println(i);
		
		i = i + 1;
		System.out.println(i);
		
		i++; // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다. 후처리 증감식
		System.out.println(i);

		i=5; //	결과를 비교하기 위해 i값을 다시 5로 변경.
		++i; // i=i+1;과 같은 의미이다. 전처리 증감식
		System.out.println(i);
	}
}
