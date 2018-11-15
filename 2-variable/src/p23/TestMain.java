package p23;

public class TestMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 0;
		
		/*
		 * x의 y의 값을 서로 교환하고 싶어요. 임시로 값을 보관하는 다른 변수가 하나 더 필요하다.
		 */
		
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
		
		// 변수를 사용하여 연산을 수행하면 변수가 가리키는 박스의 값을 사용하여 연산을 처리한다.
		z = x;
		
		// 교환작업 : x와 y의 값을 서로 교환하고 싶어요.
		// x 박스의 값을 덮어쓰기해서 소실하기 전에 다른 변수에 보관해야 한다.
		z = x;
		
		x = y;
		
		y = z;
		
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
	}

}
