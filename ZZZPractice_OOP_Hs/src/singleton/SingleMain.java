package singleton;

public class SingleMain {

	public static void main(String[] args) {
//		getInstance()메소드를 통해 만든 Singleton클래스타입 인스턴스(객체)가 한개임을 확인하기 위함
		Singleton sing = Singleton.getInstance();	//new연산자를 통해 Singleton클래스 인스턴스가 생성됨
		Singleton sing2 = Singleton.getInstance();	//one != null이므로 만들어진 인스턴스 반환
		System.out.println(sing == sing2);	// true
	}
}
