class OperatorEx18 {
	
	public static void main(String args[]) { 
		
		double pi = 3.141592;
		
		// round(3.141592, 몇째자리에서 반올림)
		System.out.println(java.lang.Math.round(pi));
		System.out.println(java.lang.Math.round(pi*10) / (double)10); // 아래 double shorPi와 같은 표현이다.
		System.out.println(java.lang.Math.round(pi*100) / (double)100);
		System.out.println(java.lang.Math.round(pi*1000) / (double)1000);
		System.out.println(java.lang.Math.round(pi*10000) / (double)10000);
		
		double shortPi = java.lang.Math.round(pi * 1000) / 1000.0;

		System.out.println(shortPi);
	}
}
