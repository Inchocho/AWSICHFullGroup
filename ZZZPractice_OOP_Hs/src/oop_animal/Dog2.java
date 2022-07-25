package oop_animal;

//추상클래스 Predator2의 예제
//기존 인터페이스처럼 추상클래스의 메소드는 반드시 구현해야한다 + 추상클래스를 상속(extends)받을경우
//추상클래스 Predator2에서 생성한 메소드또한 사용 할 수 있다.
public class Dog2 extends Predator2 implements Barkable{

//	추상클래스의 메소드를 구현할경우 접근제어자 public명시필요없음
//	추상메소드의 경우도 반드시 구현은 해야됨 인터페이스와 동일
	@Override
	String getFood() {
		return "food";
	}
	
//	implements한 인터페이스 메소드 기능을 구현
//	인터페이스
//	접근이 용이하도록 public 접근제어자를 무조건 기본
	@Override
	public void bark() {
		System.out.println("왕왕Dog2 추상클래스 연습");
	}

	
}
