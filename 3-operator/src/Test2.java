//import 자동 추가 단축키 : ctrl + shift + o
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 콘솔로 숫자를 1개 받는다.
		
		//짝수, 홀수 여부를 콘솔에 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : ");
		
		String number = scan.nextLine();
		
		System.out.println("입력한 숫자 = " + number);
		
		// 짝수, 홀수 여부를 콘솔에 출력한다.
		
		int num = Integer.parseInt(number);
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
