package interface_ex;

public class LgWashingMachine implements WashingMachine, dryCouse {

//	implements(구현) -> 인터페이스를 구현한다.
//	인터페이스에 정의해놓은 메소드(뼈대)를 기능을 반드시 구현해야 한다.
//	오버라이딩(Override)
//	인터페이스는 인터페이스의 메소드를 반드시 구현해야 하는 "강제성"을 갖는다

	@Override
	public void startButton() {
		System.out.println("세탁기가 빨래를 시작");
	}

	@Override
	public void pauseButton() {
		System.out.println("세탁기가 빨래를 일시중지");
	}

	@Override
	public void stopButton() {
		System.out.println("세탁기가 빨래를 정지");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch (speed) {
		case 1:
			rtnSpeed = 20;
			break;

		case 2:
			rtnSpeed = 50;
			break;

		case 3:
			rtnSpeed = 100;
			break;

		}

		return rtnSpeed;
	}

	@Override
	public void dry() {
		System.out.println("건조 시작합니다.");
	}

	@Override
	public void checkPrice(int price) {
		System.out.println("가격: " + price +"원");
		
	}

}
