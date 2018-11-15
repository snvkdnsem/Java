
public class Test {
 public static void main(String[] args) {
	 System.out.println(Car.name); // Car.java에 static으로 등록되어 있어서 사용 가능하다.
	 // Car 클래스를 열어서 그 안에 name을 사용한다.
	 // Car 클래스가 갖고 있는 변수 name을 사용한다.
	 
	 // 1.static 키워드를 Car # color 변수에 붙인다.
	 // System.out.println(Car.color);
	 
	 // 2.color 멤버변수를 메모리에 로드하기 위해서 그 변수를 갖고 있는 클래스를 객체로 만든다. new Car()
	 Car car = new Car();
	 System.out.println(car.color);
 }
}
