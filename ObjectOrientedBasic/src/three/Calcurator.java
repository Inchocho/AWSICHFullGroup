package three;

public class Calcurator {

//	오버로딩(overloading)
//	오버로딩이란 메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 
//	구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다
//	
//	그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을
//	가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면,
//	같은 이름을 사용해서 메서드를 정의할 수 있다
//	
//	요약: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
//	을 메서드 오버로딩 또는 간단히 오버로딩(overloading)이라 한다
//	
//	오버로딩의 조건
//	1.메서드 이름이 같아야 한다
//	2.매개변수의 개수 또는 타입이 달라야 한다
//	
//	반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다
//	
//	오버로딩의 장점
//	1.메서드의 이름만 보고도 같은 기능을 하겠구나 쉽게 예측이 가능
//	2.메서드 이름을 절약
//	3.메서드 이름 짓는데 고민을 덜 수 있다
//	4.동일한 메서드중 매개변수 타입에 맞는 메서드를 알아서 적용시켜준다(println 메서드를 참조 println(공백,정수,실수,문자열,배열등) - F3 눌러보면암)	

	int add(int x, int y) {
		int result = 0;

		result = x + y;
		System.out.println("int add(int x, int y)");

		return result;
	}

	int add(int x, long y) {
		long result = 0;

		result = x + y;
		System.out.println("long add(int x, long y)");

		return (int) result;
	}

	int add(long x, int y) {
		long result = 0;

		result = x + y;
		System.out.println("long add(long x, int y)");

		return (int) result;
	}

	int add(long x, long y) {
		long result = 0;

		result = x + y;
		System.out.println("long add(long x, long y)");

		return (int) result;
	}

	int sub(int x, int y) {
		int result = 0;

		result = x - y;
		System.out.println("int sub(int x, int y)");

		return result;
	}

	int sub(int x, long y) {
		long result = 0;

		result = x - y;
		System.out.println("long sub(int x, long y)");

		return (int) result;
	}

	int sub(long x, int y) {
		long result = 0;

		result = x - y;
		System.out.println("long sub(long x, int y)");

		return (int) result;
	}

	int sub(long x, long y) {
		long result = 0;

		result = x - y;
		System.out.println("long sub(long x, long y)");

		return (int) result;
	}

	int mul(int x, int y) {
		int result = 0;

		result = x * y;
		System.out.println("int mul(int x, int y)");

		return result;
	}

	int mul(int x, long y) {
		long result = 0;

		result = x * y;
		System.out.println("long mul(int x, long y)");

		return (int) result;
	}

	int mul(long x, int y) {
		long result = 0;

		result = x * y;
		System.out.println("long mul(long x, int y)");

		return (int) result;
	}

	int mul(long x, long y) {
		long result = 0;

		result = x * y;
		System.out.println("long mul(long x, long y)");

		return (int) result;
	}

	int div(int x, int y) {
		int result = 0;

		result = x / y;
		System.out.println("int div(int x, int y)");

		return result;
	}

	int div(int x, long y) {
		long result = 0;

		result = x / y;
		System.out.println("long div(int x, long y)");

		return (int) result;
	}

	int div(long x, int y) {
		long result = 0;

		result = x / y;
		System.out.println("long div(long x, int y)");

		return (int) result;
	}

	int div(long x, long y) {
		long result = 0;

		result = x / y;
		System.out.println("long div(long x, long y)");

		return (int) result;
	}

}
