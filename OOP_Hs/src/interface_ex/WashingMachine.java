package interface_ex;

public interface WashingMachine {
	
//	메소드를 정의한다(구현은 클래스에서)
//	인터페이스는 인터페이스의 메소드를 반드시 구현해야 하는 "강제성"을 갖는다

	public void startButton();

	public void pauseButton();

	public void stopButton();

	public int changeSpeed(int speed);
}
