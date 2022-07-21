package five;

// this 설명
public class CarTest {

//	this?
//	생성자의 이름으로 ###클래스이름 대신 this를 사용한다###
//	this는 그 인스턴스의 주소이다
//	동일한 클래스 내의 다른 생성자에서 하나의 생성자를 호출하려면this 키워드를 사용
//	this 키워드를 사용하는 표현식은 생성자의 첫 번째 행

	public static void main(String[] args) {

		Car car = new Car("rainbow", "auto", 40);
		
		System.out.println("main에서 address(힙의 메모리 주소): " + car);
		

		car.carInfo();

	}
}
