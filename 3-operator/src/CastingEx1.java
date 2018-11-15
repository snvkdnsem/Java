class CastingEx1 {
	public static void main(String[] args) {
		double d  = 85.4;
		
		// int < float < double
		// 정수보다 실수형의 범위가 크다.
		// 정수끼리는 바이트 사이즈가 큰 놈이 크다.
		// 실수끼리는 바이트 사이즈가 큰 놈이 크다.
		int score = (int)d;// 개발자가 알고 있으니 크기가 작아도 넣어라.

		System.out.println("score="+score);
		System.out.println("d="+d);
	}
}
