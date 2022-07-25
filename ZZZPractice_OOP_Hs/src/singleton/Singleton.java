package singleton;

public class Singleton {

	private static Singleton one;	//접근제어자:private, static 제어자(클래스 생성시 한번만), 싱글톤클래스 타입 변수 one
	
	private Singleton() {	//생성자(default 생성자) --> 기본생성자를 private를 접근제어자 선언(즉 생성자로 생성불가하게 막음)
		
	}
	
	public static Singleton getInstance() {	//static 메소드 public접근제어자 -> 싱글톤클래스타입의 getInstance 메소드 생성
		if(one == null) {			//Singleton타입 변수 one이 null이면 
			one = new Singleton();	//Singleton new연산자를 통해 생성자 호출 --> 즉 한번만 생성자를 만듬
		}
		return one;					//null이아니면 one을 반환 즉 getInstance()를 통해 만든 객체는 하나임 
	}
}
