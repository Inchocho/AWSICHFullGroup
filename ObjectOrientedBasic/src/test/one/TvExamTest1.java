package test.one;

public class TvExamTest1 {

	public static void main(String[] args) {

//		Tv를 2개 만든다
//		
//		하나의 Tv는 0에서 시작해서 채널을 높이는 메서드를 활용해서
//		3까지 증가시킨다
//		
//		두번째 Tv는 11번 채널로 직접 지정하여 6번 채널까지 
//		메서드를 활용하여 출력한다

		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		tv1.name = "1번 Tv";
		tv1.channelCheck();

		for (int i = 1; i < 4; i++) {
			tv1.channelUp();
		}

		tv2.name = "2번 Tv";
		tv2.channel = 11;
		tv2.channelCheck();

		for (int i = 1; i < 6; i++) {
			tv2.channelDown();
		}

		// 3번째 Tv는 첫번째 Tv1를 복제해서 만듬
		// 3번째 Tv의 파워를 켰을경우 Tv1의 파워의 상태는 어떤지?

		Tv tv3;

//		얕은 복사(shallow copy) 복제의 개념 copy 
//		객체가 참조하고 있는 객체의 주소만 복소
//		얕은 복사의 경우 주소 값을 복사하기 때문에, 참조하고 있는 실제값은 같다.
//		Tv tv3 = new Tv();
//		tv3 = tv1;
//		원본과 복제본이 같은 객체를 공유

		tv3 = tv1;
		tv3.power();
		System.out.println("tv1의 전원: " + tv1.power);
		System.out.println("tv3의 전원: " + tv3.power);
		tv3.channelUp();
		System.out.println("tv1의 채널: " + tv1.channel);
		System.out.println("tv3의의 채널: " + tv3.channel);
		tv1.channelUp();
		System.out.println("tv1의 채널: " + tv1.channel);
		System.out.println("tv3의의 채널: " + tv3.channel);

		System.out.println(tv1 == tv3);

//		얕은 복제가 된것을 확인하는 법 -> tv1의 주소와 tv3의 주소가 같다.
		System.out.println(tv1);
		System.out.println(tv3);

	}
}
