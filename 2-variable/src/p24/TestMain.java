package p24;

public class TestMain {

	public static void main(String[] args) {
		// new Car(); car ���赵�� ����Ͽ� �� ��ü�� �����.
		// ��ü�� Heap �޸𸮿����� ����� ����.
		// ()�޼ҵ�, �Ķ��� ����
		Car car = new Car();
		
		Client client = new Client();
		client.name = "������";
		
		car.openDoor(client);
		car.run();

	}

}
