package two;

public class MyMathTest2 {

//	f3 : 선언된 곳으로 찾아간다 MyMath()에서 f3 누르면 MyMath 클래스로 이동됨
//	alt + <- : 이전 작업하던 파일로 이동
//	alt + -> : 앞으로 작업하던 파일로 이동	

	public static void main(String[] args) {

		MyMath2 myMath2 = new MyMath2();

		int result = 0;

		//add메소드를 호출하기위해서 result변수를 만들었고 result변수에 대입함
		
//		리턴타입이 있는 메서드의 사용처
//		안에 내용을 좀더 활용할 필요가 있는 경우 사용, 활용, 출력, 확인	
		result = myMath2.add(10, 5);

		System.out.println("두 수를 더한 결과: " + result);		//구현부
		
		double rr = 0.0;
		
		rr = myMath2.divide(10, 3); // <-- double타입 rslt값을 리턴으로 받는다.
		
		System.out.println("두 수를 더한 결과: " + rr);				
		
//		리턴타입이 있는 메서드의 경우 다른 메서드의 인수로 전달해서 매개변수로 사용가능하다
		rr= myMath2.divide2(result, 3);
		
		System.out.println("두 수를 더한 결과: " + rr);

	}
}
