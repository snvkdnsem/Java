package p24;

public class TestMain {

	public static void main(String[] args) {
		// new Car(); car 설계도를 사용하여 새 객체를 만든다.
		// 객체는 Heap 메모리영역에 만들어 진다.
		// ()메소드, 파랑색 변수
		Car car = new Car();
		
		Client client = new Client();
		client.name = "일지매";
		
		car.openDoor(client);
		car.run();

	}

}
