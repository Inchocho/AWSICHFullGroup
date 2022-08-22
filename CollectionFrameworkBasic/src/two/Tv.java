package two;

public class Tv {

	public String color = "";
	public boolean power = false;
	public int channel = 0;

	void power() { // TV를 키거나 끄는 기능
		power = !power;
	}

	void channelUp() { // 채널을 올리는 기능
		channel = channel + 1;
	}

	void channelDown() { // 채널을 낮추는 기능 메소드
		channel = channel + -1;
	}

}
