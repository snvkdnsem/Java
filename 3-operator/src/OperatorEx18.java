class OperatorEx18 {
	
	public static void main(String args[]) { 
		
		double pi = 3.141592;
		
		// round(3.141592, ��°�ڸ����� �ݿø�)
		System.out.println(java.lang.Math.round(pi));
		System.out.println(java.lang.Math.round(pi*10) / (double)10); // �Ʒ� double shorPi�� ���� ǥ���̴�.
		System.out.println(java.lang.Math.round(pi*100) / (double)100);
		System.out.println(java.lang.Math.round(pi*1000) / (double)1000);
		System.out.println(java.lang.Math.round(pi*10000) / (double)10000);
		
		double shortPi = java.lang.Math.round(pi * 1000) / 1000.0;

		System.out.println(shortPi);
	}
}