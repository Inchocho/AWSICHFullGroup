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
//	속성(property) - 멤버변수(member variable), 특성(attribute), 필드, 상태	
//	기능(function) - 메서드(method), 함수(function), 행위
	
	
	String color = "";
	boolean power = false;
	int channel = 0;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel = channel + 1;
	}
}
