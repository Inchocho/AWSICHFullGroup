package four;

public class CarTest2 {

	public static void main(String[] args) {

		Car2 car = new Car2(); //생성자 명시 안한경우 기본생성자를 자바컴파일러가 생성하므로 에러가 안났던것이다. 
		Car2 car2 = new Car2(5);	
		Car2 car3 = new Car2("문자");

	}

}
