package one;

public class TvTest {

	public static void main(String[] args) {
		
//		클래스명 변수명;			//클래스의 객체를 참조하기 위한 참조변수를 선언
//		변수명 = new 클래스명();	//클래스의 객체를 생성 후,
								//객체의 주소를 참조변수(변수명)에 저장한다.
		
		Tv tv;			//Tv클래스 타입의 참조변수 tv를 선언		
		tv = new Tv();	//new Tv(); --> Tv인스턴스(instance)를 생성 (인스턴스화)
						//생성된 Tv 인스턴스의 주소를   
						//tv = --> tv에 저장
						//인스턴스화 객체가 메모리에 할당되어 실제 사용될 때 ‘인스턴스’라고 부른다.
						//객체 또한 클래스의 인스턴스이다.
//		인스턴스화
//		참조변수 new를 통해 만들어진 변수들은 모두 .을 통해서만 작업을 할 수 있다.
				
		tv.power();
		tv.channel = 25;
		
		tv.channelDown();
		
		System.out.println("현재 채널은 " + tv.channel + "번 입니다.");
		
		tv.changeChannel(11);
		
		System.out.println("현재 채널은 " + tv.channel + "번 입니다.");
	}
}
