package interface_ex;

public class WashingMachineTest {

	public static void main(String[] args) {
		LgWashingMachine lg = new LgWashingMachine();
		lg.startButton();
		System.out.println("세탁기의 속도는 " 
				+ lg.changeSpeed(3));
		lg.dry();		
	}
}
