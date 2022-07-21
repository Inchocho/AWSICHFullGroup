package one;

public class TvTest4 {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		Tv tv2 = new Tv();
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다");
		System.out.println("tv2의 channel값은 " + tv.channel + "입니다");
		System.out.println();
		
		tv.channel = 7;
		System.out.println("tv의 channel값을 " + tv.channel 
					+ "번으로 변경하였습니다");
		System.out.println();		
		
		System.out.println("현재 채널은 " + tv.channel + "번 입니다");
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다");
		
//		tv2에 tv를 복제
//		tv2에 tv객체가 참조하고 있는 객체의 주소를 복제했다.			
		
		tv2.channel = tv.channel;
		tv2.power = tv.power;
		tv2.color = tv.color;
		
		tv.channelDown();
		
//		그래서 tv의 채널을하나 내렸는데 tv의 채널은 7->6이 되었고 tv2의 채널도 6이되었다.
		System.out.println("현재 채널은 " + tv.channel + "번 입니다");
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다");
	}
}
