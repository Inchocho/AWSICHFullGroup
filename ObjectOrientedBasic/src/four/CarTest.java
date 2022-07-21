package four;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();

//		이렇게 인스턴스변수를 직접 입력해주는 경우 (1) 이경우는 변수를 변경한것이다.
		car.color = "흰색";
		car.gearType = "auto";
		car.door = 4;

//		생성자는 클래스가 new 표현식에 의해 인스턴스화되어 객체를 생성할 때 객체의 레퍼런스를 생성하기 전에 객체의 초기화를 위해 사용되는 코드의 블록이다 
//		생성자 = 인스턴스변수를 초기화하는 메서드이다. 즉 지금까지 인스턴스화 클래스의 객체를 만드는 -> new 클래스타입(); 이게 생성자 메서드였다
//		매개변수가 있는 생성자(값이 할당된 채로 객체를 생성함) (2) 매개변수를 통해 인스턴스변수를 사용자가 원하는 값으로 초기화 한것이다.
//		매개변수에 초기값을 정해서 초기화를 한다. (사용자가 원하는 값을 초기화한다)
		Car newCar = new Car("red", "manual", 4);		
		Car customCar = new Car("검은색", "자동", "미국", "자랑용", 120000000);		
		Car customCar2 = new Car("금색", "수동", "독일", 30, 5000);
			
		System.out.println("car의 색상: " + car.color + "\n" 
					+ "car의 기어타입: " + car.gearType + "\n"
					+ "car의 문의갯수: " + car.door);
		System.out.println();

		System.out.println("newCar의 색상: " + newCar.color + "\n" 
					+ "newCar의 기어타입: " + newCar.gearType + "\n"  
					+ "newCar의 문의갯수: " + newCar.door);
		System.out.println();
		
		System.out.println("customCar의 색상: " + customCar.color + "\n" 
				+ "customCar의 기어타입: " + customCar.gearType + "\n"  
				+ "customCar의 국적: " + customCar.country + "\n"
				+ "customCar의 용도: " + customCar.role + "\n" 
				+ "customCar의 가격: " + customCar.price + "원");
		
		System.out.println();
		
		System.out.println("customCar2의 색상: " + customCar2.color + "\n" 
				+ "customCar2의 기어타입: " + customCar2.gearType + "\n"  
				+ "customCar2의 국적: " + customCar2.country + "\n"
				+ "customCar2의 문: " + customCar2.door + "\n" 
				+ "customCar2의 가격: " + customCar2.price);				
	
		
	}

}
