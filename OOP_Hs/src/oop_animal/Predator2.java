package oop_animal;

public abstract class Predator2 extends Animal {

//	※ 추상 클래스는 일반 클래스와는 달리 단독으로 객체를 생성할 수 없다. 반드시 추상 클래스를 상속한 실제 클래스를 통해서만 객체를 생성할 수 있다.	
//	추상메소드의 경우 반드시 abstract를 앞에 붙여야한다(이경우 인터페이스처럼 메소드를 정의하고 구현은 상속받는 클래스에서 기능을 반드시 구현한다)
	abstract String getFood();

	void printFood() { // default 를 제거한다.
		System.out.printf("my food is %s\n", getFood());
	}

	static int LEG_COUNT = 4; // 추상 클래스의 상수는 static 선언이 필요하다.

	static int speed() {
		return LEG_COUNT * 30;
	}
}
