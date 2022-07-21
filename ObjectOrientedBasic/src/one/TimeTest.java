package one;

public class TimeTest {

	public static void main(String[] args) {
		
		Time koreaTime = new Time();
		Time usaTime = new Time();
		
		koreaTime.setHour(23);
		koreaTime.setMinute(50);
		koreaTime.setSecond(33);
		
		usaTime.setHour(1);
		usaTime.setMinute(10);
		usaTime.setSecond(20);		
		
		System.out.println("한국 현재시간: " +  koreaTime.getHour() + "시" 
				+ koreaTime.getMinute() + "분" 
				+ koreaTime.getSecond() + "초");
		
		System.out.println("미국 현재시간: " +  usaTime.getHour() + "시" 
				+ usaTime.getMinute() + "분" 
				+ usaTime.getSecond() + "초");		
	}
}
