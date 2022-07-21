package two;

public class MyMathTest {

//	f3 : 선언된 곳으로 찾아간다 MyMath()에서 f3 누르면 MyMath 클래스로 이동됨
//	alt + <- : 이전 작업하던 파일로 이동
//	alt + -> : 앞으로 작업하던 파일로 이동	

	public static void main(String[] args) {

		MyMath myMath = new MyMath();
		
//		void 메서드의 사용처?
//		설정관련(예를 들어 게임에서 setting), 연산을 다른것과 연계할 필요가 없을 때

		myMath.add(1, 5);   // 인자(argument) 1,5를 add메소드로 전달한다
							// add메소드의 매개변수에(int x , int y )순서대로 
							// 인자 1,5가 전달된다 (x = 1, y = 5)
							// 메소드가 실행된다.

	}
}
