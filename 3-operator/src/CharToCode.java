class CharToCode { 
	public static void main(String[] args) {
		// ����� ���� ���ڷ� ��������� �������� ������ �����Ҷ��� ���ڷ� ����Ѵ�.
		char a = 65;
		System.out.println(a);
		char b = 'A';
		System.out.println(b);
		char c = 'A'+1;
		System.out.println(c);
		
		char ch = 'A';	     // char ch = 65;         
		int code = (int)ch;  // ch�� ����� ���� intŸ������ ��ȯ�Ͽ� �����Ѵ�.

		System.out.printf("%c=%d(%#X)%n", ch, code, code); 

		char hch = '��';     // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	} 
} 
