// java.util ��Ű�� �ؿ� �����ϴ� *(���) Ŭ�������� �� Ŭ����(ScannerEx)���� ����Ҷ�
// ��Ű������ �����ϰ� Ŭ���������� ª�� ����� �� �ְ� �����.
import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx {
	public static void main(String[] args) { // �޼ҵ念�� =�Ķ����+���������� ����~��
		Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
	} 
}