class CastingEx1 {
	public static void main(String[] args) {
		double d  = 85.4;
		
		// int < float < double
		// �������� �Ǽ����� ������ ũ��.
		// ���������� ����Ʈ ����� ū ���� ũ��.
		// �Ǽ������� ����Ʈ ����� ū ���� ũ��.
		int score = (int)d;// �����ڰ� �˰� ������ ũ�Ⱑ �۾Ƶ� �־��.

		System.out.println("score="+score);
		System.out.println("d="+d);
	}
}
