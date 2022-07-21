package one;

public class TvTest3 {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		Tv tv2 = tv;
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다");
		System.out.println("tv2의 channel값은 " + tv.channel + "입니다");
		System.out.println();
		
		tv.channel = 7;
		System.out.println("tv의 channel값을 " + tv.channel 
					+ "번으로 변경하였습니다");
		System.out.println();		
		
		System.out.println("현재 채널은 " + tv.channel + "번 입니다");
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다");
		
//		tv2에 tv를 복제 (얕은복사의 개념)
//		tv2에 tv객체가 참조하고 있는 객체의 주소를 복제했다.
//		즉 tv2에 tv를 복제하고 다른 작업을 하고 싶어도 같은 객체주소를 참조하기 때문에
//		동일한 작업을 하게된다.		
		tv2 = tv;
		
		tv.channelDown();
		
//		그래서 tv의 채널을하나 내렸는데 tv의 채널은 7->6이 되었고 tv2의 채널도 6이되었다.
		System.out.println("현재 채널은 " + tv.channel + "번 입니다");
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다");
	}
}
