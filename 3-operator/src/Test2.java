//import �ڵ� �߰� ����Ű : ctrl + shift + o
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// �ַܼ� ���ڸ� 1�� �޴´�.
		
		//¦��, Ȧ�� ���θ� �ֿܼ� ����Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ��� : ");
		
		String number = scan.nextLine();
		
		System.out.println("�Է��� ���� = " + number);
		
		// ¦��, Ȧ�� ���θ� �ֿܼ� ����Ѵ�.
		
		int num = Integer.parseInt(number);
		
		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}

}