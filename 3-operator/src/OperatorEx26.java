import java.util.Scanner;

class OperatorEx26 {
	public static void main(String[] args) { 
		int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d%n", a, b);
		
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		
		System.out.printf("a=%d, b=%d\n", a, b);
		
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		
		System.out.printf("a=%d, b=%d%n", a, b);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���������� �Է��ϼ���.");
		int eng = scan.nextInt();
		
		System.out.print("���������� �Է��ϼ���.");
		int math = scan.nextInt();
		
		if(eng >= 90 && math >= 90) {
			System.out.println("A");
		}else if(eng >= 80 && math >= 80) {
			System.out.println("B");
		}else if(eng >= 70 && math >= 70) {
			System.out.println("C");
		}
		
		System.out.println(3/0 > 2); // ������ ���
		
		System.out.println(10 > 3 || 3/0 > 2); // true or�̴ϱ� �տ��� true���� �����⶧��
	} // main�� ��
}