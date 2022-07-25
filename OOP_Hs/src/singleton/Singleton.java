package singleton;

public class Singleton {

	private static Singleton one;	//접근제어자:private, static 제어자(클래스 생성시 한번만), 싱글톤클래스 타입 변수 one
	
	public Singleton() {	//생성자(default 생성자)
		
	}
	
	public static Singleton getInstance() {	//static 메소드
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}
}
