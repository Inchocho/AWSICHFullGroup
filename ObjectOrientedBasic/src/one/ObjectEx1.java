package one;

public class ObjectEx1 {
	public int add(int x, int y) {
		return x + y;		
	}
	public int mul(int x, int y) {
		return x*y;
	}

	public static void main(String[] args) {

//		객체지향언어

//		특징
//		1. 코드의 재사용성이 높다
//		새로운 코드를 작성할 때 기존의 코드를 이용하여 쉽게 작성할 수 있다
//		2. 코드의 관리가 용이하다
//		코드간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다
//		3. 신뢰성이 높은 프로그래밍을 가능하게 한다
//		제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 하며,
//		코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수 있다

//		: 코드의 재사용성이 높고 유지보수가 용이하다
//		
//		주의사항: 너무 객체지향에 얽매여서 고민하기 보다는
//		일단 프로그램을 기능적으로 완성한 다음
//		어떻게 하면 보다 객체지향적으로 코드를 개선할 수 있을지를
//		고민하여 점차 개선해 나가는 것이 좋다

//		클래스와 객체
//		
//		-클래스의 정의 
//		클래스란? 객체를 정의해 놓은 것이다.
//				
//		-클래스의 용도(붕어빵틀)
//		클래스는 객체를 생성하는데 사용된다

//		-객체의 사전적인 의미: 실제로 존재하는 것

//		-개념이나 논리와 같은 무형적인 것들도 객체로 간주한다
//		
//		-객체의 정의
//		실제로 존재하는 것. 사물 또는 개념
//		-객체의 용도(붕어빵)
//		객체가 가지고 있는 기능과 속성에 따라 다름
//		
//		-유형의 객체
//		책상, 의자, 자동차, TV와 같은 사물
//		-무형의 객체
//		수학공식, 프로그램 에러와 같은 논리나 개념

//		-클래스는 객체의 설계도 또는 틀 이라고 정의 할 수 있다

//		객체지향 인스턴스(객체) + 메소드사용		
		ObjectEx1 sum = new ObjectEx1();
		sum.add(2, 3);
		System.out.println(sum.add(2, 3));
		sum.mul(2, 3);
		System.out.println(sum.add(2, 3));
	}
}
