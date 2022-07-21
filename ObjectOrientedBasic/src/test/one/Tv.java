package test.one;

public class Tv {

	String color = "";
	int channel = 0;
	String name = "";
	boolean power = false;
	
	void power() {
		power = !power;
	}

	void channelChange(int a) {
		channel = a;
		System.out.println(name + "의 현재 채널은 " + channel + "번 입니다.");
	}
	
	void channelCheck() {
		System.out.println(name + "의 현재 채널은 " + channel + "번 입니다.");
	}
	
	void channelUp() {	// 채널을 올리는 기능
		channel = channel + 1;
		System.out.println(name + "의 현재 채널은 " + channel + "번 입니다.");
	}
	
	void channelDown() {  //채널을 낮추는 기능 메소드
		channel = channel + -1;
		System.out.println(name + "의 현재 채널은 " + channel + "번 입니다.");
	}	

}
