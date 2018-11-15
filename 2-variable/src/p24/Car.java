package p24;// 다수의 클래스를 하나로 묶는 큰 박스, 물리적으로 폴더이며 자바는 패키지라고 부른다.

class Car {
	String name = "Sonata"; // 멤버변수 : 클래스 박스가 직접 갖고 있는 변수 
	String color = "black";
	
	void run() {
		String weather = "맑음"; // 지역변수 : 메소드 박스가 갖고 있는 변수
		System.out.println("차가 움직인다.");
	}
	
	void openDoor(Client client) {
		System.out.println("문이 열리고 손님이 탄다. 손님의 이름 = " + client.name);
	}

}
