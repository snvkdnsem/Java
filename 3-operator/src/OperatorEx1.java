class OperatorEx1 {
	
	public static void main(String args[]) {
		
		int i=5; // 4byte�� ��� �ڽ��� i��� �̸��� ��� 5�� ���� �־��.
		System.out.println(i);
		
		i = i + 1;
		System.out.println(i);
		
		i++; // i=i+1;�� ���� �ǹ��̴�. ++i;�� �ٲ� �ᵵ ����� ����. ��ó�� ������
		System.out.println(i);

		i=5; //	����� ���ϱ� ���� i���� �ٽ� 5�� ����.
		++i; // i=i+1;�� ���� �ǹ��̴�. ��ó�� ������
		System.out.println(i);
	}
}
