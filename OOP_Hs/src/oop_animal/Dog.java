package oop_animal;

public class Dog extends Animal implements Predator {

	String dogType = "믹스견";

//	default생성자
//	생성자를 따로 명시하지않을경우 자바컴파일러가 자동으로 생성해준다
//	생성자를 명시할경우 자동생성되지않음
//	생성자를 만들때는 클래스명과 동일해야하고 
//	매개변수의 타입,갯수가 차이나야하며 리턴타입이 없다.
//	Object 클래스를 제외한 모든 클래스의 생성자는 첫 줄에는
//	생성자, this() 또는 super()를 호출해야 한다
//	명시 안할경우 super()가 묵시적으로 호출된다
	Dog() {

	}

//	생성자 오버라이딩
	Dog(String dogType, String name) {
		this.name = name;
		this.dogType = dogType;
	}
	
//	생성자 오버로딩,오버라이딩
	Dog(String dogType, String name, int price) {
		this.name = name;
		this.dogType = dogType;
		this.price = price;
	}

	void setType(String type) {
		this.dogType = type;
	}

//	메소드 오버라이딩
//	부모클래스의 메소드를 재정의
//	메소드의 이름과 리턴타입,매개변수타입이 같아야한다
	void setName(String name) {
		this.name = "견종: " + dogType + name;
	}

//	메소드 오버로딩 + 오버라이딩
//	메소드 오버로딩은 리턴타입은 영향없고
//	매개변수의 타입이나 갯수가 달라야한다
	void setName(String name, String nick) {
		this.name = name;
		this.nick = nick;
	}
	
//	메소드 오버라이딩
	void Sleep() {
		System.out.println(name +"는 개 입니다."+ "zzz");
	}
	
	public void getFood() {
		System.out.println("강아지고기");
	}
}
