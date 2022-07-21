package test.two;

public class CalTest2 {

//	f3 : 선언된 곳으로 찾아간다 MyMath()에서 f3 누르면 MyMath 클래스로 이동됨
//	alt + <- : 이전 작업하던 파일로 이동
//	alt + -> : 앞으로 작업하던 파일로 이동	

	public static void main(String[] args) {

		Calculator2 myMath2 = new Calculator2();

		int result = 0;
		double rr = 0.0;

		// add메소드를 호출하기위해서 result변수를 만들었고 result변수에 대입함
		result = myMath2.add(10, 5);

		System.out.println("두 수를 더한 결과: " + result); // 구현부

		rr = myMath2.divide(10, 3); // <-- double타입 rslt값을 리턴으로 받는다.

		System.out.println("두 수를 나눈 결과: " + rr);

		rr = myMath2.divide2(10, 3);

		System.out.println("두 수를 나눈 결과: " + rr);
		
//		새로운 변수를 만들어서 사용할 필요없이 기존의 같은 타입인 변수에 값을 담으면 된다.
//		변수(int result = 0)에 특징은 값이 변하는거니까
//		int subResult = 0; 이렇게 따로 만들어서 사용하기보다는

		result = myMath2.sub(10, 5);

		System.out.println("두 수를 뺀 결과: " + result);

		result = myMath2.mul(10, 5);

		System.out.println("두 수를 곱한 결과: " + result);

	}
}
