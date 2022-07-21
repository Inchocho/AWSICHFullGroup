package one;

public class TvTest2 {

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
	}
}
