package p24;// �ټ��� Ŭ������ �ϳ��� ���� ū �ڽ�, ���������� �����̸� �ڹٴ� ��Ű����� �θ���.

class Car {
	String name = "Sonata"; // ������� : Ŭ���� �ڽ��� ���� ���� �ִ� ���� 
	String color = "black";
	
	void run() {
		String weather = "����"; // �������� : �޼ҵ� �ڽ��� ���� �ִ� ����
		System.out.println("���� �����δ�.");
	}
	
	void openDoor(Client client) {
		System.out.println("���� ������ �մ��� ź��. �մ��� �̸� = " + client.name);
	}

}
