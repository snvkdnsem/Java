package p40;

import p40.usa.President; // 아래의 p40.usa.President 붙여준다는 의미

public class TestMain {

	public static void main(String[] args) {
		// TestMain 클래스와 같은 패키지에 존재하지 않는 다른 클래스를 사용하려면
		// 해당 클래스의 패키지정보를 모두 명시해야 한다.
		p40.korea.President koreaPresident = new p40.korea.President();
		
		p40.usa.President usaPresident1 = new p40.usa.President();
		President usaPresident2 = new President();
		President usaPresident3 = new President();
		President usaPresident4 = new President();
	}

}
