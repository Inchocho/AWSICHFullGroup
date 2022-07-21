package one;

public class Tv {
	
//	Tv란?
//			
//	속성: 크기, 길이, 높이, 색상, 볼륨, 채널등
//	기능: 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 높이기 등
//	
//	객체는 속성과 기능 두 종류의 구성요소로 이루어져 있으며
//	일반적으로 객체는 다수의 속성과 다수의 기능을 갖는다
//	
//	속성(property) - 멤버변수(member variable)-(멤버변수에서 클래스변수와 인스턴스변수로 나뉨), 특성(attribute), 필드, 상태	
//	기능(function) - 메서드(method), 함수(function), 행위
	
	
	String color = "";
	boolean power = false;
	int channel = 0;
	
	void power() {	//TV를 키거나 끄는 기능
		power = !power;
	}
	
	void channelUp() {	// 채널을 올리는 기능
		channel = channel + 1;
	}
	
	void channelDown() {  //채널을 낮추는 기능 메소드
		channel = channel + -1;
	}
	
	void changeChannel(int a) {
		channel = a;
	}
	 
	public static void main(String[] args) {
//		new 연산자를 통해 Tv라는 클래스타입인 
//		color,power,channel의 객체변수와
//		channelUp,Down,changeChannel() 메소드를 가진 객체(인스턴스)가 생성된다.
		Tv tv = new Tv();
		tv.power();
		tv.channel  = 25;
		tv.channelUp();
	}
	
	
}

