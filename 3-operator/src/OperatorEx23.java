class OperatorEx23 {
	public static void main(String[] args) {
		// ���ڿ���  new ������ ���� ������ ���� ª�� �������� ����ϴ� ���� �����Ѵ�.
		// ���� �������� ���ڿ��� �����ϰ� �õ��ϸ�
		// �ش� ���ڿ��� �̹� �޸𸮿� �����ϴ��� Ȯ���ϰ� ������ �״�� ����ϰ� ������ ���ο� ��ü�� ���� ������ �Ҵ��Ѵ�.
		// ���ڿ� �Һ�������� �����ȴ�.
		String str1 = "abc"; // <== new, abc�� ������ �ִ� ��ü�� �޸𸮿��� �ϳ��� ���� ������ �־�� ���� �ȵȴ�.
		
		String a = str1;
		String b = "abc"; // ������ ���簴ü ����
		
		// ���ڿ� ������ �� ��뼺�� �ش�ȭ�Ͽ� �޸𸮸� �Ƴ�����
		//�ش� ���ڿ��� ���� �ִ� String ��ü�� �����ϸ� �� ��ü�� �״�� ����Ѵ�.
		
		System.out.println(b.length());
		System.out.println("abc".length()); // "���ڿ�" �ϴ� �� ������ String ��ü�� �����Ѵ�.
				
		System.out.println(str1 == a);
		System.out.println(str1 == b);
		
		// String�� Ŭ�����̱� ������ ���Ѵٸ� new �����ڷ� ��ü�� ����� �� ��ü�� ���ڿ��� �����ϵ��� �� �� �ִ�.
		String str2 = new String("abc"); // new�� �߱⶧���� ���ο� ��ü�� ����(�����ؼ� �� ������)
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		
		// ���ڿ��� �������� ��ü�� ���� �ִ´�.
		// �׷��� �񱳿����� == �� �񱳸� �õ��ϸ� �̴� ���� ���� ���ϴ� ���̹Ƿ�
		// �������� �����ϴ� ���� ���ϰ��� �� �� �������� �ʴ�.
		// ������ ����Ű�� ���� ��ü�� �����ϴ� ���ڿ� ��ü�� ���ϰ��� �� �� equals �޼ҵ带 ����ؾ� �Ѵ�.
		
		System.out.println();
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); //true, 99% �̷��� ���ؾ� �ϴ� ��찡 ��κ��̴�.
		System.out.println();
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}