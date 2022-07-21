package one;

//Time 클래스 파일과 비교하면 객체지향적인것과 아닌것의 차이를 인지 할 수 있다.
public class UnObjectTime {

	public static void main(String[] args) {

		int hour1;
		int minute1;
		int second1;
		
		int usaHour;
		int usaMinute;
		int usaSecond;		
		
		hour1 = 15;
		minute1 = 50;
		second1 = 33;
		
		usaHour = 1;
		usaMinute = 10;
		usaSecond = 20;
		
		System.out.println("한국 현재시간: " +  hour1 + "시" 
				+ minute1 + "분" 
				+ second1 + "초");
		
		System.out.println("미국 현재시간: " +  usaHour + "시" 
				+ usaMinute + "분" 
				+ usaSecond + "초");		

	}
}
