
public class Test {
 public static void main(String[] args) {
	 System.out.println(Car.name); // Car.java�� static���� ��ϵǾ� �־ ��� �����ϴ�.
	 // Car Ŭ������ ��� �� �ȿ� name�� ����Ѵ�.
	 // Car Ŭ������ ���� �ִ� ���� name�� ����Ѵ�.
	 
	 // 1.static Ű���带 Car # color ������ ���δ�.
	 // System.out.println(Car.color);
	 
	 // 2.color ��������� �޸𸮿� �ε��ϱ� ���ؼ� �� ������ ���� �ִ� Ŭ������ ��ü�� �����. new Car()
	 Car car = new Car();
	 System.out.println(car.color);
 }
}
